package src.Model;

public class ClassAlumno extends Conexion {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String correo;
    private int idPrograma;

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

    public boolean insertAlumno() {
        String sql = "insert into T_Alumno Values (" + cedula + ", '" + nombre + "', '" + apellidos + "', '" + celular + "', '" + correo + "', " + idPrograma + ");";
        if (conexion.executeUpdate(sql)) {
            return true;
        } else {
            return false;
        }
    }
}