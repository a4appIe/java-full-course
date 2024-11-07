// import java.util.List;
import java.util.Set;
import java.util.TreeSet;
// import java.util.ArrayList;
import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(6);
        nums.add(6);
        for (Object n : nums) {
            System.out.println(n);
        }
    }
}
