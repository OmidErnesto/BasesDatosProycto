
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    
    Connection conn = null;
    
    public Connection conexion(){
        final String url = "jdbc:mysql://localhost:3306/";
        final String dbName = "gatito";
        final String driver = "com.mysql.cj.jdbc.Driver";
        final String userName = "root";
        final String password = "";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            if (!conn.isClosed()) {
                System.out.println("Database connection working using TCP/IP...");
            }
        } catch (Exception e) {
            System.err.println("Exception:" + e.getMessage());
        } 
        return conn;
 
    }
    /*
    public static void main(String[] args) {
        Connection conn = null;
        final String url = "jdbc:mysql://localhost:3306/";
        final String dbName = "gatito";
        final String driver = "com.mysql.cj.jdbc.Driver";
        final String userName = "root";
        final String password = "";

        try {
            Class.forName(driver).newInstance();
            conn = DriverManager.getConnection(url + dbName, userName, password);
            if (!conn.isClosed()) {
                System.out.println("Database connection working using TCP/IP...");

                // INSERT
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO gzz_tipo_cliente (TipCliCod, TipCliNom, TipCliEstReg) values (100006,'Supervisor','A')");
			    int count = stmt.executeUpdate();
			    stmt = conn.prepareStatement("INSERT INTO gzz_tipo_cliente (TipCliCod, TipCliNom, TipCliEstReg) values (100007,'Inspector','I')");
			    count = stmt.executeUpdate();
				System.out.println("Inserted count : " + count);
				stmt.close();
                //READ
                /*PreparedStatement stmt = conn.prepareStatement("SELECT * FROM gzz_tipo_cliente ");
				ResultSet resul = stmt.executeQuery();
				while (resul.next()) {
					System.out.println("Tipo Cliente Codigo:" + resul.getInt("TipCliCod"));
					System.out.println("Tipo Cliente Nombre:" + resul.getString("TipCliNom"));
					System.out.println("Tipo Cliente Est. Registro:" + resul.getString("TipCliEstReg"));
					System.out.println();
				}
				resul.close();
			    stmt.close();
                 */
                // UPDATE
                /*PreparedStatement stmt = conn.prepareStatement("UPDATE gzz_tipo_cliente SET TipCliNom='Anonimo', TipCliEstReg='A' WHERE TipCliCod=100005");
			    int count = stmt.executeUpdate();
				System.out.println("Inserted count : " + count);
				stmt.close();*/
                // DELETE
                /*PreparedStatement stmt = conn.prepareStatement("DELETE FROM gzz_tipo_cliente WHERE TipCliCod=100005");
			    int count = stmt.executeUpdate();
				System.out.println("Inserted count : " + count);
				stmt.close();
            }
        } catch (Exception e) {
            System.err.println("Exception:" + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {

            }
        }
    }*/
}
