import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 */
public class JavaCollections {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(3);
        names.add("Aaa");
        names.add("Bbb");
        names.add("Ccc");

        List<String> unmodifiableNames = Collections.unmodifiableList(names);
        unmodifiableNames.forEach(name -> System.out.println(name));

        // unmodifiableNames.add("Ddd");
        names.add("Zzz");
        unmodifiableNames.forEach(name -> System.out.println(name));
    }
}
