import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mangajr","root","12345");
            if(connection != null){
                System.out.println("Conexion exitosa");
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }
}
