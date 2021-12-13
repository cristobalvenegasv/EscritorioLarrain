/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author cris
 */
public class GraficoBarras extends javax.swing.JFrame {

    String user;
    
    /**
     * Creates new form GraficoEstado
     */
    public GraficoBarras() {
        initComponents();
        
        user = Login.user;
        
        setSize(760, 500);
        setTitle("Gráfico de ventas por mes");
        setResizable(false);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon fondo = new ImageIcon("src/imagenes/blanco.jpg");
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabel_Fondo.getWidth(),jLabel_Fondo.getHeight(),
                Image.SCALE_DEFAULT));
        jLabel_Fondo.setIcon(icono);
        this.repaint();
    }
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/Favicon.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel_Barras = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Cantidad1 = new javax.swing.JTextField();
        jTextField_Cantidad2 = new javax.swing.JTextField();
        jTextField_Cantidad3 = new javax.swing.JTextField();
        jTextField_Cantidad4 = new javax.swing.JTextField();
        jTextField_Cantidad5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField_Cantidad6 = new javax.swing.JTextField();
        jTextField_Cantidad7 = new javax.swing.JTextField();
        jTextField_Cantidad8 = new javax.swing.JTextField();
        jTextField_Cantidad9 = new javax.swing.JTextField();
        jTextField_Cantidad10 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField_Cantidad11 = new javax.swing.JTextField();
        jTextField_Cantidad12 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gráfico de Ventas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 15, 210, 30));
        getContentPane().add(jPanel_Barras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 710, 230));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Agosto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Septiembre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Octubre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Noviembre");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Diciembre");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, -1, -1));

        jTextField_Cantidad1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad1KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 70, -1));

        jTextField_Cantidad2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad2KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 70, -1));

        jTextField_Cantidad3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad3KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 70, -1));

        jTextField_Cantidad4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad4KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 70, -1));

        jTextField_Cantidad5.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad5KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 70, -1));

        jButton1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton1.setText("Generar gráfico");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        jTextField_Cantidad6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad6KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 70, -1));

        jTextField_Cantidad7.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad7KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));

        jTextField_Cantidad8.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad8KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 70, -1));

        jTextField_Cantidad9.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad9KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 70, -1));

        jTextField_Cantidad10.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad10KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 70, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Julio");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextField_Cantidad11.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad11KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 70, -1));

        jTextField_Cantidad12.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextField_Cantidad12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Cantidad12KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Cantidad12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, 70, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Enero");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel9.setText("Febrero");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Marzo");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Abril");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel12.setText("Mayo");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Junio");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        

        if (jTextField_Cantidad1.getText().isEmpty() || jTextField_Cantidad2.getText().isEmpty() || jTextField_Cantidad3.getText().isEmpty()
                || jTextField_Cantidad4.getText().isEmpty() || jTextField_Cantidad5.getText().isEmpty() || jTextField_Cantidad6.getText().isEmpty()
                || jTextField_Cantidad7.getText().isEmpty() || jTextField_Cantidad8.getText().isEmpty() || jTextField_Cantidad9.getText().isEmpty()
                || jTextField_Cantidad10.getText().isEmpty() || jTextField_Cantidad11.getText().isEmpty() || jTextField_Cantidad12.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No dejar campos vacíos. Si en el mes no se realizaron ventas dejar en 0");
        } else {
            
            // Defino las variables tipo entero en donde almacenare las cantidades que se escriben en los campos de texto
            int cantidad1 = Integer.parseInt(jTextField_Cantidad1.getText());
            int cantidad2 = Integer.parseInt(jTextField_Cantidad2.getText());
            int cantidad3 = Integer.parseInt(jTextField_Cantidad3.getText());
            int cantidad4 = Integer.parseInt(jTextField_Cantidad4.getText());
            int cantidad5 = Integer.parseInt(jTextField_Cantidad5.getText());
            int cantidad6 = Integer.parseInt(jTextField_Cantidad6.getText());
            int cantidad7 = Integer.parseInt(jTextField_Cantidad7.getText());
            int cantidad8 = Integer.parseInt(jTextField_Cantidad8.getText());
            int cantidad9 = Integer.parseInt(jTextField_Cantidad9.getText());
            int cantidad10 = Integer.parseInt(jTextField_Cantidad10.getText());
            int cantidad11 = Integer.parseInt(jTextField_Cantidad11.getText());
            int cantidad12 = Integer.parseInt(jTextField_Cantidad12.getText());


            // Defino una clase la cual sirve para comenzar a graficar

            DefaultCategoryDataset datos = new DefaultCategoryDataset();

            // Aquí establecemos los valores que llevará nuestro grafico, gracias al metodo setValue donde le agregamos
            // la cantidad, las ordenes y los meses
            datos.setValue(cantidad1, "Ventas", "Enero");
            datos.setValue(cantidad2, "Ventas", "Febrero");
            datos.setValue(cantidad3, "Ventas", "Marzo");
            datos.setValue(cantidad4, "Ventas", "Abril");
            datos.setValue(cantidad5, "Ventas", "Mayo");
            datos.setValue(cantidad6, "Ventas", "Junio");
            datos.setValue(cantidad7, "Ventas", "Julio");
            datos.setValue(cantidad8, "Ventas", "Agosto");
            datos.setValue(cantidad9, "Ventas", "Septiembre");
            datos.setValue(cantidad10, "Ventas", "Octubre");
            datos.setValue(cantidad11, "Ventas", "Noviembre");
            datos.setValue(cantidad12, "Ventas", "Diciembre");

            JFreeChart barras = ChartFactory.createBarChart3D(
                    "Ventas realizadas",           //Nombre del gráfico
                    "Meses",                        //Nombre de las barras
                    "Ventas",                      //Nombre de la numeración
                    datos,                          //Datos del gráfico
                    PlotOrientation.VERTICAL,       //Orientación del gráfico
                    true,                           //Leyendas de barras
                    true,                           //Herramientas 
                    false                           //Url del gráfico

            );

            // Acá creo un objeto de la clase ChartPanel proveniente de la librería y a este le asigno el grafico "barras"
            ChartPanel panel = new ChartPanel(barras);
            // Es para interactuar con la rueda del mouse
            panel.setMouseWheelEnabled(true);
            // Dimensiones del panel
            panel.setPreferredSize(new Dimension(510,230));

            // Establecemos el borde 
            jPanel_Barras.setLayout(new java.awt.BorderLayout());
            // Agregamos el panel a nuestro jPanel
            jPanel_Barras.add(panel);
            // Para visualizar correctamente se valida
            jPanel_Barras.validate();

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField_Cantidad1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad1KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad1KeyTyped

    private void jTextField_Cantidad2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad2KeyTyped

    private void jTextField_Cantidad3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad3KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad3KeyTyped

    private void jTextField_Cantidad4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad4KeyTyped

    private void jTextField_Cantidad5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad5KeyTyped

    private void jTextField_Cantidad6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad6KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad6KeyTyped

    private void jTextField_Cantidad7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad7KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad7KeyTyped

    private void jTextField_Cantidad8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad8KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad8KeyTyped

    private void jTextField_Cantidad9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad9KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad9KeyTyped

    private void jTextField_Cantidad10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad10KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad10KeyTyped

    private void jTextField_Cantidad11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad11KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad11KeyTyped

    private void jTextField_Cantidad12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Cantidad12KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_jTextField_Cantidad12KeyTyped

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
            java.util.logging.Logger.getLogger(GraficoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficoBarras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficoBarras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_Barras;
    private javax.swing.JTextField jTextField_Cantidad1;
    private javax.swing.JTextField jTextField_Cantidad10;
    private javax.swing.JTextField jTextField_Cantidad11;
    private javax.swing.JTextField jTextField_Cantidad12;
    private javax.swing.JTextField jTextField_Cantidad2;
    private javax.swing.JTextField jTextField_Cantidad3;
    private javax.swing.JTextField jTextField_Cantidad4;
    private javax.swing.JTextField jTextField_Cantidad5;
    private javax.swing.JTextField jTextField_Cantidad6;
    private javax.swing.JTextField jTextField_Cantidad7;
    private javax.swing.JTextField jTextField_Cantidad8;
    private javax.swing.JTextField jTextField_Cantidad9;
    // End of variables declaration//GEN-END:variables
}
