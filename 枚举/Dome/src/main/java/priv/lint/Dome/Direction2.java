package priv.lint.Dome;

public abstract class Direction2 {

    public static final Direction2 TOP = new Direction2("top"){
        @Override
        public void show() {
            System.out.println("top");
        }
    };
    public static final Direction2 LEFT= new Direction2("left"){
        @Override
        public void show() {
            System.out.println("left");
        }
    };
    public static final Direction2 RIGHT = new Direction2("right"){
        @Override
        public void show() {
            System.out.println("right");
        }
    };
    public static final Direction2 END = new Direction2("end"){
        @Override
        public void show() {
            System.out.println("end");
        }
    };
    private String name;
    private Direction2(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
