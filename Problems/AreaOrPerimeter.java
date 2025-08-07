package Problems;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        System.out.println(areaOrPerimeter(6 , 10));
    }

    public static int areaOrPerimeter (int l, int w) {
        // code away...
        return l == w ? l * w : 2 * (l + w);
    }
}
