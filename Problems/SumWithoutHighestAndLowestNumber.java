package Problems;

public class SumWithoutHighestAndLowestNumber {
    public static void main(String[] args) {
        System.out.println(sum(null));
    }

    public static int sum(int[] numbers)
    {
        if (numbers == null) {
            return 0;
        }
        int tmp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
        }
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
