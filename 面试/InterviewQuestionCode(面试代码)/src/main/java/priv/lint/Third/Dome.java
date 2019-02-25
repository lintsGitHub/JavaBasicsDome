package priv.lint.Third;

public class Dome {
    public static int dome (int n){
        if (n < 2)
            return n;
        return dome(n - 1) + dome(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(dome(7));
    }
}
