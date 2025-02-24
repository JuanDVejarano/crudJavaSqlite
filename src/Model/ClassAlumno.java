public class ClassAlumno extends Conexion {
    private int cedula;
    private String nombre;
    private String apellidos;
    private String celular;
    private String correo;
    private int idPrograma;
    private int idSede;

    Conexion conexion = new Conexion();

    public ClassAlumno(int cedula, String nombre, String apellidos, String celular, String correo, int idPrograma, int idSede) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.celular = celular;
        this.correo = correo;
        this.idPrograma = idPrograma;
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

    public void insrtAlumno() {
        String sql = "insert into T_Alumnos Values (" + cedula + ", '" + nombre + "', '" + apellidos + "', '" + celular + "', '" + correo + "', " + idPrograma + ", " + idSede + ");";
        if (conexion.executeUpdate(sql)) {
            System.out.println("Inserción exitosa");
        } else {
            System.out.println("Error en la inserción");
        }
    }
}