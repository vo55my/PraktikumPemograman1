/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MataKuliah;

/**
 *
 * @author HD-PC
 */
public class Matakuliah {
    private String kode;
    private String nama;
    private int sks;
    
    public Matakuliah(String kode, String nama, int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }
    
    public void setKode(String kode) {
        this.kode = kode;
    }
    
    public String getKode() {
        return kode;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setSKS() {
        this.sks = sks;
    }
    
    public int getSKS() {
        return sks;
    }
}
