package priv.lint;

public class pcope {
    String name;

    public pcope() {
        System.out.println(1);
    }

    public pcope(String name) {
        System.out.println(2);
        this.name = name;
    }
}
class child extends pcope{
    pcope pcope;
    public child(String name){
        super();
        System.out.println(3);
        this.name = name;
        pcope = new pcope(name + ":f");
    }
}