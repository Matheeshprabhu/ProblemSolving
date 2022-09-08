package problems;


import java.util.Stack;

// Implement Queue using Stack
public class QueueWithStack {

    private final Stack<Integer> pushStack = new Stack<>();
    private final Stack<Integer> popStack = new Stack<>();

    public void enqueue(int item){
        pushStack.push(item);
    }

    public int dequeue(){

        if(popStack.empty()){
            // stack size changes after very pop, so save it as variable.
            int sizeOfStack = pushStack.size();
            for(int i = 0; i<sizeOfStack; i++){
                popStack.push(pushStack.pop());
            }
        }
        return popStack.pop();
    }

    public static void main(String[] args){

        QueueWithStack queueWithStack = new QueueWithStack();

        queueWithStack.enqueue(1);
        queueWithStack.enqueue(2);
        queueWithStack.enqueue(3);
        queueWithStack.enqueue(4);
        System.out.println(queueWithStack.dequeue());
        System.out.println(queueWithStack.dequeue());

    }


}
