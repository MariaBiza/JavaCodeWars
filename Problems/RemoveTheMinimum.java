package Problems;

import java.util.Arrays;

public class RemoveTheMinimum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeSmallest(new int[]{2, 2, 1, 2, 1})));
    }

    public static int[] removeSmallest(int[] numbers) {
        //show me the code!
        if (numbers.length == 0) {
            return new int[0];
        }
        int min = numbers[0];
        for (Integer element : numbers) {
            if (element < min) {
                min = element;
            }
        }

        int[] result = new int[numbers.length - 1];
        boolean test = false;
        int i = 0;
        for (Integer element : numbers) {
            if (element != min) {
                result[i] = element;
                i++;
            }
            else if (!test) {
                test = true;
            }
            else {
                result[i] = element;
                i++;
            }
        }
        return result;
    }
}
