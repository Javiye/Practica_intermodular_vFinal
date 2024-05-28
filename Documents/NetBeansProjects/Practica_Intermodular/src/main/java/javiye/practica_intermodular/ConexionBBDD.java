package javiye.practica_intermodular;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author javiy
 */
public class ConexionBBDD {
    // Configuración de la conexión a la base de datos MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/practica_intermodular";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Med@c";

    // Sentencias SQL    
    private static final String SQL_PLANETA = "SELECT * FROM Planetas WHERE Nombre = ?";
    private static final String SQL_SOL = "SELECT * FROM Estrellas WHERE Nombre = 'Sol'";

    /**
     * Método para obtener los datos de un planeta de la base de datos.
     * @param nombrePlaneta el nombre del planeta a consultar
     * @return un array de strings con los datos del planeta
     */
    public String[] obtenerDatosPlaneta(String nombrePlaneta) {
        String[] datosPlaneta = new String[8];
        try (Connection conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             PreparedStatement statement = conexion.prepareStatement(SQL_PLANETA)) {
            
            // Establecer el parámetro en la consulta SQL
            statement.setString(1, nombrePlaneta);
            
            try (ResultSet resultados = statement.executeQuery()) {
                if (resultados.next()) {
                    datosPlaneta[0] = resultados.getString("Radio");
                    datosPlaneta[1] = resultados.getString("Distancia");
                    datosPlaneta[2] = resultados.getString("Periodo");
                    datosPlaneta[3] = resultados.getString("Temperatura");
                    datosPlaneta[4] = resultados.getString("Tipo");
                    datosPlaneta[5] = resultados.getString("Num_Satelites");
                    datosPlaneta[6] = resultados.getString("Fecha_Creacion");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosPlaneta;
    }

    /**
     * Método para obtener los datos de la estrella Sol de la base de datos.
     * @return un array de strings con los datos de la estrella Sol
     */
    public String[] obtenerDatosEstrella() {
        String[] datosSol = new String[6];
        try (Connection conexion = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = conexion.createStatement();
             ResultSet resultados = statement.executeQuery(SQL_SOL)) {
            
            if (resultados.next()) {
                datosSol[0] = resultados.getString("Tipo");
                datosSol[1] = resultados.getString("Radio");
                datosSol[2] = resultados.getString("Temperatura");
                datosSol[3] = resultados.getString("Distancia");
                datosSol[4] = resultados.getString("Composicion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datosSol;
    }
}

