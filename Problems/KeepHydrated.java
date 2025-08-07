package Problems;

public class KeepHydrated {
    public static void main(String[] args) {
        System.out.println(liters(12.83));
    }

    public static int liters(double time)  {
        //Your code goes here! Hint: You should change that -1
        return (int) Math.floor(time * 0.5);
    }
}
