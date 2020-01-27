import java.util.HashSet;
import java.util.Set;

public class Socks2 {

    public static void main(String[] args) {

        int [] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};


        int pairs = 0;
        Set<Integer> colors = new HashSet<>();

        for (int sock : socks) {

            if (!colors.contains(sock)) {
                colors.add(sock);
            } else {
                colors.remove(sock);
                pairs++;
            }
        }

        System.out.println(pairs);

    }
}
