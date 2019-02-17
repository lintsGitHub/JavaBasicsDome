package priv.lint;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.mchange.v2.c3p0.impl.C3P0PooledConnection;
import com.mchange.v2.c3p0.jboss.C3P0PooledDataSource;
import com.sun.org.apache.xerces.internal.impl.io.UTF8Reader;

import java.beans.PropertyVetoException;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * 将文本文件中的一个数据读取出来，然后导入数据库中
 */
public class App {
    public static void main(String[] args) {
        String path = "D:/cause.txt";
        try {
            read(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 向文本文件中去读取数据，然后写入数据库中
     * pram : path 文件路径
     * */
    public static void read(String path) throws IOException {
        List<Institution> list = new ArrayList<>();
        File file = new File(path);
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        while (bufferedReader.ready()) {
//            bufferedReader.ready() 这个方法返回一个bool值，相当于文本文件中的一个游标
//            System.out.println(bufferedReader.readLine()); 一行行读取出来
//            封装一个字符串转换成对象的方法
            list.add(changeObj(bufferedReader.readLine()));
        }
        try {
            addDatabase(list);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
    }

    static int count;
    static Institution institution;

    public static Institution changeObj(String s) {
        institution = new Institution();
        String id = s.substring(0, s.indexOf(":"));
        String name = s.substring(s.indexOf(":") + 1, s.lastIndexOf(":"));
        String parentID = s.substring(s.lastIndexOf(":") + 1);
        institution.setId(Integer.parseInt(id));
        institution.setName(name);
        int i = Integer.parseInt(id);
        if (i % 100 == 0) {
            count = i;
        }
        institution.setParentID(count);


        return institution;
    }

    /*
     * 写入数据库
     * */
    static ComboPooledDataSource comboPooledDataSource;

    public static void addDatabase(List<Institution> list) throws SQLException, PropertyVetoException {
        comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass("org.mariadb.jdbc.Driver");
        comboPooledDataSource.setJdbcUrl("jdbc:mariadb://localhost:3306/policy");
        comboPooledDataSource.setUser("root");
        comboPooledDataSource.setPassword("love1314");
        Connection connection = comboPooledDataSource.getConnection();
        Statement statement = connection.createStatement();
        for (Institution institution1 : list) {
            String sql = "insert into ge_institution values (" + institution1.getId() + ",'" + institution1.getName() + "'," + institution1.getParentID() + ")";
            statement.addBatch(sql);
        }
        statement.executeBatch();
    }

}
