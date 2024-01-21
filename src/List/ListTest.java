/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package List;

/**
 *
 * @author HD-PC
 */
public class ListTest {
    public static void main (String[] args) {
        StrukturList list = new StrukturList();

        list.addTail(7);
        list.addTail(6);
        list.addTail(4);
        list.addTail(2);
        list.addTail(3);
        list.displayElement();
        list.size();
    }
}
