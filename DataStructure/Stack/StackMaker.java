package stack;

public class StackMaker {
    int tos , maxsize , stack[];
    void Create_Stack(int size) {
        tos=0;
        maxsize=size;
        stack = new int[maxsize];
    }

    void push(int element) {
        stack[++tos] = element;
    }

    int pop(){
        int temp = stack[tos];
        tos--;
        return temp;
    }

    boolean isEmpty(){
        return (tos==1);
    }

    boolean isFull() {
        return (tos==maxsize-1);
    }
    
    int peek(){
        return (stack[tos]);
    }

    void printStack() {
        for(int i=tos;i>0;i--){
            System.out.println(stack[i]);
        }
    }
}