class Laptop{
    String model;
    int price;
    
    public String toString(){
        return "{\n  model: " + this.model + ",\n" + "  price: " + this.price + "\n}";
    }

}

public class Objects {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.model = "Apple";
        laptop.price = 1000;
        System.out.println(laptop);
    }
}
