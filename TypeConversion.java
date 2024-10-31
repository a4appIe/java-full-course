public class TypeConversion {
    public static void main(String[] args) {
        // byte b = 127;
        int a = 258;
        // b = (byte) a;
        char c = 'a';
        a = (int) c;
        float fl = 12.6f;
        a = (int) fl;
        System.out.println(a);
    }
}
