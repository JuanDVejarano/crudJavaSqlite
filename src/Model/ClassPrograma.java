package src.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClassPrograma extends Conexion {
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

    public ClassPrograma() {

    }

    public ArrayList<String[]> consultaGeneral() {
        String sql = "SELECT * FROM T_Programa";
        ArrayList<String[]> result = conexion.executeQuery(sql);
        return result;
    }
}
