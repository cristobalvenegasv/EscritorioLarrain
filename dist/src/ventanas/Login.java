/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.sql.*;
import clases.Conexion;
import javax.swing.JOptionPane;

/**
 *
 * @author cris
 */
public class Login extends javax.swing.JFrame {
    
    public static String user = "";
    String pw = "";

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        /* Inicializar tamaños y ubicación de la ventana */
        setSize(400,500); 
        setResizable(false);
        setTitle("Inicio de Sesión");
        setLocationRelativeTo(null);
     
        ImageIcon fondo = new ImageIcon("src/imagenes/blanco.jpg");
        /* Adaptar imagen a las dimensiones establecidas */
        Icon icono = new ImageIcon(fondo.getImage().getScaledInstance(jLabel_Fondo.getWidth(),jLabel_Fondo.getHeight(),
                Image.SCALE_DEFAULT));
        
        jLabel_Fondo.setIcon(icono);
        /* Cambios al momento de cargar la interfaz */
        this.repaint();
        
        ImageIcon logo = new ImageIcon("src/imagenes/logo_wykep.png");
        Icon icono_logo = new ImageIcon(logo.getImage().getScaledInstance(jLabel_Logo.getWidth(),jLabel_Logo.getHeight(),
                Image.SCALE_DEFAULT));
        
        jLabel_Logo.setIcon(icono_logo);
        this.repaint();
    
        
        ImageIcon logo_usuario = new ImageIcon("src/imagenes/user_icon.png");
        Icon icono_usuario = new ImageIcon(logo_usuario.getImage().getScaledInstance(jLabel_IconoUsuario.getWidth(), jLabel_IconoUsuario.getHeight(),
                Image.SCALE_DEFAULT));
        
        jLabel_IconoUsuario.setIcon(icono_usuario);
        this.repaint();
        
        ImageIcon logo_clave = new ImageIcon("src/imagenes/lock_password.png");
        Icon icono_clave = new ImageIcon(logo_clave.getImage().getScaledInstance(jLabel_IconoContraseña.getWidth(), jLabel_IconoContraseña.getHeight(),
                Image.SCALE_DEFAULT));
        
        jLabel_IconoContraseña.setIcon(icono_clave);
        this.repaint();
    }

    @Override
    /* Aquí le asignamos un logo a la aplicación al momento de ejecutarlo */
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

        jLabel_Logo = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        txt_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_Acceder = new javax.swing.JButton();
        jLabel_Footer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_IconoUsuario = new javax.swing.JLabel();
        jLabel_IconoContraseña = new javax.swing.JLabel();
        jLabel_Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 15, 220, 60));

        txt_password.setBackground(new java.awt.Color(220, 220, 220));
        txt_password.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_password.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 210, -1));

        txt_user.setBackground(new java.awt.Color(220, 220, 220));
        txt_user.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txt_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_user.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_userActionPerformed(evt);
            }
        });
        getContentPane().add(txt_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 210, -1));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BIENVENIDO A WYKEP");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        btn_Acceder.setBackground(new java.awt.Color(255, 255, 255));
        btn_Acceder.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_Acceder.setText("Ingresar");
        btn_Acceder.setBorder(null);
        btn_Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AccederActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 210, 35));

        jLabel_Footer.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel_Footer.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Footer.setText("Wykep - Tus importaciones al momento");
        getContentPane().add(jLabel_Footer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, -1, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Nombre de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 250, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));
        getContentPane().add(jLabel_IconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 223, 21, 21));

        jLabel_IconoContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lock_password.png"))); // NOI18N
        jLabel_IconoContraseña.setMaximumSize(new java.awt.Dimension(30, 30));
        jLabel_IconoContraseña.setMinimumSize(new java.awt.Dimension(30, 30));
        jLabel_IconoContraseña.setPreferredSize(new java.awt.Dimension(30, 30));
        getContentPane().add(jLabel_IconoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 273, 18, 18));

        jLabel_Fondo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Fondo.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_userActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_userActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AccederActionPerformed
        // TODO add your handling code here:
        
        /* Definimos las variables que obtendran el texto de los campos a llenar */
        user = txt_user.getText().trim();
        pw = txt_password.getText().trim();
        
        /* Validar que los campos no queden en blanco */
        if (!user.equals("") || !pw.equals("")) {
            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select ag.NAME, pu.* from PUNTOVENTAS_USER pu inner join PUNTOVENTAS_USER_GROUPS pug on(pu.id = pug.user_id) left join AUTH_GROUP ag on(pug.group_id = ag.id)"
                            + "where USERNAME ='" + user + "' and PASSWORD = '" + pw + "'");
                
                ResultSet rs = pst.executeQuery();
                /* rs.next() sirve para ver si la consulta encontro coincidencias con los datos */
                if (rs.next()) {
                    /*  SUPERVISOR LOCAL */
                        
                    String NAME = rs.getString("NAME");
                    
                    if (NAME.equalsIgnoreCase("Supervisor Local")) {
                        dispose();
                        new Supervisor().setVisible(true);
                    } else { JOptionPane.showMessageDialog(null, "*Datos incorrectos* Debe ser Supervisor de Local para ingresar");}
 //                   else if (NAME.equalsIgnoreCase("Administrador")) {
 //                       dispose();
 //                       new Supervisor().setVisible(true);
 //                   }
                } else {
                    JOptionPane.showMessageDialog(null, "*Datos incorrectos* Debe ser Supervisor de Local para ingresar");
                    txt_user.setText("");
                    txt_password.setText("");
                }
                
            } catch (SQLException e) {
                /* Mensajes para el programador en caso de que hayan errores */
                System.err.println("Error en el botón Acceder." + e);
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión. *Algo falló en el sistema* ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debes llenar los campos");
        }
        
    }//GEN-LAST:event_btn_AccederActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Acceder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Fondo;
    private javax.swing.JLabel jLabel_Footer;
    private javax.swing.JLabel jLabel_IconoContraseña;
    private javax.swing.JLabel jLabel_IconoUsuario;
    private javax.swing.JLabel jLabel_Logo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables
}