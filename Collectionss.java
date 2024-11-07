import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Stu implements Comparable<Stu> {
    int age;
    String name;

    public Stu(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Student : [ " + this.name + ", Age : " + this.age + " ]";
    }

    public int compareTo(Stu x) {
        return this.age > x.age ? 1 : -1;
    }

}

public class Collectionss {
    public static void main(String[] args) {
        // Comparator<Integer> com = (i, j) -> i%10 > j%10 ? 1 : -1;
        List<Stu> list = new ArrayList<>();
        list.add(new Stu(23, "Nitin"));
        list.add(new Stu(20, "Aryan"));
        list.add(new Stu(22, "Vijay"));
        list.add(new Stu(27, "Mahi"));
        for (Stu s : list) {
            System.out.println(s);
        }
        System.out.println();
        Collections.sort(list);
        System.out.println();
        for (Stu s : list) {
            System.out.println(s);
        }

    }
}
