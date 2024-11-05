class Config {
    public void print(){
        System.out.println("printing..");
    };
}


public class InnerClass {
    public static void main(String[] args) {
        Config config = new Config(){
            public void print(){
                System.out.println("not printing..");
            }
        };
        config.print();
    }
}
