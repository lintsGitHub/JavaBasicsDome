package priv.lint.Dome1;

public enum Direction1 {
    TOP("首"),END("尾");

    private String name;

    private Direction1 (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
