package Problems;

public class IsTheStringUppercase {
    public static void main(String[] args) {
        System.out.println(isUpperCase("hello I AM DONALD"));
    }

    public static boolean isUpperCase(String s) {
        // your code here
        return s.isEmpty() || s.toUpperCase().equals(s);
    }
}
