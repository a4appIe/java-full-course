class Config {
    int x = 1;
    public void print(){
        System.out.println(this.x + ". Hello");
    }

    static class Hello{
        int x = 2;
        public void print(){
            System.out.println(this.x + ". Hello");
        }
    }
    
}

public class InnerClass {
    public static void main(String[] args) {
        Config config = new Config();
        // Config.Hello hello =  config.new Hello();
        Config.Hello hi = new Config.Hello();
    }
}
