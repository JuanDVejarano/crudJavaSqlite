package src.View;

import java.sql.ResultSet;

import src.Model.Conexion;

public class Index {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Conexion conexion = new Conexion();
        ResultSet rs;
        // Consulta
        String sql = "SELECT * FROM T_Alumnos";
        rs = conexion.executeQuery(sql);
        System.out.println("Consulta:" + rs);

        // Inserción
        sql = "insert into T_Alumnos Values (14, 'Alejandra', 'Quiroga', '3203324478', 'MiEmail@gamil.com', 5, 7);";
        if (conexion.executeUpdate(sql)) {
            System.out.println("Inserción exitosa");
        } else {
            System.out.println("Error en la inserción");
        }

    }

}
