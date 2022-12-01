package clases;

import clases.Cls_Conexion;
import java.sql.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author EnmanuelMontes MarcosFurtado
 */
public class Cls_Clientes {
    /*
    *Creamos el metodo INSERTAR, definimos los campos, y sus volores que seran ingresados cuando se haga la consulta:
    */
    private final String SQL_INSERT = "INSERT INTO clientes(Cedula, Nombre, Apellido, Genero, Telofono, Nacimiento, Peso, Altura) value(?,?,?,?,?,?,?,?)";
    //creamos nueva consulta
    private final String SQL_SELECT = "SELECT * FROM clientes";
    //Creamos objetos *PreparedStatement* Y *Cls_Conexion*. *DefaultTableModel*: 
    private PreparedStatement PS;
    private DefaultTableModel DT;
    private ResultSet RS;
    private final Cls_Conexion CN; 
    
    //creamos constructos intancioamos los objetos:      
    public Cls_Clientes(){
   
    PS = null;
    CN = new Cls_Conexion();
    
    }
    
    // metodo privado que me va a dar los titulos de las tablas, con el numero y nombre de las columnas.
    private DefaultTableModel setTitulos(){
        DT = new DefaultTableModel();
        DT.addColumn("Cédula");
        DT.addColumn("Nombre");
        DT.addColumn("Apellido");
        DT.addColumn("Genero");
        DT.addColumn("Teléfono");
        DT.addColumn("Nacimiento");
        DT.addColumn("Peso");
        DT.addColumn("Altura");
        return DT;
        
    }
    
    //Creamos el metodo para guardar los datos, pedir los argumentos que necesita el metodo para pasarle a la consulta:
    public int insertar(String Cedula, String Nombre, String Apellido, String Genero, String Telefono, String Nacimiento, String Peso, String Altura ){
        int respuesta = 0;
        try {
            PS = CN.getConnetion().prepareStatement(SQL_INSERT);
            PS.setString(1, Cedula);           
            PS.setString(2, Nombre);
            PS.setString(3, Apellido);
            PS.setString(4, Genero);
            PS.setString(5, Telefono);
            PS.setString(6, Nacimiento);
            PS.setString(7, Peso);
            PS.setString(8, Altura);
            respuesta = PS.executeUpdate();//nos devuelve *TRUE* cuando se ejecuta la consulta y devuelve valores y *FALSE* cuando se ejecuta sin devolver valores.
            
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");//si hay un registro exitoso nos muestre un mensaje.
            }
            
        } catch (SQLException e) {
            System.err.println("Error al guardar los datos en BD: " + e.getMessage());//capturamos el error y especificamos cual fue.
            
        } finally { //En caso de error en scripts anteriores en el *try* o en el *catch* siempre se ejecuta el *finally*,
                    //finalizamos la conexion con el metodo *Desconectar* y reiniciamos el objeto *PS*:
            PS = null;
            CN.Desconectar();
        }

        return respuesta;
    }
    //consulta para modificar datos de la tabla:
    public int actualizar(String ID, String Cedula, String Nombre, String Apellido, String Genero, String Telefono, String Nacimiento, String Peso, String Altura ){
        String SQL = "UPDATE clientes SET Cedula='"+Cedula+"', Nombre='"+Nombre+"', Apellido='"+Apellido+"', Genero='"+Genero+"', Telefono='"+Telefono+"',"
                + " Nacimiento='"+Nacimiento+"', Peso='"+ Peso+"', Altura='"+Altura+"'WHERE ID="+ID;
        int respuesta = 0;
        try {
            PS = CN.getConnetion().prepareStatement(SQL);
            respuesta = PS.executeUpdate();//nos devuelve *TRUE* cuando se ejecuta la consulta y devuelve valores y *FALSE* cuando se ejecuta sin devolver valores.
            
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Guardado");//si hay un registro exitoso nos muestre un mensaje.
            }
            
        } catch (SQLException e) {
            System.err.println("Error al guardar los datos en BD: " + e.getMessage());//capturamos el error y especificamos cual fue.
            
        } finally { //En caso de error en scripts anteriores en el *try* o en el *catch* siempre se ejecuta el *finally*,
                    //finalizamos la conexion con el metodo *Desconectar* y reiniciamos el objeto *PS*:
            PS = null;
            CN.Desconectar();
        }

        return respuesta;
    }
    
    public int eliminar(String ID){
        String SQL = "DELATE from clientes WHERE ID" + ID;
        int respuesta = 0;
        try {
            PS = CN.getConnetion().prepareStatement(SQL);
            respuesta = PS.executeUpdate();//nos devuelve *TRUE* cuando se ejecuta la consulta y devuelve valores y *FALSE* cuando se ejecuta sin devolver valores.
            
            if (respuesta > 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");//si hay un registro exitoso nos muestre un mensaje.
            }
            
        } catch (SQLException e) {
            System.err.println("Error al eliminar el dato en BD: " + e.getMessage());//capturamos el error y especificamos cual fue.
            
        } finally { //En caso de error en scripts anteriores en el *try* o en el *catch* siempre se ejecuta el *finally*,
                    //finalizamos la conexion con el metodo *Desconectar* y reiniciamos el objeto *PS*:
            PS = null;
            CN.Desconectar();
        }
        return respuesta;
    }
    
    //metodo para listar los datos:
    public DefaultTableModel getDatos(){
        
        try{
        setTitulos();//continuamos con el procesoco de sentencias *SQL* de la *API* *JDBC* que nos proporciona las clases *preparedStatement* y el metodo *getConnection*.
        PS = CN.getConnetion().prepareStatement(SQL_SELECT);
        RS = (ResultSet) PS.executeQuery();
        
        //creamos mel array, donde alojar las consultas en cada fila de la tabla:
        Object[] fila = new Object[9];
        
        while(RS.next()){//pasamos cada columna de *BD* al Arreglo *filas* la "fila [0]" va a ser igual a la "columna 1":
            fila[0] = RS.getInt(1);
            fila[1] = RS.getString(2); 
            fila[2] = RS.getString(3); 
            fila[3] = RS.getString(4);
            fila[4] = RS.getString(5); 
            fila[5] = RS.getString(6); 
            fila[6] = RS.getString(7); 
            fila[7] = RS.getString(8);
            fila[8] = RS.getString(9);
            DT.addRow(fila);
        }
                
    }catch(SQLException e){
        System.out.print("Error al listar los datos" + e.getMessage());//error que se presente durante el *SELECT*.
  
    }finally{//liberamos recursos y terminamos la conexion:
        PS = null;
        RS = null;
        CN.Desconectar();
    }
    return DT;
    }

}


    

