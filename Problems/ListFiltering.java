package Problems;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> result = new ArrayList<>();
        for (Object obj : list) {
            if (obj instanceof Integer) {
                result.add((int) obj);
            }
        }
        return result;
    }
}
