abstract class Car {
    public abstract void drive();

    public abstract void hie();

    public abstract void fly();

    public void playMusic() {
        System.out.println("music");
    }
}

abstract class GWagon extends Car {
    public void drive() {
        System.out.println("drive");
    }

    public abstract void hie();

    public void fly() {
        System.out.println("fly");
    }
}

class U_GWagon extends GWagon {
    public void hie() {
        System.out.println("hie");
    }
}

public class Demo {
    public static void main(String[] args) {
        Car car = new U_GWagon();
        car.drive();
        car.hie();
        car.fly();
        car.playMusic();
    }
}
