// import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.io.InputStreamReader;
// import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}
