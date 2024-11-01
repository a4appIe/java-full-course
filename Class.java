class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }
}

public class Class {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 9;
        Calculator calc = new Calculator();
        int res = calc.add(a, b, c);
        System.out.println("Result: " + res);
    }
}