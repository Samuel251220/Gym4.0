
package DaoImp;

import Dao.UsuarioDao;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class UsuarioDaoImp implements UsuarioDao{
  
  private Statement st;
  private CallableStatement cst;
  private ResultSet rs;
  private Connection cx;

  @Override
  public HashMap<String, Object> validar(String x, String y) {
    
    HashMap<String, Object> map = new HashMap<>();
    try {
      cx = Conexion.getConexion();
      cst = cx.prepareCall("{call validarLogin(?,?)}");
      cst.setString(1, x);
      cst.setString(2, y);
      rs = cst.executeQuery();
      while (rs.next()) {
        map.put("idu", rs.getInt("idUsuario"));
        map.put("cla", y);
        map.put("nick", rs.getString("Nick"));
        map.put("nom", rs.getString("NomPersona"));
        map.put("apell", rs.getString("ApePersona"));
        map.put("tipo", rs.getString("NomTipo"));
        map.put("idp", rs.getString("idPersona"));
      }
    } catch (SQLException e) {
      System.out.println("Error:" + e);
    }
    return map;
    
  }
  
}
