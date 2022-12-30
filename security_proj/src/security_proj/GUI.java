/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package security_proj;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import static security_proj.Caeser.*;
import static security_proj.Vigenere.*;
import static security_proj.PlayFair.*;
import static security_proj.RSA.*;
public class GUI extends javax.swing.JFrame {
TDES td;
histroy h;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        getContentPane().setBackground(  Color.decode("#2B2D42")  );
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jProgressBar1 = new javax.swing.JProgressBar();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setForeground(new java.awt.Color(92, 99, 120));
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 99, 120));
        jLabel1.setText("Plain Text:");

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 99, 120));
        jLabel3.setText("Output:");

        jTextField4.setForeground(new java.awt.Color(92, 99, 120));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jComboBox1.setForeground(new java.awt.Color(92, 99, 120));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caesar Cipher", "PlayFair", "RailFence", "RSA", "Vigniner", "3DES" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(92, 99, 120));
        jLabel4.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(92, 99, 120));
        jLabel5.setText("Key:");

        jTextField5.setForeground(new java.awt.Color(92, 99, 120));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(237, 242, 244));
        jButton7.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(43, 45, 66));
        jButton7.setText("Encrypt");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(237, 242, 244));
        jButton8.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(43, 45, 66));
        jButton8.setText("Reset");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(237, 242, 244));
        jButton9.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(43, 45, 66));
        jButton9.setText("Decrypt");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(92, 99, 120));
        jLabel2.setText("Data Encryption/Decryption");

        jButton1.setBackground(new java.awt.Color(120, 2, 22));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(237, 242, 244));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("DokChampa", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));

        jButton2.setBackground(new java.awt.Color(92, 99, 120));
        jButton2.setFont(new java.awt.Font("FangSong", 1, 14)); // NOI18N
        jButton2.setText("History");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField1)
                            .addComponent(jTextField4)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton8)
                .addGap(87, 87, 87)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton9)
                            .addComponent(jButton7))
                        .addGap(24, 24, 24)))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        //Encryption Button
        int t =jComboBox1.getSelectedIndex();
        
         if (!jTextField1.getText().isEmpty() && !jTextField4.getText().isEmpty())
        {
       if(jComboBox1.getItemAt(t).equals("Caesar Cipher"))
       {
            String s =jTextField1.getText();
                int k = Integer.parseInt(jTextField4.getText());
                jTextField5.setText(Caeser_enc(s,k));
                histroy.jTextArea1.append(jTextField1.getText()+" is encrypted to "+jTextField5.getText()+" using Caesar Cipher"+"\n");
       }
       if(jComboBox1.getItemAt(t).equals("PlayFair"))
       {
            String ke=jTextField4.getText();
                String txt = jTextField1.getText();
                createTable(ke, true);
                jTextField5.setText(encode(prepareText(txt,true)));
                  histroy.jTextArea1.append(jTextField1.getText()+" is encrypted to "+jTextField5.getText()+" using PlayFair "+"\n");
       }
        if(jComboBox1.getItemAt(t).equals("Vigniner"))
       {
            String str=jTextField1.getText();
                String keyword=jTextField4.getText();
              
                  
                
                jTextField5.setText(vigencrypt(str, keyword));
                  histroy.jTextArea1.append(jTextField1.getText()+" is encrypted to "+jTextField5.getText()+" using Vigniner "+"\n");
       }
        if(jComboBox1.getItemAt(t).equals("RailFence"))
       {
            String s =jTextField1.getText();
                int k = Integer.parseInt(jTextField4.getText());
                jTextField5.setText(RailFence.encrypt(s, k));
                     histroy.jTextArea1.append(jTextField1.getText()+" is encrypted to "+jTextField5.getText()+" using RailFence "+"\n");
       }
         if(jComboBox1.getItemAt(t).equals("3DES"))
       {
           String keyword=jTextField4.getText();
           if(jTextField4.getText().length()<=23)
           {
               //Triple Data Encryption Standard
              showMessageDialog(null, "Wrong Key Size ");
           }
           else{
            {
            try {
                td= new TDES();
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         String target=jTextField1.getText();
        String encrypted=td.TDESencrypt(target,keyword);
        jTextField5.setText(encrypted);
        histroy.jTextArea1.append(jTextField1.getText()+" is encrypted to "+jTextField5.getText()+" using 3DES "+"\n");
        
       }}
        
        jLabel6.setText("");
        }
         else if( !jTextField4.getText().isEmpty()){
        if(jComboBox1.getItemAt(t).equals("RSA"))
        {
              
            int key = Integer.parseInt(jTextField4.getText());
            jTextField5.setText(RSA_ENCODE(key));
              histroy.jTextArea1.append(jTextField4.getText()+" is encrypted to "+jTextField5.getText()+" using RSA "+"\n");
        }}
       
     else 
        {
            jLabel6.setText("enter plain text and key");
           jLabel6.setForeground(Color.decode("#780216"));
        }
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        // RESET BUTTON
        jTextField1.setText("");   ///plaintext textfield
        jTextField4.setText("");   /// key field
        jTextField5.setText("");   /// cipher field
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //Decryption Button
        int t =jComboBox1.getSelectedIndex();
        
         if(!jTextField1.getText().isEmpty() && !jTextField4.getText().isEmpty())
        {
          if(jComboBox1.getItemAt(t).equals("Caesar Cipher"))
       {
            String s =jTextField1.getText();
                int k = Integer.parseInt(jTextField4.getText());
                jTextField5.setText(Caeser.Caeser_dec(s,k));
                 histroy.jTextArea1.append(jTextField1.getText()+" is decrypted to "+jTextField5.getText()+" using Caesar Cipher"+"\n");
       }
        if(jComboBox1.getItemAt(t).equals("RailFence"))
       {
            String s =jTextField1.getText();
                int k = Integer.parseInt(jTextField4.getText());
                jTextField5.setText(RailFence.decrypt(s, k));
                  histroy.jTextArea1.append(jTextField1.getText()+" is decrypted to "+jTextField5.getText()+" using RailFence "+"\n");
       }
       if(jComboBox1.getItemAt(t).equals("PlayFair"))
       {
            String st=jTextField1.getText();
                String ke = jTextField4.getText();
                PlayFair.createTable(ke, true);
                jTextField5.setText(PlayFair.decode(st));
                 histroy.jTextArea1.append(jTextField1.getText()+" is decrypted to "+jTextField5.getText()+" using PlayFair "+"\n");
       }
        if(jComboBox1.getItemAt(t).equals("Vigniner"))
       {
             String str=jTextField1.getText();
                String keyword=jTextField4.getText();
                
                 jLabel6.setText(keyword);
                jTextField5.setText(Vigenere.vigdecrypt(str, keyword));
                    histroy.jTextArea1.append(jTextField1.getText()+" is decrypted to "+jTextField5.getText()+" using Vigniner "+"\n");
       }
         if(jComboBox1.getItemAt(t).equals("3DES"))
       {
        String keyword=jTextField4.getText();
         if(jTextField4.getText().length()<=23)
           {
              showMessageDialog(null, "Wrong Key Size ");
           }
         else{
            {
            try {
                td= new TDES();
            } catch (Exception ex) {
                Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
         String target=jTextField1.getText();
         String decrypted=td.TDESdecrypt(target,keyword);
        jTextField5.setText(decrypted);
         histroy.jTextArea1.append(jTextField1.getText()+" is decrypted to "+jTextField5.getText()+" using 3DES "+"\n");
       }}
        jLabel6.setText("");
        }
         else if( !jTextField4.getText().isEmpty()){
        if(jComboBox1.getItemAt(t).equals("RSA"))
        {
              
            int key = Integer.parseInt(jTextField4.getText());
            jTextField5.setText(RSA_DECODE(key));
             histroy.jTextArea1.append(jTextField4.getText()+" is decrypted to "+jTextField5.getText()+" using RSA "+"\n");
        }}
         
        else
             
        {
            jLabel6.setText("enter plain text and key");
           jLabel6.setForeground(Color.decode("#780216"));
        }
          
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    
         int t =jComboBox1.getSelectedIndex();
         if(jComboBox1.getItemAt(t).equals("RSA"))
        {
            jLabel6.setText("enter M for encrypt or C for decrypt in KEY");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        h=new histroy();
        h.setSize(400, 400);
        h.setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}