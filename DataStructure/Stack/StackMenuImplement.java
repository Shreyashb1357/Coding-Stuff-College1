package stack;
import java.util.Scanner;

public class StackMenuImplement 
{
        public static void main(String[] args) {
        StackMaker obj = new StackMaker();
        Scanner input = new Scanner(System.in);
         Scanner in=new Scanner(System.in);
        System.out.println("Enter size of stack:");
        int size=in.nextInt();
        obj.Create_Stack(size);
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
                    if(obj.isFull()!=true){
                        System.out.print("\nEnter element:");
                        int element = input.nextInt();
                        obj.push(element);
                        System.out.println(element+ "pushed");
                    }else {
                        System.out.println("Stack is full...");
                    }
                    break;
                
                case 2:
                    if(obj.isEmpty()!=true){
                        obj.pop();
                        System.out.println("The element popped...");
                    }else{
                        System.out.println("Stack is empty...");
                    }
                    break;

                case 3:
                    if(obj.isEmpty()!=true){
                        System.out.println("The element is peek : "+obj.peek());
                    }else{
                        System.out.println("The is empty;");
                    }
                    break;
                
                case 4:
                    if(obj.isEmpty()!=true){
                        System.out.println("The stack elements are :");
                        obj.printStack();
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