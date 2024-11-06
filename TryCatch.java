class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}
class A {
    public void show() throws Exception{
        Class.forName("Hello");
        System.out.println("showing");
    }
}

public class TryCatch {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
