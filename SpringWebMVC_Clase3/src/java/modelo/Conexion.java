
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection cnn;// conectar a la base datos
    Statement stm;// ejecutar una query
    ResultSet res;// guardar el resultado de una consulta

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");//driver
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueb?zeroDateTimeBehavior=convertToNull", "root", "");//url, usurio y password
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet consultarTodo() {

        try {

            String query = "Select *from persona";
            stm = cnn.createStatement();
            res = stm.executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return res;
    }

}

