// Name : Shreyash Bhoite
// Roll No : 63

package stack;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PalindromeStack
{
    private static int power(char c) {
        if(c=='+' || c=='-'){
            return 1;
        }else if(c=='*' || c=='/'){
            return 2;
        }else if(c=='(' || c==')'){
            return 3;
        }
        return 0;
    }

    public static void main(String[] args) {
        Deque<Character> stacks = new ArrayDeque<>();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Infix : ");
        String word = in.next();
        String postS = "";

        for(char c : word.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                postS += c; 
            }else if(c=='(') {
                stacks.push(c);
            }else if(c==')') {
                while(!stacks.isEmpty() && stacks.peek() != '(') {
                    postS += stacks.pop();
                    stacks.pop(); 
                }
            }else{
                while(!stacks.isEmpty() && stacks.peek() != '(' && power(c) <= power(stacks.peek())) {
                    postS += stacks.pop();
                }
                stacks.push(c);
            }
            
        }while((!stacks.isEmpty())){
            postS += stacks.pop();
        }
        System.out.println("The Infix to Postfix conversion will be : "+postS);
    }
}