class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

public class TryCatch {
    public static void main(String[] args) {
        int a = 3;
        try {
            int j = a / 20;
            if (j == 0) {
                throw new CustomException("Sorry");
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
