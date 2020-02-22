
package cardart;

import java.sql.*;
import javax.swing.*;

public class Conectar {
    Connection conect = null;
    public Connection conexion()
        {
            try {
//                Cargamos el Driver MySQL;
                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("org.gjt.mm.mysql.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://localhost/mn","root",""); 
//                JOptionPane.showMessageDialog(null, "conec");
            }catch (ClassNotFoundException | SQLException e) {
                //System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
    
}
