public class LogicalOperators {
    public static void main(String[] args) {
        int a = 1;
        int b = 8;
        boolean res = a>b && a<b;
        System.out.println(res);
        res = a>b || a<b;
        System.out.println(res);
        System.out.println(!res);
    }
}