package priv.lint.Dome1;

public enum Direction2 {
    TOP("首"){
        @Override
        public void show() {
            System.out.println("show");
        }
    },END("尾"){
        @Override
        public void show() {
            System.out.println("show");
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
