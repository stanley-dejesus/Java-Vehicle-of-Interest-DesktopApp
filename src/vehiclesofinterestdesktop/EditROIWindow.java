/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vehiclesofinterestdesktop;

/**
 *
 * @author sdeje
 */
public class EditROIWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddVOIWindow
     */
    public EditROIWindow() {
        initComponents();
    }

    public EditROIWindow(String reason, String description) {
        this.reason = reason;
        this.description = description;
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

        jlbTitle = new javax.swing.JLabel();
        jlbReason = new javax.swing.JLabel();
        jtfReason = new javax.swing.JTextField();
        jbtCancel = new javax.swing.JButton();
        jbtEdit = new javax.swing.JButton();
        jtbError = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        JlbDescription = new javax.swing.JLabel();
        jtfDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VOI - Reason for Interest - Edit");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbTitle.setText("Edit Reason for Interest");
        getContentPane().add(jlbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 20, 310, -1));

        jlbReason.setText("Reason *");
        getContentPane().add(jlbReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 95, 120, -1));

        jtfReason.setEnabled(false);
        jtfReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfReasonActionPerformed(evt);
            }
        });
        getContentPane().add(jtfReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 93, 150, -1));

        jbtCancel.setText("Cancel");
        jbtCancel.setToolTipText("");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, -1));

        jbtEdit.setText("Edit");
        jbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditActionPerformed(evt);
            }
        });
        getContentPane().add(jbtEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 60, -1));

        jtbError.setText("Fields with an asterisk (*) are required");
        jtbError.setBorder(null);
        jtbError.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jtbError.setEnabled(false);
        jtbError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbErrorActionPerformed(evt);
            }
        });
        getContentPane().add(jtbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 310, -1));
        getContentPane().add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, -1, 230));
        getContentPane().add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 10, 230));

        JlbDescription.setText("Description *");
        getContentPane().add(JlbDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        getContentPane().add(jtfDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtfReason.setText(reason);
        jtfDescription.setText(description);
        jtbError.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jbtEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditActionPerformed
        try {

            String reason = jtfReason.getText();
            String description = jtfDescription.getText();
            if (reason != null && !reason.trim().isEmpty()) {
                System.out.println("reason = " + reason);
            } else {
                throw new Exception("Null Pointer Error");
            }
            if (description != null && !description.trim().isEmpty()) {
                System.out.println("description = " + description);
            } else {
                throw new Exception("Null Pointer Error");
            }
            vc.updateReasonForInterest(reason, description);
            this.dispose();
        } catch (Exception e) {
            jtbError.setVisible(true);
            this.revalidate();
            System.out.println("------------");
        }
    }//GEN-LAST:event_jbtEditActionPerformed

    private void jtbErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbErrorActionPerformed

    private void jtfReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfReasonActionPerformed

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCancelActionPerformed

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
            java.util.logging.Logger.getLogger(EditROIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditROIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditROIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditROIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditROIWindow().setVisible(true);
            }
        });
    }
    private String reason;
    private String description;
    VehiclesOfInterestController vc = new VehiclesOfInterestController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlbDescription;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JButton jbtEdit;
    private javax.swing.JLabel jlbReason;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTextField jtbError;
    private javax.swing.JTextField jtfDescription;
    private javax.swing.JTextField jtfReason;
    // End of variables declaration//GEN-END:variables
}
