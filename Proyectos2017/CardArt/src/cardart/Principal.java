/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardart;

import java.awt.CardLayout;
import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SINUTECH
 */
public class Principal extends javax.swing.JFrame {
    
    DefaultTableModel model;
    boolean principal, buscar, salir, agregar; 
    CardLayout card;
    public Principal() {
        initComponents();
        principal = buscar = salir = agregar = false;
        card = (CardLayout) Panel_principal.getLayout();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_contenido = new javax.swing.JPanel();
        btn_principal = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        Panel_principal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setMaximumSize(new java.awt.Dimension(623, 290));
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        panel_contenido.setMaximumSize(new java.awt.Dimension(623, 290));
        panel_contenido.setMinimumSize(new java.awt.Dimension(623, 290));
        panel_contenido.setLayout(null);

        btn_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/principal.png"))); // NOI18N
        btn_principal.setToolTipText("");
        btn_principal.setBorder(null);
        btn_principal.setBorderPainted(false);
        btn_principal.setContentAreaFilled(false);
        btn_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_principal.setFocusPainted(false);
        btn_principal.setMaximumSize(new java.awt.Dimension(229, 61));
        btn_principal.setMinimumSize(new java.awt.Dimension(229, 61));
        btn_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_principalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_principalMouseExited(evt);
            }
        });
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });
        panel_contenido.add(btn_principal);
        btn_principal.setBounds(-175, 10, 229, 62);

        btn_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btn_agregar.setToolTipText("");
        btn_agregar.setBorder(null);
        btn_agregar.setBorderPainted(false);
        btn_agregar.setContentAreaFilled(false);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.setFocusPainted(false);
        btn_agregar.setMaximumSize(new java.awt.Dimension(229, 61));
        btn_agregar.setMinimumSize(new java.awt.Dimension(229, 61));
        btn_agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_agregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_agregarMouseExited(evt);
            }
        });
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });
        panel_contenido.add(btn_agregar);
        btn_agregar.setBounds(-174, 80, 228, 62);

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btn_buscar.setToolTipText("");
        btn_buscar.setBorder(null);
        btn_buscar.setBorderPainted(false);
        btn_buscar.setContentAreaFilled(false);
        btn_buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_buscar.setFocusPainted(false);
        btn_buscar.setMaximumSize(new java.awt.Dimension(229, 61));
        btn_buscar.setMinimumSize(new java.awt.Dimension(229, 61));
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_buscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_buscarMouseExited(evt);
            }
        });
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        panel_contenido.add(btn_buscar);
        btn_buscar.setBounds(-172, 150, 226, 61);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir2.png"))); // NOI18N
        btn_salir.setToolTipText("");
        btn_salir.setBorder(null);
        btn_salir.setBorderPainted(false);
        btn_salir.setContentAreaFilled(false);
        btn_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_salir.setFocusPainted(false);
        btn_salir.setMaximumSize(new java.awt.Dimension(229, 61));
        btn_salir.setMinimumSize(new java.awt.Dimension(229, 61));
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salirMouseExited(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        panel_contenido.add(btn_salir);
        btn_salir.setBounds(-174, 220, 229, 62);

        Panel_principal.setBackground(new java.awt.Color(0, 121, 107));
        Panel_principal.setMaximumSize(new java.awt.Dimension(560, 290));
        Panel_principal.setMinimumSize(new java.awt.Dimension(560, 290));
        Panel_principal.setLayout(new java.awt.CardLayout());
        panel_contenido.add(Panel_principal);
        Panel_principal.setBounds(60, 0, 560, 290);

        getContentPane().add(panel_contenido, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_principalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_principalMouseEntered
        if(!principal){
            Animacion.Animacion.mover_derecha(-175, 0, 1, 2, btn_principal);
        }
    }//GEN-LAST:event_btn_principalMouseEntered

    private void btn_principalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_principalMouseExited
        if(!principal){
        Animacion.Animacion.mover_izquierda(0, -175, 1, 2, btn_principal);
        }
    }//GEN-LAST:event_btn_principalMouseExited

    private void btn_agregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseEntered
        if(!agregar){
            Animacion.Animacion.mover_derecha(-174, 0, 1, 2, btn_agregar);
        }
    }//GEN-LAST:event_btn_agregarMouseEntered

    private void btn_agregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_agregarMouseExited
         if(!agregar){
        Animacion.Animacion.mover_izquierda(0, -174, 1, 2, btn_agregar);
        }
    }//GEN-LAST:event_btn_agregarMouseExited

    private void btn_buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseEntered
       if(!buscar){
            Animacion.Animacion.mover_derecha(-172, 0, 1, 2, btn_buscar);
        }
    }//GEN-LAST:event_btn_buscarMouseEntered

    private void btn_buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseExited
         if(!buscar){
        Animacion.Animacion.mover_izquierda(0, -172, 1, 2, btn_buscar);
        }
    }//GEN-LAST:event_btn_buscarMouseExited

    private void btn_salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseEntered
        if(!salir){
            Animacion.Animacion.mover_derecha(-174, 0, 1, 2, btn_salir);
        }
    }//GEN-LAST:event_btn_salirMouseEntered

    private void btn_salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseExited
         if(!salir){
        Animacion.Animacion.mover_izquierda(0, -174, 1, 2, btn_salir);
        }
    }//GEN-LAST:event_btn_salirMouseExited

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
//      Buscar obj = new Buscar();  
//        obj.setVisible(false);
//        Principal cc = new Principal();
//        cc.setVisible(false);
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
         MostrarBusqueda();
         Principal cc = new Principal();
         cc.cargar("",Buscar.BoxCategoria.getSelectedItem().toString());
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed
        MostrarAgregar();
    }//GEN-LAST:event_btn_agregarActionPerformed

    void cargar(String men, String cat){
        String [] titulos={"Codigo","Mensaje"};
        String [] registros = new String[2];
        String sql = "SELECT * FROM "+cat+" where tex_me LIKE '%"+men+"%'";
        
        model = new DefaultTableModel(null,titulos);
        Conectar cc = new Conectar();
        Connection cn = cc.conexion();
        
         
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registros[0]=rs.getString("cod_me");
                registros[1]=rs.getString("tex_me");
                model.addRow(registros);
            }
         Buscar.t_datos.setModel(model); 
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
           
        
    }
    public void MostrarPrincipal(){     
        Panel_principal.removeAll();
        
        //buscar = true;
        principal = salir = agregar = false;
        //btn_principal.setLocation(-175, btn_principal.getY());
        btn_agregar.setLocation(-174, btn_agregar.getY());
        btn_salir.setLocation(-174, btn_salir.getY());
        btn_buscar.setLocation(-172, btn_buscar.getY());
        SwingUtilities.updateComponentTreeUI(this);
        
        }
    public void MostrarBusqueda(){
        Buscar bus = new Buscar();    
        Panel_principal.add(bus,"name");
        card.show(Panel_principal, "name");
        //buscar = true;
        principal = salir = agregar = false;
        btn_principal.setLocation(-175, btn_principal.getY());
        btn_agregar.setLocation(-174, btn_agregar.getY());
        btn_salir.setLocation(-174, btn_salir.getY());
        //btn_buscar.setLocation(-172, btn_buscar.getY());
        SwingUtilities.updateComponentTreeUI(this);
        
        }
    
    public void MostrarAgregar(){
        AgregarUI bus = new AgregarUI();    
        Panel_principal.add(bus,"name");
        card.show(Panel_principal, "name");
        //buscar = true;
        principal = salir = agregar = false;
        btn_principal.setLocation(-175, btn_principal.getY());
        //btn_agregar.setLocation(-174, btn_agregar.getY());
        btn_salir.setLocation(-174, btn_salir.getY());
        btn_buscar.setLocation(-172, btn_buscar.getY());
        SwingUtilities.updateComponentTreeUI(this);
        
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_principal;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_principal;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel panel_contenido;
    // End of variables declaration//GEN-END:variables
}
