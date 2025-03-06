package src.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ClassAlumno extends Conexion {

    //#region Attributes
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String correo;
    private int idPrograma;
    //#endregion

    Conexion conexion = new Conexion();

    public ClassAlumno() {
       
    }

    //#region Getters and Setters
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(int idPrograma) {
        this.idPrograma = idPrograma;
    }
    //#endregion


    //#region Methods

    public boolean insertAlumno() {
        String sql = "insert into T_Alumno Values (" + cedula + ", '" + nombre + "', '" + apellidos + "', '" + celular + "', '" + correo + "', " + idPrograma + ");";
        if (conexion.executeUpdate(sql)) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<String[]> consultaGeneral() {
        String sql = "SELECT Num_ID as Cedula, Nombre, Apellidos, Celular, Correo, Programa FROM T_Alumno inner join T_Programa on T_Alumno.FK_IdPrograma = T_Programa.ID;";
        ArrayList<String[]> result = conexion.executeQuery(sql);
        return result;
    }

    public ArrayList<String[]> consultaNombre(String nombre) {
        String sql = "SELECT Num_ID as Cedula, Nombre, Apellidos, Celular, Correo, Programa FROM T_Alumno inner join T_Programa on T_Alumno.FK_IdPrograma = T_Programa.ID where Nombre like '%" + nombre + "%';";
        ArrayList<String[]> result = conexion.executeQuery(sql);
        return result;
    }

    public ArrayList<String[]> consultaCedula(int cedula) {
        String sql = "SELECT Num_ID as Cedula, Nombre, Apellidos, Celular, Correo, Programa FROM T_Alumno inner join T_Programa on T_Alumno.FK_IdPrograma = T_Programa.ID where Num_ID = " + cedula + ";";
        ArrayList<String[]> result = conexion.executeQuery(sql);
        return result;
    }

    //#endregion
}