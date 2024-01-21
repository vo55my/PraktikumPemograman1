/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MataKuliah;

/**
 *
 * @author HD-PC
 */
public class ListMkTest {
    public static void main(String[] args) {
        ListMatakuliah list = new ListMatakuliah();
        
        list.addHead(new Matakuliah("IF001", "Dasar Pemograman", 4));
        list.addMid(new Matakuliah("IF002", "Praktikum Web", 3), 2);
        list.addTail(new Matakuliah("IF003", "Analisis Sistem", 5));
        list.displayElement();
        list.removeHead();
        list.removeTail();
        list.displayElement();
        list.count();
        list.displayElement();
    }
}
