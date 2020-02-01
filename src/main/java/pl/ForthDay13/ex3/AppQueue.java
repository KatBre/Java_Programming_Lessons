package pl.ForthDay13.ex3;

import java.util.Queue;

public class AppQueue {
    public static void main(String[] args) {
        MyQueue<String> myStringQueue = new MyQueue<>();
        myStringQueue.offer("Hello");
        myStringQueue.offer("is it me");
        myStringQueue.offer("you are looking for?");
        myStringQueue.offer("NO!");
//        MyQueue<Integer> myIntegerQueue = new MyQueue<>();
        myStringQueue.printAll();
        myStringQueue.pool();
        myStringQueue.pool();
        System.out.println("After removal: ");
        myStringQueue.printAll();
    }
}
