package Problems;

public class ILoveYouLittleLotPassionatelyNotAtAll {
    public static void main(String[] args) {
        String result = howMuchILoveYou(7);
        System.out.println(result);
    }

    public static String howMuchILoveYou(int nb_petals) {

        //your code here :)

        while (nb_petals > 6) {
            nb_petals -= 6;
        }

        return switch (nb_petals) {
            case 1 -> "I love you";
            case 2 -> "a little";
            case 3 -> "a lot";
            case 4 -> "passionately";
            case 5 -> "madly";
            case 6 -> "not at all";
            default -> "";
        };
    }
}
