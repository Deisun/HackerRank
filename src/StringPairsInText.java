import java.util.HashMap;
import java.util.Map;

public class StringPairsInText {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String text = "hello world vmware, hello world!!!";

        // split text by spaces
        String delim = "\\s+";
        String [] words = text.split(delim);

        // clean text of all weird characters
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^\\w+]", "");
        }

        // get every pair of words into a HashMap
        for (int i = 0; i < words.length - 1; i++) {
            String pair = words[i] + " " + words[i+1];

            if (!map.containsKey(pair)) {
                map.put(pair, 1);
            } else {
                map.put(pair, map.get(pair) + 1);
            }
        }

        // show count of each pair
        map.forEach((key, value) -> System.out.println(key + " " + value));
    }

}
