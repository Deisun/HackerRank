public class valleys {

    public static void main(String[] args) {

        String s = "UDDDUDUU";
        System.out.println(getValleys(s));
    }

    private static int getValleys(String s) {
        int valleys = 0;
        int height = 0;



        for (char step : s.toCharArray()) {
            if (step == 'U') {
                height++;
            }

            if (step == 'D') {
                height--;
            }

            if (step == 'U' && height==0) {
                valleys++;
            }
        }



        return valleys;
    }
}
