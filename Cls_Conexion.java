/*
 *conexion a Base de Datos:
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Enmanuelmontes Marcos
 */
public class Cls_Conexion {

/**
 * Creamos el objeto Connection:
 */     
 public static Connection Conexion;
 /*
 * Variables "final" por que no seran altradas en tiempo de ejecucion. *DRIVER* referencia al driver importado para la conexion,
 *USER* "root" usuario default del mysql, *PASSWORD* vacia por que no le puse contraseña, y el *URL* donde esta hosteada la BD, *puerto* (3306) que es el que nos indica el XAMP.
 */
 private static final String DRIVER = "com.mysql.jdbc.Driver";
 private static final String URL = "jdbc:mysql://localhost:3306/gimnasio?autoReconnect=true&useSSL=false";//"?autoReconnect=true&useSSL=false" para evitar alertas de conexion SSL.
 private static final String USER = "root";
 private static final String PASSWORD = "";
/*
 *creamos el constructor que es un metodo con el nombre de la clase, iniciamos la variable Conexion en null:
 */ 

  public  Cls_Conexion() {
      Conexion = null;
/*
*creamos el try cath para que capture errores de conexion:      
*/      
      try {
          Class.forName(DRIVER);
          Conexion = DriverManager.getConnection(URL,USER,PASSWORD);//le pasamos (URL,USER,PASSWORD), con este script ya nos conectamos a BD, pero hacemos un *if* que nos avise de la conexion.
          if(Conexion != null){
              System.out.println("Conexion establecida. ");
          }
      }catch(ClassNotFoundException | SQLException e){
          System.out.println("error al conectar");
      } 
  }
  // metodo que retorne conexion:
  public Connection getConnetion(){
      
     return Conexion;
      
  }
  // metodo desconectarse de BD:
  public void Desconectar(){
      Conexion = null;
      if(Conexion == null){
          System.out.println("Conexion finalizada");
      }
  }
}
