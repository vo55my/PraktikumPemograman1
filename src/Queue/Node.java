/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author HD-PC
 */
public class Node {
    int data;
    Node next;
    
    //    Inisialisasi atribute node
    public Node(int data) {
        this.data = data;
    }
    
    //    Setter & Getter
    public void setData(int data) {
        this.data = data;
    }
    
    public int getData() {
        return data;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getNext() {
        return next;
    }
}
