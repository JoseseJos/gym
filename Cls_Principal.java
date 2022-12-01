/*
 * Clase Principal
 */
package Gimnasio;

import formularios.Frm_Clientes;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author EnmanuelMontes MarcosFurtado
 */
public class Cls_Principal {
    
    public static void main(String[] args){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());//La app toma la apariencia de acuardo al SO.
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(),"Error al aplicar el estilo al sistema",JOptionPane.ERROR_MESSAGE);
        }
    
    Frm_Clientes FormularioClientes = new Frm_Clientes (); 
    FormularioClientes.setVisible(true);
    }
}
