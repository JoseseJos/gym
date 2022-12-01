/*
 * 
 */
package formularios;

import clases.Cls_Clientes;
import javax.swing.JOptionPane;
/**
 *
 * @author EnmanuelMontes MarcosFurtado
 */
public class Frm_Clientes extends javax.swing.JFrame {
    // Instanciamos la clase Cls_Clientes y lo iniciamos en el constructor
   private final Cls_Clientes ClaseClientes;
   int numero = 0;
    
    public Frm_Clientes() {
        initComponents();
        ClaseClientes = new Cls_Clientes();
        listar();
        this.setLocationRelativeTo(null);
    }
    
    //llamamos al metodo para que enliste los datos en la tabla, agregamos el modelo que devuelve los datos,lo obtenemos del metodo *ClaseClientes*:
    private void listar(){
        jTblClientes.setModel(ClaseClientes.getDatos());
    }
    
    private void limpiar(){
        jTFCedula.setText("");
        jTFNombre.setText("");
        jTFApellido.setText("");
        jTFGenero.setText("");
        jTFTelefono.setText("");
        jTFNacimiento.setText("");
        jTFPeso.setText("");
        jTFAltura.setText("");
    }
    
    private void guardar(){//para que el mismo botom de *guardar* guarde los cambios de la tabla.
        //llamamos al metodo *IsertarDatos* y le pasamos los datos de los *jTextField*
            String Cedula = jTFCedula.getText();
            String Nombre = jTFNombre.getText();
            String Apellido = jTFApellido.getText();
            String Genero = jTFGenero.getText();
            String Telefono = jTFTelefono.getText();
            String Nacimiento = jTFNacimiento.getText();
            String Peso = jTFPeso.getText();
            String Altura = jTFAltura.getText();
    if (numero == 0){
 
        int respuesta = ClaseClientes.insertarDatos(Cedula, Nombre, Apellido, Genero, Telefono, Nacimiento, Peso, Altura);
        if(respuesta > 0){
            listar();
            limpiar();
        }
    }else{
        int respuesta = ClaseClientes.actualizar(Cedula, Nombre, Apellido, Genero, Telefono, Nacimiento, Peso, Altura);
        if(respuesta > 0){
            listar();
            limpiar();
            numero = 0;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLblClientes = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblCedula = new javax.swing.JLabel();
        jLblApellido = new javax.swing.JLabel();
        jLblGenero = new javax.swing.JLabel();
        jLblTelefono = new javax.swing.JLabel();
        jLblNacimiento = new javax.swing.JLabel();
        jLblAltura = new javax.swing.JLabel();
        jLblPeso = new javax.swing.JLabel();
        jTFAltura = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jTFPeso = new javax.swing.JTextField();
        jTFNacimiento = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFGenero = new javax.swing.JTextField();
        jTFApellido = new javax.swing.JTextField();
        jTFCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblClientes = new javax.swing.JTable();
        jBtnEliminar = new javax.swing.JButton();
        jBtnGuardar = new javax.swing.JButton();
        jBtnVerificar = new javax.swing.JButton();
        jBtnActualizar = new javax.swing.JButton();
        jLblGym = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("GYM");

        jLabel8.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CLIENTES");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLblClientes.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLblClientes.setForeground(new java.awt.Color(0, 0, 0));
        jLblClientes.setText("CLIENTES");
        jPanel2.add(jLblClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLblNombre.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblNombre.setForeground(new java.awt.Color(0, 0, 0));
        jLblNombre.setText("NOMBRE");
        jPanel2.add(jLblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLblCedula.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblCedula.setForeground(new java.awt.Color(0, 0, 0));
        jLblCedula.setText("CÉDULA");
        jPanel2.add(jLblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLblApellido.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblApellido.setForeground(new java.awt.Color(0, 0, 0));
        jLblApellido.setText("APELLIDO");
        jPanel2.add(jLblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLblGenero.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblGenero.setForeground(new java.awt.Color(0, 0, 0));
        jLblGenero.setText("GENERO");
        jPanel2.add(jLblGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLblTelefono.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jLblTelefono.setText("TELÉFONO");
        jPanel2.add(jLblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLblNacimiento.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        jLblNacimiento.setText("NACIMIENTO");
        jPanel2.add(jLblNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLblAltura.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblAltura.setForeground(new java.awt.Color(0, 0, 0));
        jLblAltura.setText("ALTURA");
        jPanel2.add(jLblAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLblPeso.setFont(new java.awt.Font("Eras Bold ITC", 0, 24)); // NOI18N
        jLblPeso.setForeground(new java.awt.Color(0, 0, 0));
        jLblPeso.setText("PESO");
        jPanel2.add(jLblPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTFAltura.setBackground(new java.awt.Color(0, 0, 0));
        jTFAltura.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFAltura.setForeground(new java.awt.Color(255, 255, 255));
        jTFAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFAltura.setText("INGRESE SU ALTURA");
        jPanel2.add(jTFAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 390, 30));

        jTFNombre.setBackground(new java.awt.Color(0, 0, 0));
        jTFNombre.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFNombre.setForeground(new java.awt.Color(255, 255, 255));
        jTFNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFNombre.setText("INGRESE SU NOMBRE");
        jPanel2.add(jTFNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 390, 30));

        jTFPeso.setBackground(new java.awt.Color(0, 0, 0));
        jTFPeso.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFPeso.setForeground(new java.awt.Color(255, 255, 255));
        jTFPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFPeso.setText("INGRESE SU PESO");
        jPanel2.add(jTFPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 390, 30));

        jTFNacimiento.setBackground(new java.awt.Color(0, 0, 0));
        jTFNacimiento.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFNacimiento.setForeground(new java.awt.Color(255, 255, 255));
        jTFNacimiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFNacimiento.setText("INGRESE SU NACIMIENTO");
        jPanel2.add(jTFNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 390, 30));

        jTFTelefono.setBackground(new java.awt.Color(0, 0, 0));
        jTFTelefono.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFTelefono.setForeground(new java.awt.Color(255, 255, 255));
        jTFTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFTelefono.setText("INGRESE SU TELÉFONO");
        jPanel2.add(jTFTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 390, 30));

        jTFGenero.setBackground(new java.awt.Color(0, 0, 0));
        jTFGenero.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFGenero.setForeground(new java.awt.Color(255, 255, 255));
        jTFGenero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFGenero.setText("INGRESE SU GENERO");
        jPanel2.add(jTFGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 390, 30));

        jTFApellido.setBackground(new java.awt.Color(0, 0, 0));
        jTFApellido.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFApellido.setForeground(new java.awt.Color(255, 255, 255));
        jTFApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFApellido.setText("INGRESE SU APELLIDO");
        jPanel2.add(jTFApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 390, 30));

        jTFCedula.setBackground(new java.awt.Color(0, 0, 0));
        jTFCedula.setFont(new java.awt.Font("Eras Demi ITC", 0, 14)); // NOI18N
        jTFCedula.setForeground(new java.awt.Color(255, 255, 255));
        jTFCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTFCedula.setText("INGRESE SU CÉDULA");
        jPanel2.add(jTFCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 390, 30));

        jTblClientes.setBackground(new java.awt.Color(0, 0, 0));
        jTblClientes.setForeground(new java.awt.Color(255, 255, 255));
        jTblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTblClientes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 560, 350));

        jBtnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnEliminar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jBtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnEliminar.setText("ELIMINAR");
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 750, -1, -1));

        jBtnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnGuardar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jBtnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnGuardar.setText("GUARDAR");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 750, -1, -1));

        jBtnVerificar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnVerificar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jBtnVerificar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnVerificar.setText("VERIFICAR");
        jBtnVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerificarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 750, -1, -1));

        jBtnActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jBtnActualizar.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jBtnActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jBtnActualizar.setText("ACTUALZAR");
        jBtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActualizarActionPerformed(evt);
            }
        });
        jPanel2.add(jBtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 750, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 6, 580, 790));

        jLblGym.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLblGym.setForeground(new java.awt.Color(255, 255, 255));
        jLblGym.setText("GYM");
        jPanel1.add(jLblGym, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1252, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 805, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        guardar();
    }                                           

    private void jTblClientesMouseClicked(java.awt.event.MouseEvent evt) {                                          
        int row = jTblClientes.getSelectedRow();
        jTFCedula.setText(jTblClientes.getValueAt(row, 0).toString());
        jTFNombre.setText(jTblClientes.getValueAt(row, 1).toString());
        jTFApellido.setText(jTblClientes.getValueAt(row, 2).toString());
        jTFGenero.setText(jTblClientes.getValueAt(row, 3).toString());
        jTFTelefono.setText(jTblClientes.getValueAt(row, 4).toString());
        jTFNacimiento.setText(jTblClientes.getValueAt(row, 5).toString());
        jTFPeso.setText(jTblClientes.getValueAt(row, 6).toString());
        jTFAltura.setText(jTblClientes.getValueAt(row, 7).toString());
        
        numero = 1;
    }                                         

    private void jBtnVerificarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        listar();
    }                                             

    private void jBtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        actualizar();
    }                                              

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        int fila = jTblClientes.getSelectedRowCount();
        
        if(fila < 1){
            JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
          
        }else{
            if (ClaseClientes.eliminar(jTblClientes.getValueAt(jTblClientes.getSelectedRow(),0).toString()) > 0){//si el resultado de la eliminacion es mayor a 0 que se ejecuten los metodos:
            limpiar();
            listar();
            }
        }
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frm_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnActualizar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnVerificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLblAltura;
    private javax.swing.JLabel jLblApellido;
    private javax.swing.JLabel jLblCedula;
    private javax.swing.JLabel jLblClientes;
    private javax.swing.JLabel jLblGenero;
    private javax.swing.JLabel jLblGym;
    private javax.swing.JLabel jLblNacimiento;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblPeso;
    private javax.swing.JLabel jLblTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFAltura;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFCedula;
    private javax.swing.JTextField jTFGenero;
    private javax.swing.JTextField jTFNacimiento;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPeso;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTable jTblClientes;
    // End of variables declaration                   

}
