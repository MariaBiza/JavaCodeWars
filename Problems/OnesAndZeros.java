package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnesAndZeros {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int result = 0;
        for (int i = binary.size() - 1, j = 0; i > -1; i--, j++) {
            result += (int) (Math.pow(2, j) * binary.get(i));
        }
        return result;
    }
}
