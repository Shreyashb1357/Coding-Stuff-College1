package stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class CharacterStack {
    public static void main(String[] args) {
        Deque<Character> stack = new ArrayDeque<>();
        String word = "Shreyash";
        for(char c: word.toCharArray()){
            System.out.println(c);
        }
    }
}