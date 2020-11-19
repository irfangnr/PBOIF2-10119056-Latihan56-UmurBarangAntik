/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan56.umurbarangantik;

/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan Umur barang antik
 */
public class PBOIF210119056Latihan56UmurBarangAntik {

    public static void main(String[] args) {
        Radio radio=new Radio(234);
        radio.setName("Radio AM");
        System.out.println("Nama barang Antik : "+radio.getName());
        radio.tampilUmur();
    }
    
}
