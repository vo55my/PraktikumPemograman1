/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author HD-PC
 */
public class StrukturList {
    private Node HEAD; // deklarasi HEAD sebagai variabel instance dari class StrukturList

    public void addTail(int data) {
        Node posNode = null, curNode; // deklarasi posNode dan curNode sebagai Node

        Node newNode = new Node(data); // membuat node baru dengan data yang diberikan
        if (isEmpty()) { // jika linked list kosong
            HEAD = newNode; // HEAD diatur menjadi newNode
        } else {
            curNode = HEAD; // curNode diatur menjadi HEAD
            while (curNode != null) { // selama curNode bukan null
                posNode = curNode; // posNode diatur menjadi curNode
                curNode = curNode.next; // curNode diatur menjadi node selanjutnya
            }
            posNode.next = newNode; // posNode selanjutnya diatur menjadi newNode
        }
    }
    
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(int data, int position) {
        Node posNode = null, curNode; // deklarasi posNode dan curNode sebagai Node
        int i = 1; // deklarasi variabel i sebagai integer

        Node newNode = new Node(data); // membuat node baru dengan data yang diberikan
        if (HEAD == null) { // jika linked list kosong
            HEAD = newNode; // HEAD diatur menjadi newNode
        } else {
            curNode = HEAD; // curNode diatur menjadi HEAD
            if (position == 1) { // jika position adalah 1
                newNode.next = curNode; // newNode selanjutnya diatur menjadi curNode
                HEAD = newNode; // HEAD diatur menjadi newNode
            } else {
                while (curNode != null && i < position) { // selama curNode bukan null dan i kurang dari position
                    posNode = curNode; // posNode diatur menjadi curNode
                    curNode = curNode.next; // curNode diatur menjadi node selanjutnya
                    i++;
                }
                posNode.next = newNode; // posNode selanjutnya diatur menjadi newNode
                newNode.next = curNode; // newNode selanjutnya diatur menjadi curNode
            }
        }
    }
    
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            temp = null;
        }
    }
    
    public void removeTail() {
        if (HEAD != null) {
            if (HEAD.next == null) {
                HEAD = null;
            } else {
                Node lastNode = HEAD;
                Node preNode = null;
                while (lastNode.next != null) {
                    preNode = lastNode;
                    lastNode = lastNode.next;
                }
                preNode.next = null;
                lastNode = null;
            }
        }
    }
    
    public void removeMid(int x) {
        if (HEAD != null) {
            boolean ketemu = false;
            int i = 1;
            Node delNode = HEAD;
            Node preNode = null;
            while (delNode.next != null && !ketemu) {
                if (delNode.data == x) {
                    ketemu = true;
                } else {
                    preNode = delNode;
                    delNode = delNode.next;
                    i++;
                }
            }
            if (ketemu) {
                if (i == 1) {
                    HEAD = HEAD.next;
                } else {
                    preNode.next = delNode.next;
                    delNode = null;
                }
            }
        }
    }
    
    public boolean find(int x) {
        Node curNode = HEAD;
        boolean ketemu = false;
        
        while(curNode != null && !ketemu) {
            if (curNode.getData() == x) 
                ketemu = true;
             else 
                curNode = curNode.getNext();
        }
        return ketemu;
    }
    
    public int size() {
        Node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) {
            jumlah++;
            curNode = curNode.next;
        }
        return jumlah;
    }

    private boolean isEmpty() { // method untuk mengecek apakah linked list kosong
        return HEAD == null;
    }
    
    public void displayElement() {
        if (HEAD == null) {
            System.out.println("Linked list kosong");
            return;
        }
        
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
