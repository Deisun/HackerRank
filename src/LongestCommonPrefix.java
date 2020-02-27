public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] s = {"flower", "flow", "flight"};

        System.out.println(longestPrefix(s));
    }

    private static String longestPrefix(String [] strings) {
        String longestCommonPrefix = "";
        if (strings.length == 0) return longestCommonPrefix;

        longestCommonPrefix = strings[0];
        for (int i = 1; i < strings.length; i++) {
            while(!strings[i].startsWith(longestCommonPrefix)) {
                longestCommonPrefix = longestCommonPrefix.substring(0, longestCommonPrefix.length() - 1);
            }
        }

        return longestCommonPrefix;
    }
}
