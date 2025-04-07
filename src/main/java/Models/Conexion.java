
package Models;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/db_garciacomputers"; // Cambia esto
    private static final String USER = "root"; // Cambia esto
    private static final String PASSWORD = "helbert1001"; // Cambia esto

    private Connection conexion;

    public Conexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Conexión exitosa a la base de datos.");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error de conexión a la base de datos.");
            e.printStackTrace();
        }
    }
    public Connection getConexion() {
        return conexion;
    }

    // Método para cerrar la conexión
    public void cerrarConexion() {
        try {
            if (conexion != null) {
                conexion.close();
                System.out.println("🔌 Conexión cerrada.");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error al cerrar la conexión.");
            e.printStackTrace();
        }
    }
}

