/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 * Nama     : M.Syifa'ul Ikrom A
 * Kelas    : TI 1F
 * NIM      : 1941720057
 */
public class BalikKalimatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kalimatAwal;
        System.out.println("Program Membalik Kalimat dengan Konsep Stack");
        System.out.println("==============================================");
        System.out.print("Masukkan Kalimat : ");
        kalimatAwal = sc.nextLine();
        
        Stack pembalik = new Stack(kalimatAwal);
        
        pembalik.exchange();
        pembalik.show();
    }
}
