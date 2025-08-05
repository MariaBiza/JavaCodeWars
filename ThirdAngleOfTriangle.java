public class ThirdAngleOfTriangle {
    public static void main(String[] args){
        System.out.println(otherAngle(40, 22));
    }

    public static int otherAngle(int angle1, int angle2) {
        // TODO: Place code here
        return 180 - (angle1 + angle2);
    }
}
