package priv.lint.Dome;

public class Direction1 {

    public static final Direction1 TOP = new Direction1("top");
    public static final Direction1 LEFT= new Direction1("left");
    public static final Direction1 RIGHT = new Direction1("right");
    public static final Direction1 END = new Direction1("end");
    private String name;
    private Direction1(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
