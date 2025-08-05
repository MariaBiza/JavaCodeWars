import java.util.Locale;

public class SumOfTheFirstNthTermOfSeries {
    public static void main(String[] args) {
        System.out.println(seriesSum(0));
    }

    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double result = 0.0;
        int z = 1;
        for (int i = 0; i < n; i++) {
            result += (double) 1 / z;
            z += 3;
        }
        return String.format(Locale.ENGLISH, "%.2f", result);
    }
}
