package Problems;

import java.util.Arrays;

public class RemovingElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2})));
    }

    public static Object[] removeEveryOther(Object[] arr) {
        // happy coding
        int len = arr.length;
        Object[] result;
        if (len % 2 == 0) {
            result = new Object[arr.length / 2];
        }
        else {
            result = new Object[arr.length / 2 + 1];
        }
        for (int i = 0, j = 0; i < arr.length; i += 2, j++) {
            result[j] = arr[i];
        }
        return result;
    }
}
