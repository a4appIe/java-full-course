interface A{
    int age = 40; // variables are final and static in interfaces
    String name = "Harman";
    void printName(); // methods are abstract and public in interfaces
    void printAge();
}

class Info implements A{
    public void printName(){
        System.out.println(A.name);
    }
    public void printAge(){
        System.out.println(A.age);
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A info = new Info();
        info.printName();
        info.printAge();
    }
}
