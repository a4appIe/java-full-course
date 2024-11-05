enum Laptop {
    Mac(1000), XPS(800), Lenove(1500); // objects of Status enum/class // by default are static;;;

    private int price;

    private Laptop(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}

public class Enums {
    public static void main(String[] args) {
        Laptop lap[] = Laptop.values();
        for(Laptop x: lap){
            System.out.println(x + ": $"+x.getPrice());
        }
    }
}
