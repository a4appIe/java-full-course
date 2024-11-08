public class DataTypes {
    public static void main(String[] args) {
        // PRIMITIVE DATA TYPES IN JAVA
        byte by = 12;
        short sh = 123;
        int in = 12324;
        long lg = 123456754l;
        char ch = 'A';
        float fl = 5.5f;
        double db = 5.6;
        boolean bl = true;

        // LITERALS
        int num = 1_00_00_000; // WILL BE TREATED AS NORMAL NUMBER AND ENRICH THE READIBILITY
        int num1 = 0b101;  // BINARY NUMBER
        int num2 = 0x8F;  // HEXADECIMAL NUMBER
        double num3 = 12e10; // 12 X 10**10
        char a = 'a';
        a++; // INCREMENTING THE CHARACTER A
        System.out.println(by);
        System.out.println(sh);
        System.out.println(in);
        System.out.println(lg);
        System.out.println(ch);
        System.out.println(fl);
        System.out.println(db);
        System.out.println(bl);
        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(a);
    }
}
