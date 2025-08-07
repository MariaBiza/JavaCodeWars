package Problems;

public class TwiceAsOld {
    public static void main(String[] args) {
        System.out.println(twiceAsOld(30, 7));
    }

    public static int twiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here
        int target = sonYears * 2;
        return dadYears < target ? target - dadYears : dadYears - target;
    }
}
