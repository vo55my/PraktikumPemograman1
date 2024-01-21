/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author HD-PC
 */
public class DoubleLinkedList {
    private Node head; // Deklarasi head sebagai variabel instance dari class DoubleLinkedList

    public void addToHead(double data) { // menambahkan node baru di awal list
        Node newNode = new Node(data); // membuat node baru dengan data yang diberikan
        if (head == null) { // jika linked list kosong
            head = newNode; // head diatur menjadi newNode
        } else {
            newNode.next = head; // newNode selanjutnya diatur menjadi head
            head.prev = newNode; // head sebelumnya diatur menjadi newNode
            head = newNode; // head diatur menjadi newNode
        }
    }

    public void addToTail(double data) { // menambahkan node baru di akhir list
        Node newNode = new Node(data); // membuat node baru dengan data yang diberikan
        if (head == null) { // jika linked list kosong
            head = newNode; // head diatur menjadi newNode
        } else {
            Node curNode = head;
            while (curNode.next != null) { // mencari node terakhir
                curNode = curNode.next;
            }
            curNode.next = newNode; // node terakhir selanjutnya diatur menjadi newNode
            newNode.prev = curNode; // newNode sebelumnya diatur menjadi node terakhir
        }
    }

    public void addAfter(double data, int position) { // menambahkan node baru setelah node tertentu
        Node newNode = new Node(data); // membuat node baru dengan data yang diberikan
        Node curNode = head;
        int i = 1;

        while (curNode != null && i < position) { // mencari node di posisi yang diberikan
            curNode = curNode.next;
            i++;
        }
        if (curNode == null) { // jika posisi yang diberikan lebih besar dari jumlah node yang ada
            System.out.println("Invalid position!");
            return;
        }
        newNode.next = curNode.next; // newNode selanjutnya diatur menjadi node setelahnya
        newNode.prev = curNode; // newNode sebelumnya diatur menjadi node sekarang
        if (curNode.next != null) { // jika node setelahnya bukan null
            curNode.next.prev = newNode; // node selanjutnya sebelumnya diatur menjadi newNode
        }
        curNode.next = newNode; // node sekarang selanjutnya diatur menjadi newNode
    }

    public void printList() { // mencetak isi dari linked list
        Node curNode = head;
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.next;
        }
        System.out.println();
    }

    private class Node { // Deklarasi class Node sebagai inner class dari class DoubleLinkedList
        double data;
        Node next;
        Node prev;

        public Node(double data) { // constructor untuk class Node
            this.data = data;
            next = null;
            prev = null;
        }
    }
}