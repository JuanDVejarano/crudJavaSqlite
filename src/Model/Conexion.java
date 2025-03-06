package src.Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Conexion {

    private Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            //String url = "jdbc:sqlite:/home/juanj/Projects-Java/crud/db/Alumnos.db";
            String url = "jdbc:sqlite:src/db/Alumnos.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    private void closeConnection(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Connection to SQLite has been closed.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    protected boolean executeUpdate(String sql) {
        Connection conn = null;
        try {
            conn = this.connect();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("SQL statement executed successfully.");
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    protected ArrayList<String[]> executeQuery(String sql) {
        ResultSet rs = null;
        Connection conn = null;
        ArrayList<String[]> resultList = new ArrayList<>();
        try {
            conn = this.connect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            int columnCount = rs.getMetaData().getColumnCount();
            while (rs.next()) {
                String[] row = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getString(i);
                }
                resultList.add(row);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            closeConnection(conn);
        }
        return resultList;
    }
}
