/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;
import clases.Complejos;
import javax.swing.JOptionPane;
/**
 *
 * @author Jesus
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtReal = new javax.swing.JTextField();
        txtIma = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtReal1 = new javax.swing.JTextField();
        txtIma1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtReal2 = new javax.swing.JTextField();
        txtIma2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbOperaciones = new javax.swing.JComboBox<>();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLabel1.setText("Operaciones con numeros Complejos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        txtReal.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtReal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRealKeyTyped(evt);
            }
        });
        getContentPane().add(txtReal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 60, 30));

        txtIma.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtIma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtImaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIma, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 60, 30));

        jLabel2.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel2.setText("i");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        txtReal1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtReal1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReal1KeyTyped(evt);
            }
        });
        getContentPane().add(txtReal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 60, 30));

        txtIma1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtIma1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIma1KeyTyped(evt);
            }
        });
        getContentPane().add(txtIma1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 60, 30));

        jLabel3.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel3.setText("i");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, -1, -1));

        txtReal2.setEditable(false);
        txtReal2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtReal2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReal2KeyTyped(evt);
            }
        });
        getContentPane().add(txtReal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 60, 30));

        txtIma2.setEditable(false);
        txtIma2.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        txtIma2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIma2KeyTyped(evt);
            }
        });
        getContentPane().add(txtIma2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 60, 30));

        jLabel4.setFont(new java.awt.Font("Segoe Script", 0, 24)); // NOI18N
        jLabel4.setText("i");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, -1, -1));

        cmbOperaciones.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cmbOperaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "x", "/" }));
        getContentPane().add(cmbOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 94, 50, 30));

        cmdCalcular.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cmdCalcular.setForeground(new java.awt.Color(0, 102, 51));
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        cmdBorrar.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        cmdBorrar.setForeground(new java.awt.Color(102, 0, 0));
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        setSize(new java.awt.Dimension(801, 269));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        int r1, r2, i1,i2,op;
        Complejos c1,c2,c3=null;
        if (txtReal.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la parte real n°1","Error",JOptionPane.ERROR_MESSAGE);
         txtReal.requestFocusInWindow();
     }else if(txtIma.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la parte imaginaria n°1" ,"Error",JOptionPane.ERROR_MESSAGE);
         txtIma.requestFocusInWindow();
     }else if(txtReal1.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this, "Digite la parte real n°2","Error",JOptionPane.ERROR_MESSAGE);
         txtReal1.requestFocusInWindow();
     }else if(txtIma1.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite la parte imaginaria n°2","Error",JOptionPane.ERROR_MESSAGE);
         txtIma1.requestFocusInWindow();
     }else{
         try{
         op = cmbOperaciones.getSelectedIndex();
         r1=Integer.parseInt(txtReal.getText());
         r2=Integer.parseInt(txtReal1.getText());
         i1=Integer.parseInt(txtIma.getText());
         i2=Integer.parseInt(txtIma1.getText());
        
         c1= new Complejos (r1,i1);
         c2= new Complejos (r2,i2);
         
         switch (op) {
            case 0:
                c3=c1.sumar(c2);
                break;
            case 1:
                c3 = c1.restar(c2);
                break;
            case 2:
                c3=c1.Multiplicar(c2);
                break;
            case 3:
                c3 = c1.dividir(c2);
                break;
                
        }
         txtReal2.setText(""+c3.getReal());
         txtIma2.setText(""+c3.getImaginario());
     }catch (Exception e){
               JOptionPane.showMessageDialog(this,"Ingrese numero validos","Erro", JOptionPane.ERROR_MESSAGE);
            txtReal.requestFocusInWindow();
     }
     }
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        txtIma.setText("");
        txtIma1.setText("");
        txtIma2.setText("");
        txtReal.setText("");
        txtReal1.setText("");
        txtReal2.setText("");
        txtReal.requestFocusInWindow();
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void txtRealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRealKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtRealKeyTyped

    private void txtImaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtImaKeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtImaKeyTyped

    private void txtReal1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReal1KeyTyped
       char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtReal1KeyTyped

    private void txtIma1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIma1KeyTyped
       char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtIma1KeyTyped

    private void txtReal2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReal2KeyTyped
        char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtReal2KeyTyped

    private void txtIma2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIma2KeyTyped
       char c=evt.getKeyChar();
             
         
          if(!Character.isDigit(evt.getKeyChar()) &&evt.getKeyChar()!='-'){ 
              getToolkit().beep(); 
               
              evt.consume(); 
          }
    }//GEN-LAST:event_txtIma2KeyTyped

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
    private javax.swing.JComboBox<String> cmbOperaciones;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIma;
    private javax.swing.JTextField txtIma1;
    private javax.swing.JTextField txtIma2;
    private javax.swing.JTextField txtReal;
    private javax.swing.JTextField txtReal1;
    private javax.swing.JTextField txtReal2;
    // End of variables declaration//GEN-END:variables
}
