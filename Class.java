class Calculator {
    public int add(int a, int b) {
        int res = a + b;
        // System.out.println("Added: " + res);
        return res;
    }
}

public class Class {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        Calculator calc = new Calculator();
        int res = calc.add(a, b);
        System.out.println("Result: " + res);
    }
}