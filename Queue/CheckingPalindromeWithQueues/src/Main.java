import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*The idea behind this challange is to use stack and queue,
        to check if any string is palindrome or not*
        // Queue maintains FIFO order ---> it can contain our orginal string
        //Stack maintains LIFO order ---> can contain our reversed string
         */

        String input1 = "Don't nod";
        String input2 = "abccba";
        String input3 = "Was it a car or a cat I saw";
        String input4 = "I did, did I?";
        String input5 = "hello";

        System.out.println(isPalindromeWithQueue(input1)); // true
        System.out.println(isPalindromeWithQueue(input2)); // true
        System.out.println(isPalindromeWithQueue(input3)); // true
        System.out.println(isPalindromeWithQueue(input4)); // true
        System.out.println(isPalindromeWithQueue(input5)); // false
    }

    public static boolean isPalindromeWithQueue(String s) {


        String originalString = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < originalString.length(); i++) {
            queue.add(originalString.charAt(i));
            stack.push(originalString.charAt(i));
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}