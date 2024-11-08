import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 7, 2, 8, 4);
        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        // for(int i: list){
        //     System.out.println(i);
        // }
        list.forEach(n -> System.out.println(n));
    }
}
