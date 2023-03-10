package ADTS;
import java.util.LinkedList;
import java.util.Queue;
public class queque {
    //fifo queue, meaning first in first out, just like a movie ticket line.
    //first come first server.
    //each new objects in the queue is added after the first, but is removed from the first object.

    
    public static void main(String[] args) {
    //removing is dequeue and adding is enqueue
    Queue<String> q = new LinkedList<String>();
    //queue is an interface thus the class needs to implement it before instantiation, or just create a new LinkedList<>() as linked list class implements the queue interface
    q.offer("walter");
    q.offer("flynn");
    q.offer("mike");
    q.offer("skyler");

 
    System.out.println(q.peek()); //returns the head value of the queue
    System.out.println(q);
    q.poll();//removes the head value of the queue
    System.out.println("after the poll method : " + q);

    //check if empty
    System.out.println(q.isEmpty());

    //size
    System.out.println(q.size());

    //contains boolean method
    System.out.println(q.contains("flynn"));


    }






   
    
    
}
