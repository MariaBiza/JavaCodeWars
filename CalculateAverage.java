public class CalculateAverage {
    public static void main(String[] args) {
        System.out.println(findAverage(new int[] {100, 50, 25, 75, 0}));
    }

    public static double findAverage(int[] array) {
        int sum_array = 0;
        for(Integer element : array) {
            sum_array += element;
        }
        return (double) sum_array / array.length;
    }
}
