package Problems;

public class IsHeGonnaSurvive {
    public static void main(String[] args) {
        boolean isHeroWin = hero(10, 5);
        System.out.println(isHeroWin);
    }

    public static boolean hero(int bullets, int dragons) {
        // please code here
        return bullets / 2 >= dragons;
    }
}
