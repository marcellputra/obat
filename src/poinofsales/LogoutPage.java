/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poinofsales;

/**
 *
 * @author USER
 */

public class LogoutPage {
    private static boolean isLoggedIn = true; // Contoh status login

    public static void main(String[] args) {
        // Proses login (hanya contoh)
        System.out.println("Selamat datang, Anda telah login.");
        
        // Proses logout
        logout();
        
        // Setelah logout, kembali ke halaman login
        if (!isLoggedIn) {
            System.out.println("Anda telah logout.");
            System.out.println("Kembali ke halaman login...");
        }
    }

    public static void logout() {
        // Menetapkan status isLoggedIn menjadi false
        isLoggedIn = false;
        
        // Tambahkan logika lain jika diperlukan, misalnya menghapus cache atau data sesi
        System.out.println("Proses logout berhasil.");
    }
}
    

