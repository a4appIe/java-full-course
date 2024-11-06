public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        try {
            int j = a / 20;
            if (j == 0) {
                throw new ArithmeticException("Sorry");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
