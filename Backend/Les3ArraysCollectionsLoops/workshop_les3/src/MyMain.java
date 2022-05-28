import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyMain {
    public static void main(String[] args) {

        List<Integer> li = Arrays.asList(1,3,5,7,9);

        // normal
        for  (int j = 0; j < li.size(); j++) {
            System.out.println(li.get(j));
        }

        // enhanced
        for (int val : li) {
            System.out.println(val * val);
        }

        // iterator
        Iterator<Integer> it = li.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // lambda
        li.forEach(i -> System.out.println(i * 5));
    }
}
