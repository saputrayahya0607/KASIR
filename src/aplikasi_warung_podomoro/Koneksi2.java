package aplikasi_warung_podomoro;

import static aplikasi_warung_podomoro.adminpage.m;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author abdurraihan
 */
public class Koneksi2 {
    public static Connection Go() throws java.sql.SQLException{
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setServerName("localhost"); 
            m.setDatabaseName("db_warung_podomoro"); 
            m.setUser("root"); 
            m.setPassword(""); 
            m.setPortNumber(3306); 
            m.setServerTimezone("Asia/Jakarta"); 
            
            Connection C = m.getConnection();
            System.out.println("Koneksi sukses");
            return C;
        } catch (SQLException e) {
            System.err.println("Koneksi Gagal!\n"+
                    e.getMessage());
        }
        
        
        return null;
    }

    void connect() {
    try {
        Connection connection = Go(); // Panggil method Go() untuk mendapatkan koneksi
        if (connection != null) {
            System.out.println("Koneksi berhasil dibuat dari connect() method");
        } else {
            System.out.println("Koneksi gagal dibuat");
        }
    } catch (SQLException e) {
        System.err.println("Error saat mencoba koneksi: " + e.getMessage());
    }
}

    }