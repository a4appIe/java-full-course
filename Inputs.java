// import java.io.BufferedReader;
import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter your name >>  ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
        scanner.close();
    }
}
