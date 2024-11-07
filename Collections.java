import java.util.List;
import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(6);
        for (Object n : nums) {
            System.out.println((Integer) n);
        }
    }
}
