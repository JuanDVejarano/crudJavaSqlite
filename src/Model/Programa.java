import java.sql.ResultSet;
import java.sql.SQLException;

package src.Model;

public class Programa extends Conexion {
    private int idPrograma;
    private String nombrePrograma;

    Conexion conexion = new Conexion();

    //#region Getters and Setters
    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }

    public void setNombrePrograma(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
    }
    //#endregion

    public Programa() {

    }

    public ResultSet consultaGeneral() {
        String sql = "SELECT * FROM Programa";
        return conexion.executeQuery(sql);
    }
}
