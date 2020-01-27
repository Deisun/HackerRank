public class clouds {
    public static void main(String[] args) {
        int numClouds = 7;
        int [] clouds = {0,0,1,0,0,1,0};

        System.out.println(jumps(numClouds, clouds));
    }

    private static int jumps(int n, int [] clouds) {
        int count = 0;
        int i = 0;

        while (i < clouds.length-1) {
            if (i+2 < clouds.length && clouds[i] != 1) {

                i = i + 2;
                count++;
            } else {
                i++;
                count++;

            }
        }

        return count;
    }
}
