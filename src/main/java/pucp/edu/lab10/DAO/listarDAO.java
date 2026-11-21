package pucp.edu.lab10.DAO;
import java.util.ArrayList;

public class listarDAO extends DaoBase {
    public ArrayList <listarDTO> listar(){
        ArrayList<> lista = new ArrayList<>();
        string sql=select * from     ;
        try(Connection con=this.getConection();
        PreparedStatement pstmt=com.createStatemenc(aql);){
            try (resulSet rs=pstmt.executeQuery()){

            }
        }
        return new ArrayList<>();
    }
}
