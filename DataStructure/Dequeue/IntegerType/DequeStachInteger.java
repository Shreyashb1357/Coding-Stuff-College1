package stack;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStachInteger
{
        public static void main(String[] args) {
        Deque<Integer> stacks = new ArrayDeque<>();
        Scanner input = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Stack Menu");
            System.out.println("----------");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Peek");
            System.out.println("4.Print");
            System.out.println("0.Exit");
            System.out.println(":");

            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                        System.out.print("\nEnter element:");
                        Integer element = input.nextInt();
                        stacks.push(element);
                        System.out.println(element+ "pushed");
                    break;
                
                case 2:
                    if(stacks.isEmpty()!=true){
                        stacks.pop();
                        System.out.println("The element popped...");
                    }else{
                        System.out.println("Stack is empty...");
                    }
                    break;

                case 3:
                    if(stacks.isEmpty()!=true){
                        System.out.println("The element is peek : "+stacks.peek());
                    }else{
                        System.out.println("The is empty;");
                    }
                    break;
                
                case 4:
                    if(stacks.isEmpty()!=true){
                        System.out.println("The stack elements are :"+stacks);
                    }else{
                        System.out.println("The stack is empty");
                    }
                case 0:
                    System.out.print("\nThanks for using the code..");
                    break;
                default:
                    System.out.print("\nInvalid input. ");
                    break;


            }
        }while(choice!=0);
    }
}