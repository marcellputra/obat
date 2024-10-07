/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poinofsales;

/**
 *
 * @author USER
 */
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class PoinOfSales {

    // Method Go menerima parameter untuk lebih fleksibel
    public static Connection Go(String serverName, String dbName, String user, String password, int port) {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("Localhost");
            m.setDatabaseName("apoteker");
            m.setUser("root");
            m.setPassword("");
            m.setPortNumber(3306);
            m.setURL("jdbc:mysql://localhost:3306/apoteker?serverTimezone=Asia/Jakarta");

            Connection C = m.getConnection();
            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n" + e.getMessage());
        }

        return null;
    }

    public static void main(String[] args) {
        // Memanggil method Go dengan parameter
        Connection connection = PoinOfSales.Go("localhost", "pos", "root", "", 3306);

        if (connection != null) {
            // Lakukan operasi database di sini
            System.out.println("Operasi database bisa dilakukan.");
        } else {
            System.out.println("Tidak dapat terhubung ke database.");
        }
    }
}
