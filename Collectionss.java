import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Collectionss {
    public static void main(String[] args) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {

                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(62);
        list.add(17);
        list.add(90);
        list.add(34);

        Collections.sort(list, com);
        System.out.println(list);

    }
}
