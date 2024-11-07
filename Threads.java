class A implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("hi");
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("hello");
            }
        };
        Thread c = new Thread(a);
        Thread d = new Thread(b);
        c.start();
        d.start();
    }
}
