/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionempresasempleados;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Gestion extends javax.swing.JFrame {

   
    protected ArrayList<Empresa> listaEmpresas = new ArrayList<>();
  
    
    /**
     * Creates new form Gestion
     */
    public Gestion() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboCategoria = new javax.swing.JComboBox<>();
        comboEmpresas = new javax.swing.JComboBox<>();
        textoDocumento = new javax.swing.JTextField();
        textoNombre = new javax.swing.JTextField();
        textoApellido = new javax.swing.JTextField();
        textoSueldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textoRazonSocial = new javax.swing.JTextField();
        textoCuit = new javax.swing.JTextField();
        botonCrearEmpresa = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonMostrarEmpleados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese datos");

        jLabel2.setText("Documento");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Categoria");

        jLabel6.setText("Sueldo");

        jLabel7.setText("Empresas");

        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Encargado", "Gerente" }));

        jLabel8.setText("Ingrese datos");

        jLabel9.setText("Razon social");

        jLabel10.setText("CUIT");

        botonCrearEmpresa.setText("Crear Empresa");
        botonCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearEmpresaActionPerformed(evt);
            }
        });

        botonGuardar.setText("Guardar");
        botonGuardar.setEnabled(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonMostrarEmpleados.setText("Mostrar Empleados");
        botonMostrarEmpleados.setEnabled(false);
        botonMostrarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarEmpleadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(botonGuardar)
                .addGap(18, 18, 18)
                .addComponent(botonMostrarEmpleados)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(comboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, 132, Short.MAX_VALUE)
                                    .addComponent(textoSueldo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboEmpresas, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                                    .addComponent(textoDocumento)
                                    .addComponent(textoApellido))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(42, 42, 42)
                                        .addComponent(textoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(botonCrearEmpresa)
                                            .addComponent(textoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(101, 101, 101))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(textoRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(textoCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(botonCrearEmpresa)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textoSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonMostrarEmpleados))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCrearEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearEmpresaActionPerformed
        // TODO add your handling code here: 
        try {
            Empresa empresa1 = new Empresa (textoRazonSocial.getText(),Integer.parseInt(textoCuit.getText()));
        if(!listaEmpresas.contains(empresa1)){
        comboEmpresas.addItem(empresa1.getRazonSocial());
        listaEmpresas.add(empresa1);
        botonGuardar.setEnabled(true);
        botonCrearEmpresa.setEnabled(true);
        limpiar2();
        }else{
            JOptionPane.showMessageDialog(this, "ERROR: Esta empresa ya existe");
        }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ERROR: datos mal ingresados.");
        }
        catch(NullPointerException e){
            JOptionPane.showMessageDialog(this, "ERROR: uno o varios campos vacíos.");
        }
        
        
        
    }//GEN-LAST:event_botonCrearEmpresaActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        // TODO add your handling code here:
        
        try {            

            int i;
            for (i=0; i < listaEmpresas.size(); i++) {
                if (listaEmpresas.get(i).getRazonSocial().equals(comboEmpresas.getSelectedItem())) {

                    break;
                }
            }   
            Empleado e = new Empleado(Integer.parseInt(textoDocumento.getText()),
                    textoNombre.getText(),
                    textoApellido.getText(),
                    comboCategoria.getSelectedItem().toString(), 
                    listaEmpresas.get(i),
                    Double.parseDouble(textoSueldo.getText()));

                    listaEmpresas.get(i).agregarEmpleado(e);
                    
                    
                    JOptionPane.showMessageDialog(this, "Empleado agregado");
                    limpiar();
                    botonMostrarEmpleados.setEnabled(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "ERROR: complete todos los campos.");
        }
        
    
               
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonMostrarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarEmpleadosActionPerformed
        // TODO add your handling code here:
        
     // Obtener el nombre de la empresa seleccionada en el JComboBox
    String empresaSeleccionada = (String) comboEmpresas.getSelectedItem();

    // Buscar la empresa en la lista de empresas
    Empresa empresaEncontrada = null;
    for (Empresa empresa : listaEmpresas) {
        if (empresa.getRazonSocial().equals(empresaSeleccionada)) {
            empresaEncontrada = empresa;
            break;
        }
    }

    // Verificar si se encontró la empresa
    if (empresaEncontrada != null) {
        // Obtener la lista de empleados de la empresa
        ArrayList<Empleado> empleadosEmpresa = empresaEncontrada.getEmpleados();

        // Verificar si la empresa tiene empleados
        if (!empleadosEmpresa.isEmpty()) {
            // se crea un StringBuilder--/investigar más info de esto/ para construir el mensaje de empleados
            StringBuilder empleadoInfo = new StringBuilder();
            empleadoInfo.append("Empleados de ").append(empresaEncontrada.getRazonSocial()).append(":\n");

            // Agregar información de cada empleado al mensaje
            for (Empleado empleado : empleadosEmpresa) {
                empleadoInfo.append("DNI: ").append(empleado.getDocumento()).append(", ");
                empleadoInfo.append("Apellido: ").append(empleado.getApellido()).append(", ");
                empleadoInfo.append("Nombre: ").append(empleado.getNombre()).append(", ");
                empleadoInfo.append("Categoría: ").append(empleado.getCategoria()).append(", ");
                empleadoInfo.append("Sueldo: ").append(empleado.getSueldo()).append("\n");
            }

            
            JOptionPane.showMessageDialog(this, empleadoInfo.toString(), "Empleados de la Empresa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "La empresa seleccionada no tiene empleados.", "Sin Empleados", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione una empresa válida.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    

    }//GEN-LAST:event_botonMostrarEmpleadosActionPerformed
  

    
    
    
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
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCrearEmpresa;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMostrarEmpleados;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField textoApellido;
    private javax.swing.JTextField textoCuit;
    private javax.swing.JTextField textoDocumento;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextField textoRazonSocial;
    private javax.swing.JTextField textoSueldo;
    // End of variables declaration//GEN-END:variables
    public void limpiar(){
        textoApellido.setText("");
        textoNombre.setText("");
        textoSueldo.setText("");
        textoCuit.setText("");
        textoDocumento.setText("");
    }
 public void limpiar2(){
     textoRazonSocial.setText("");
     textoCuit.setText("");
 }
}
