import java.util.HashSet;
import java.util.Set;

public class Socks {
    public static void main(String[] args) {

        int numSocks = 9;
        int [] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};

        System.out.println(socksFunc(numSocks, socks));
    }

    private static int socksFunc(int num, int [] socks) {

        int pairs = 0;
        Set<Integer> colors = new HashSet<>();


        for (int i = 0; i < num; i++) {

            if (!colors.contains(socks[i])) {
                colors.add(socks[i]);
            } else {
                pairs++;
                colors.remove(socks[i]);
            }
        }

        return pairs;
    }


}
