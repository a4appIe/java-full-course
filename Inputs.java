import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputs {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a num >>  ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String name = br.readLine();
        System.out.println(name);
    }
}
