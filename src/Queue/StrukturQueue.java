/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author HD-PC
 */
public class StrukturQueue {
    private Node FRONT;
    private Node REAR;
    
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }
    
    public int size() {
        int size = 0;
        Node curNode = FRONT;
        while (curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }
    
    public int front() {
        return FRONT != null ? FRONT.getData() : -1;
    }
    
    public int dequeue() {
        Node temp;
        int dequeuedItem = Integer.MIN_VALUE; // return value when the queue is empty
        if (FRONT != null) {
            if (FRONT == REAR) {
                dequeuedItem = FRONT.data;
                FRONT = null;
                REAR = null;
            } else {
                temp = FRONT;
                dequeuedItem = temp.data;
                FRONT = FRONT.next;
                temp = null;
            }
        }
        return dequeuedItem;
    }
    
    public void displayElement() {
        if (FRONT == null) {
            System.out.println("Queue kosong");
            return;
        }
        
        Node curNode = FRONT;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }

    private boolean isEmpty() { // method untuk mengecek apakah linked list kosong
        return FRONT == null;
    }
}
