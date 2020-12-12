package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexionSQL {

    //Variable de conexión
    Connection con;

    //Constructor
    public conexionSQL() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true", "root", "");
        } catch (SQLException e) {

        }
    }

    public Connection getConnection() {
        return con;
    }

}
