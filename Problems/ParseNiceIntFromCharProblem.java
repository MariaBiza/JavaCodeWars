package Problems;

public class ParseNiceIntFromCharProblem {
    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }

    public static int howOld(final String herOld) {

        //your code here, return correct age as int ; )
        return Integer.parseInt(herOld.substring(0, 1));

    }
}
