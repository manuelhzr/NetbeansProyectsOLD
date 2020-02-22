/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.CUENTA;
import Clases.MOVIMIENTO;
import javax.swing.JOptionPane;

/**
 *
 * @author manue
 */
public class RealizarTransaccion extends javax.swing.JFrame implements Objetos{

    /**
     * Creates new form RealizarTransaccion
     */
    public RealizarTransaccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Retiro = new javax.swing.JRadioButton();
        consignacion = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        idmovimiento = new javax.swing.JTextField();
        Fecha = new javax.swing.JTextField();
        Valor = new javax.swing.JTextField();
        realizante = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Busqueda = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cuentTabajar = new javax.swing.JLabel();
        TirularTabajar = new javax.swing.JLabel();
        SaldoTrabajar = new javax.swing.JLabel();

        setTitle("Transacciones");

        jLabel1.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 24)); // NOI18N
        jLabel1.setText("TRANSACCIONES");

        buttonGroup2.add(Retiro);
        Retiro.setText("Retiro");
        Retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetiroActionPerformed(evt);
            }
        });

        buttonGroup2.add(consignacion);
        consignacion.setText("Consignacion");
        consignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consignacionActionPerformed(evt);
            }
        });

        jLabel2.setText("ID del  movimiento:");

        jLabel3.setText("Fecha: ");

        jLabel4.setText("Valor");

        jLabel5.setText("Nombre de Quien realiza:");

        guardar.setText("Realizar Movimiento");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Numero de cuenta:");

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel7.setText("Nº Cuenta:");

        jLabel8.setText("Titular:");

        jLabel9.setText("Saldo Actual:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(170, 170, 170))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Retiro)
                        .addGap(18, 18, 18)
                        .addComponent(consignacion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guardar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(idmovimiento)
                                .addComponent(Fecha)
                                .addComponent(realizante, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(Valor)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cuentTabajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TirularTabajar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SaldoTrabajar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Retiro)
                    .addComponent(consignacion)
                    .addComponent(jLabel6)
                    .addComponent(Busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idmovimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cuentTabajar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(TirularTabajar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(SaldoTrabajar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(realizante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(jButton2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Principal obj=Objeto;
    MOVIMIENTO Mov;
    CUENTA cuenta=null;
    RealizarTransaccion vent;
    int res;
    
    private void RetiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetiroActionPerformed
        // TODO add your handling code here:
        realizante.setEnabled(false);
    }//GEN-LAST:event_RetiroActionPerformed

    private void consignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consignacionActionPerformed
        // TODO add your handling code here:
        realizante.setEnabled(true);
    }//GEN-LAST:event_consignacionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int bus=Integer.parseInt(Busqueda.getText());
        res=obj.Banco.Buscar(bus);
        if (res!=-1) {
            cuenta=obj.Banco.getListacuenta(res);
            habilitar(true);
            cuentTabajar.setText(String.valueOf(cuenta.getNrocuenta()));
            TirularTabajar.setText(String.valueOf(cuenta.getDatoscliente().getNombre()));
            SaldoTrabajar.setText(String.valueOf(cuenta.getSaldo()));
        }else{
            JOptionPane.showMessageDialog(rootPane, "El numero de cuenta ingresado no se encuentra");
            habilitar(false);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        if (obj.Banco.getListacuenta(res).getPosicionactual() < obj.Banco.getListacuenta(res).getNmovimiento()) {
            if (consignacion.isSelected() || Retiro.isSelected()) {
                Mov = new MOVIMIENTO();
                float val = Float.parseFloat(Valor.getText());

                Mov.setIdmoviento(Integer.parseInt(idmovimiento.getText()));
                Mov.setFecha(Fecha.getText());
                Mov.setValor(val);

                if (consignacion.isSelected()) {
                    Mov.setQuienRealiza(realizante.getText());
                    Mov.setTipo("Consignacion");
                    obj.Banco.getListacuenta(res).Consignaciones(val, Mov);
                }
                if (Retiro.isSelected()) {
                    Mov.setQuienRealiza(obj.Banco.getListacuenta(res).getDatoscliente().getNombre());
                    Mov.setTipo("Retiro");
                    obj.Banco.getListacuenta(res).Retiro(val, Mov);
                }

                JOptionPane.showMessageDialog(rootPane, "Operacion realizada exitosamente");
                limpiar();
                vent = obj.Trans();
                vent.setVisible(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Seleccione el tipo de movimiento");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "La cuenta alcanzo el numero maximo de movimientos permitidos");
            limpiar();
            vent = obj.Trans();
            vent.setVisible(false);
        }

    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        limpiar();
        vent=obj.Trans();
        vent.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void habilitar(boolean val){
        if (val==true) {
            guardar.setEnabled(val);
        }else{
            guardar.setEnabled(val);
        }
    }
    
    private void limpiar(){
        Busqueda.setText("");
        idmovimiento.setText("");
        Fecha.setText("");
        realizante.setText("");
        cuentTabajar.setText("");
        TirularTabajar.setText("");
        SaldoTrabajar.setText("");
        Valor.setText("");
        Retiro.setSelected(false);
        consignacion.setSelected(false);
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
            java.util.logging.Logger.getLogger(RealizarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealizarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealizarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealizarTransaccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealizarTransaccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Busqueda;
    private javax.swing.JTextField Fecha;
    private javax.swing.JRadioButton Retiro;
    private javax.swing.JLabel SaldoTrabajar;
    private javax.swing.JLabel TirularTabajar;
    private javax.swing.JTextField Valor;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton consignacion;
    private javax.swing.JLabel cuentTabajar;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idmovimiento;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField realizante;
    // End of variables declaration//GEN-END:variables
}
