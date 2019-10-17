/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan perhitungan lingkaran
 * 
 */
public class hitunglingkaran {
    
     Scanner scanner = new Scanner(System.in);
     
    public double diameter;
    public double jariJari;

    public void validasi() {
        String diameterlingkaran;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            diameterlingkaran = scanner.nextLine();
            System.out.println((!diameterlingkaran.matches("[0-9]*")) ? "Nilai Diameter Tidak Sesuai" : "");
        } while (!diameterlingkaran.matches("[0-9]*"));
            diameter = Double.parseDouble(diameterlingkaran);
    }

    public double hitungJariJari(double parDiameter) {
        return parDiameter / 2;
    }

    public double luasLingkaran(double parJariJari) {
        return  parJariJari * parJariJari;
    }

    public double kelilingLingkaran(double parJariJari) {
        return 2  * parJariJari;
    }

    public void tampil(double parDiameter) {
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.println("Jari-Jari Lingkaran: "+ hitungJariJari(parDiameter));
        System.out.println("Luas Lingkaran: " + luasLingkaran(hitungJariJari(parDiameter)));
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran(hitungJariJari(parDiameter)));
    }
    
}
