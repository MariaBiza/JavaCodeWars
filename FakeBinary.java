public class FakeBinary {
    public static void main(String[] args) {
        String result = fakeBin("1873294012387");
        System.out.println(result);
    }

    public static String fakeBin(String numberString) {
        String binNumberString = "";
        String tmp;
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(Character.toString(numberString.charAt(i))) < 5) {
                tmp = binNumberString + "0";
                binNumberString = tmp;
            }
            else {
                tmp = binNumberString + "1";
                binNumberString = tmp;
            }
        }
        return binNumberString;
    }
}
