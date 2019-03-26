package priv.lint.Dome9;

public class StuImpl implements StuDAO {
    @Override
    public void add() {
        System.out.println("添加");
    }

    @Override
    public void delete() {
        System.out.println("删除");
    }

    @Override
    public void update() {
        System.out.println("修改");
    }

    @Override
    public void search() {
        System.out.println("查询");
    }
}
