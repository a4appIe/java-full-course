import java.util.HashMap;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>(); //keys are set and value are list
        students.put(1, "Nitin");
        students.put(2, "Hello");
        students.put(3, "Bye");
        students.put(4, "Nice");

        // System.out.println(students);
        // System.out.println(students.keySet());
        // System.out.println(students.values());
        for(int num: students.keySet()){
            System.out.println(num + ": " + students.get(num));
        }
        
    }
}
