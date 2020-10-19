/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119905.Latihan4.Kambing;

/**
 *
 * NAMA    : Abraham Rumayara
 * KELAS   : PBO10K
 * NIM     : 10119905
 * Deskripsi Program : Program ini merupakan cara pngaksesan variabel lokal
 */
public class PBO10K10119905Latihan4 {
    
    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing +5;
        System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        PBO10K10119905Latihan4 kambingJantan = new PBO10K10119905Latihan4();
        kambingJantan.tambahKambing();
    }
    
}
