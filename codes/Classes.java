class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, int b) {
        return a + b;
    }
}

class Obj{
    public Obj(){
        System.out.println("object created!");
    }
    void show(){
        System.out.println("showing...");
    }
}

class Human {
    private int age;
    private String name;

    public Human(){
        this.age = 0;
        this.name = "";
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    
}

public class Classes {
    public static void main(String[] args) {
        // int a = 5;
        // int b = 9;
        // int c = 9;
        // Calculator calc = new Calculator();
        // int res = calc.add(a, b, c);
        // System.out.println("Result: " + res);

        // Human human = new Human();
        // human.setAge(22);
        // human.setName("Nitin");
        // System.out.println(human.getName() + ": "  + human.getAge());

        new Obj().show();
    }
}