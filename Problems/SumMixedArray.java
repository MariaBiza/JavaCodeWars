package Problems;

import java.util.Arrays;
import java.util.List;


public class SumMixedArray {
    public static void main(String[] args) {
        System.out.println(sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    public static int sum(List<?> mixed) {
        int result = 0;
        for (Object o : mixed) {
            if (o instanceof String) {
                result += Integer.parseInt((String) o);
            }
            else {
                result += (int) o;
            }
        }
        return result;
    }
}
