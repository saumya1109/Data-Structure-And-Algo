import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String input1 = "I did,did I ?";
        String input2 = "racecar";
        String input3 = "hello";
        System.out.println(isPalindrome(input3));


    }

    public static boolean isPalindrome(String s) {
        String originalString = s;
        String reversedString = "";
        originalString = originalString.replaceAll("[\\p{Punct}\\s]", "");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < originalString.length(); i++) {
            stack.push(originalString.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversedString = reversedString + stack.pop();
        }

        if (!originalString.equals(reversedString)) {
            return false;
        }


        return true;
    }
}