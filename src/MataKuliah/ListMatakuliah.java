/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MataKuliah;

/**
 *
 * @author HD-PC
 */
public class ListMatakuliah {
    private Node HEAD;
    
    public void addHead(Matakuliah data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(Matakuliah data, int position) {
        Node posNode = null, curNode;
        int i = 1;

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            if (position == 1) {
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }
                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }
    
    public void addTail(Matakuliah data) {
        Node posNode = null, curNode;

        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.next;
            }
            posNode.next = newNode;
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
    
//        public void removeMid(int x) {
//        if (HEAD != null) {
//            boolean ketemu = false;
//            int i = 1;
//            Node delNode = HEAD;
//            Node preNode = null;
//            while (delNode.next != null && !ketemu) {
//                if (delNode.data == x) {
//                    ketemu = true;
//                } else {
//                    preNode = delNode;
//                    delNode = delNode.next;
//                    i++;
//                }
//            }
//            if (ketemu) {
//                if (i == 1) {
//                    HEAD = HEAD.next;
//                } else {
//                    preNode.next = delNode.next;
//                    delNode = null;
//                }
//            }
//        }
//    }
    
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
    
//    public boolean find(int x) {
//        Node curNode = HEAD;
//        boolean ketemu = false;
//        
//        while(curNode != null && !ketemu) {
//            if (curNode.getData() == x) 
//                ketemu = true;
//             else 
//                curNode = curNode.getNext();
//        }
//        return ketemu;
//    }
    
    public int count() {
        int jum = 0;
        Node curNode = HEAD;
        while (curNode != null) {
            jum++;
            curNode = curNode.next;
        }
        return jum;
    }
    
    public void displayElement() {
        if(isEmpty()) {
            System.out.println("List Kosong");
        } else {
            Node curNode = HEAD;
            while(curNode != null) {
                System.out.println(curNode.getData().getKode() + " " + curNode.getData().getNama() + " "+ curNode.getData().getSKS());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    
    private boolean isEmpty() {
        return HEAD == null;
    }
}
