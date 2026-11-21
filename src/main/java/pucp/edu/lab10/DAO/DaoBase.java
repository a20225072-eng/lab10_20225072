package pucp.edu.lab10.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static java.lang.Class.forName;
public abstract  class DaoBase {
    private static final String URL=" jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASS = "12345678";

    public Connection getConnection() throws SQLException {

        try{
            Class.forName("con.mysql.cj.jdbc.Driver");

        }catch(ClassNotFoundException ex){
            ex.printStackTrace();
            throw new UnsupportedOperationException("getConnection() aún no implementado");
        }

        return  DriverManager.getConnection(URL, USER, PASS);


    }

}