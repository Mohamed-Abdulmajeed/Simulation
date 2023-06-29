/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Single_Server;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author ATD
 */
public class FRM_Input_Random extends javax.swing.JFrame {

    /**
     * Creates new form Form4
     */
    public FRM_Input_Random() {
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

        btn_ok = new javax.swing.JButton();
        txt4 = new javax.swing.JTextField();
        txt1 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        arrtime = new javax.swing.JLabel();
        arrtime1 = new javax.swing.JLabel();
        arrtime2 = new javax.swing.JLabel();
        arrtime3 = new javax.swing.JLabel();

        setResizable(false);

        btn_ok.setBackground(java.awt.Color.darkGray);
        btn_ok.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_ok.setForeground(new java.awt.Color(255, 255, 255));
        btn_ok.setText("OK");
        btn_ok.setToolTipText("Click here to calculate the output\n  إضغط هنا لكى يتم حساب الناتج");
        btn_ok.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                btn_okStateChanged(evt);
            }
        });
        btn_ok.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_okMouseMoved(evt);
            }
        });
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });

        txt4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt4.setToolTipText("Enter the type of operation أدخل نوع العملية");
        txt4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt4KeyTyped(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt1.setToolTipText("Enter the type of operation أدخل نوع العملية");
        txt1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt1KeyTyped(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt3.setToolTipText("Enter the type of operation أدخل نوع العملية");
        txt3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt3KeyTyped(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt2.setToolTipText("Enter the type of operation أدخل نوع العملية");
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });
        txt2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt2KeyTyped(evt);
            }
        });

        arrtime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arrtime.setText("Min Customer Arrival Time  ");

        arrtime1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arrtime1.setText("Max Customer Arrival Time ");

        arrtime2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arrtime2.setText("Max Server Time ");

        arrtime3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        arrtime3.setText(" Min Server Time ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arrtime)
                    .addComponent(arrtime2)
                    .addComponent(arrtime3)
                    .addComponent(arrtime1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt4)
                    .addComponent(txt3)
                    .addComponent(txt2)
                    .addComponent(txt1)
                    .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrtime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrtime1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrtime3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(arrtime2))
                .addGap(38, 38, 38)
                .addComponent(btn_ok)
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        try{
            Arrays.num1= Integer.parseInt(txt1.getText());
            Arrays.num2= Integer.parseInt(txt2.getText());
            Arrays.num3= Integer.parseInt(txt3.getText());
            Arrays.num4= Integer.parseInt(txt4.getText());
            dispose();        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    }//GEN-LAST:event_btn_okActionPerformed

    private void txt4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4KeyTyped

    private void txt1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1KeyTyped

    private void txt3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3KeyTyped

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2KeyTyped

    private void btn_okStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_btn_okStateChanged
        // TODO add your handling code here:
        btn_ok.setBackground(Color.BLUE);
    }//GEN-LAST:event_btn_okStateChanged

    private void btn_okMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_okMouseMoved
        // TODO add your handling code here:
                btn_ok.setBackground(Color.red);
    }//GEN-LAST:event_btn_okMouseMoved

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
            java.util.logging.Logger.getLogger(FRM_Input_Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Input_Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Input_Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Input_Random.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Input_Random().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrtime;
    private javax.swing.JLabel arrtime1;
    private javax.swing.JLabel arrtime2;
    private javax.swing.JLabel arrtime3;
    private javax.swing.JButton btn_ok;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
}
