package org.lint;




import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lint.Service.StringOperation;
import org.lint.Service.StringOperationImpr;

public class App
{
    StringOperation impr = new StringOperationImpr();

    @Test
    @DisplayName("ResAChar Test")  //显示名 (也就是这个方法的别名)
    public void stringResACharTest(){
        assert impr.resAChar(null) == null;
        assert impr.resAChar("") == null;
        assert impr.resAChar("hello").equals("h");
        assert impr.resAChar("h1elloh").equals("1");
        assert impr.resAChar("4534").equals("5");
        assert impr.resAChar("./.").equals("/");
        assert impr.resAChar("$@!@$!*").equals("*");
        assert impr.resAChar("中国").equals("中");
        assert impr.resAChar("你好你").equals("好");
        assert impr.resAChar("ge  ge g  ii  m").equals("m");
        assert impr.resAChar("adceab").equals("d");

    }




    @Test
    public void resStrTest(){
        assert impr.reverse("").equals("");
        assert impr.reverse("  ").equals("  ");
        assert impr.reverse(null) == null ;
        assert impr.reverse("12345").equals("54321");
        assert impr.reverse("hello").equals("olleh");
        assert impr.reverse("中国").equals("国中");
        assert impr.reverse("中  国").equals("国  中");
        assert impr.reverse("中国er").equals("re国中");
        assert impr.reverse("中he国").equals("国eh中");
    }

    @Test
    //@BeforeAll
    public void isEmptyTest(){
        assert impr.isEmpty("");
        assert impr.isEmpty("  ");
        assert impr.isEmpty(null);
        assert impr.isEmpty("124") == false;
        assert impr.isEmpty("abc") == false;
        assert impr.isEmpty(",./") == false;
    }

    @Test
    @Ignore
    public void rotateTest(){
        assert impr.rotate("ztringUtil").equals("mgevatHgvy");
        assert impr.rotate("Hello").equals("Uryyb");
        assert impr.rotate("StringUtil和").equals("FgevatHgvy和");
        assert impr.rotate("").equals("");
        assert impr.rotate("  ").equals( "  ");
        assert impr.rotate(null) == null;
    }
//        abcdefghijklm
//        nopqrstuvwxyz
//    public static void main( String[] args )
//    {
//        System.out.println(new StringOperationImpr().resAChar(""));
//    }
}
