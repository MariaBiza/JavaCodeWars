package Problems;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
    }

    public static String oddOrEven (int[] array) {
        // your code
        if (array == null) {
            return "[0]";
        }
        int sumArray = 0;
        for (Integer element : array) {
            sumArray += element;
        }
        if (sumArray % 2 == 0) {
            return "even";
        }
        return "odd";
    }
}
