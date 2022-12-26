import java.util.*;
public class deQueue {
    static class Queue{
        Stack<Integer> stack1;
        Stack<Integer> stack2;
    } 

    static int remove(Queue q){
        int x;
        while(!q.stack1.isEmpty()){
            x = q.stack1.pop();
            q.stack2.push(x);
        }
        return q.stack2.pop();
    }

    static void enQueue(Queue q, int item){
       q.stack1.push(item);
    }

    public static void main(String[] args){
        Queue q = new Queue();
        q.stack1 = new Stack<>();
        q.stack2 = new Stack<>();

        enQueue(q, 4);
        enQueue(q, 5);
        enQueue(q, 6);
        System.out.println(remove(q));
    }
}
