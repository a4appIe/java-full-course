class Print{
    public Print(){
        System.out.println("print constructor..");
    }

    public void print(){
        System.out.println("inside print..");
    }
}

class Printit extends Print{
    public Printit(){
        super();
        System.out.println("printit constructor..");
    }

    public void print(){
        System.out.println("indide printit..");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Printit print = new Printit();
        print.print();
    }
}
