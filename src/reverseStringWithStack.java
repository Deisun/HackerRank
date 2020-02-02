import java.util.Stack;

public class reverseStringWithStack {


    public static void main(String[] args) {


        System.out.println(reverseString("amazing"));

    }

    private static String reverseString(String text) {
        StringBuilder reverse = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        for (char c : text.toCharArray()) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
