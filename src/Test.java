/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan 
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi untuk menampilkan hasil tarikan uang tabungan 
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        System.out.println("===Program Penarikan Uang===");
        // memasukkan saldo awal 
        System.out.print("Masukkan Saldo Awal      : ");
        tabungan.setSaldo(sc.nextInt());
        
        // memasukkan jumlah saldo yang akan diambil
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = sc.nextInt();
        
        // jumlah saldo setelah diambil
        System.out.println("Saldo Anda Sekarang\t  : " + tabungan.ambilUang(jumlah));
    }
    
}
