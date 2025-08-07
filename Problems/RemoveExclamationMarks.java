package Problems;

public class RemoveExclamationMarks {
    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("H!!ello W!!!or!ld!"));
    }

    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
