public class ThinkfulLogicDrillsTrafficLight {
    public static void main(String[] args) {
        String current = updateLight("green");
        System.out.println(current);
    }

    public static String updateLight(String current) {
        return switch (current) {
            case "green" -> "yellow";
            case "yellow" -> "red";
            default -> "green";
        };
    }
}
