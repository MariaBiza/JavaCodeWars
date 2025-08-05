public class BeginnerSeries2Clock {

    public static void main(String[] args) {
        System.out.println(Past(3, 10, 22));
    }
    public static int Past(int h, int m, int s)
    {
        //Happy Coding! ^_^
        int result = s;
        result += m * 60;
        result += h * 60 * 60;
        result *= 1000;
        return result;
    }
}
