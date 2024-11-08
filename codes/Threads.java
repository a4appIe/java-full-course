class Counter{
    int counter;
    public synchronized void increment(){
        counter++;
    }
}
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Counter cnt = new Counter();
        Runnable a = () -> {
            for (int i = 0; i < 10000; i++) {
                cnt.increment();
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 10000; i++) {
                cnt.increment();
            }
        };
        Thread c = new Thread(a);
        Thread d = new Thread(b);
        c.start();
        d.start();
        c.join();
        c.join();
        System.out.println(cnt.counter);
    }
}
