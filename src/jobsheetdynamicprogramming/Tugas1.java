/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheetdynamicprogramming;

import javax.swing.JOptionPane;


/**
 *
 * @author Tarishaulia
 */
public class Tugas1 {
    public static void main(String[] args) {
        
        System.out.println("Identitas : Rizqita Tarish Aulia / XRPL5 / 37");
        System.out.println("5 jenis pecahan uang : "+ "\nRp.100"+ "\nRp.500"+ "\nRp.1000"+ "\nRp.2000"+ "\nRp.5000");
        int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah uang :"));
        Proses(uang);
    }
    private static void Proses(int uang) {
        int uanga[] = new int [5];
        int sisa[] = new int [5];
        uanga[0] = uang / 5000;
        sisa[0] = uang % 5000;
        uanga[1] = sisa[0] / 2000;
        sisa[1] = sisa[0] % 2000;
        uanga[2] = sisa[1] / 1000;
        sisa[2] = sisa[1] % 1000;
        uanga[3] = sisa[2] / 500;
        sisa[3] = sisa[2] % 500;
        uanga[4] = sisa[3] / 100;
        sisa[4] = sisa[3] % 100;
        System.out.println("Kombinasi pecahan uang minimal :");
        System.out.println("Rp.5000 = " + uanga[0]);
        System.out.println("Rp.2000 = " + uanga[1]);
        System.out.println("Rp.1000 = " + uanga[2]);
        System.out.println("Rp.500 = " + uanga[3]);
        System.out.println("Rp.100 = " + uanga[4]);
    }
}

