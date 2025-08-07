package Problems;

public class ReversedStrings {
    public static void main(String[] args) {
        System.out.println(solution("world"));
    }

    public static String solution(String str) {
        // Your code here...
        String reverse_str = "";
        for(int i = str.length() - 1; i > -1; i--) {
            reverse_str += str.charAt(i);
        }
        return reverse_str;

        /*
        *   Or
        *   return new StringBuilder StringBuilder(str).reverse().toString();
         */
    }
}
