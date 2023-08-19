package diagnostico;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/Diagnostico";
    private static final String USUARIO = "root"; // Cambia esto
    private static final String CONTRASENA = "root"; // Cambia esto

    public static Connection obtenerConexion() {
        Connection conexion = null;
        try {
            // Cargar el driver de MySQL (usando el nuevo nombre del driver)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Obtener la conexión
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            System.out.println("Conexión establecida correctamente.");
            return conexion;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
            return null;
        }
    }

    // Resto del código...

    public static void main(String[] args) {
    
    }
}
