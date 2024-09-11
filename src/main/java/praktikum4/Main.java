/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author Aukhal Rifqi Z
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek pekerja
        Pekerja pekerja1 = new Pekerja("Ali", 30, "Insinyur", 5000.0);
        
        // Menampilkan informasi pekerja
        System.out.println(pekerja1.toString());

        // Mengubah nama pekerja menggunakan setter
        pekerja1.setNama("Budi");
        System.out.println("Setelah nama diubah: " + pekerja1.toString());

        // Coba akses langsung atribut
        // System.out.println(pekerja1.nama); // Error: 'nama' has private access in 'Manusia'
        System.out.println("Usia pekerja: " + pekerja1.usia); // Bisa diakses karena 'usia' protected
        System.out.println("Pekerjaan pekerja: " + pekerja1.pekerjaan); // Bisa diakses karena 'pekerjaan' public
        // System.out.println(pekerja1.gaji); // Error: 'gaji' has private access in 'Pekerja'
    }
}
