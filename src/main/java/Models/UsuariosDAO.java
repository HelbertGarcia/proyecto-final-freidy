package Models;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public Usuarios login(String nombreUsuario, String contraseñaUsuario){
    String sql = "SELECT * FROM usuarios WHERE nombreUsuario = ? AND contraseñaUsuario = ?";
    Usuarios us = new Usuarios();
        try {
            con = cn.getConexion();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUsuario);
            ps.setString(2, contraseñaUsuario);
            rs = ps.executeQuery();
            if(rs.next()){
                us.setIdUsuario(rs.getInt("idUsuario"));
                us.setNombreUsuario(rs.getString("nombreUsuario"));
                us.setContrasenaUsuario(rs.getString("contraseñaUsuario"));
                us.setTipo(rs.getString("tipo"));
                us.setIdEmpleado(rs.getInt("idEmpleado"));
            }
            else{
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return us;
    }
}
