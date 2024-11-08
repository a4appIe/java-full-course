class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

public class Calculator {
public static void main(String[] args) {
    AdvCalc calc = new AdvCalc();
    int a = calc.add(3,5);
    int b = calc.sub(3,5);
    int c = calc.mul(3,5);
    int d = calc.div(3,5);
    System.out.println(a+" "+b+" "+c+" "+d);
}
}
