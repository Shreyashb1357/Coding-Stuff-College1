package stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class Postfix
{
    public static void main(String[] args) {
        Deque<Character> stacks = new ArrayDeque<>();
        String word = "(a+(b*c))";
        String rword = "";

        for(char c: word.toCharArray()) {
            stacks.push(c);
            if(c == ')') {
                rword+=stacks.pop();
                System.out.println(rword);
            }

        }
    }
}