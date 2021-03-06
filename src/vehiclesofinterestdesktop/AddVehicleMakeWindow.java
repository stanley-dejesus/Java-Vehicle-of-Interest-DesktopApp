/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vehiclesofinterestdesktop;

/**
 *
 * @author sdeje
 */
public class AddVehicleMakeWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddVOIWindow
     */
    public AddVehicleMakeWindow() {
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
        jlbMake = new javax.swing.JLabel();
        jtfMake = new javax.swing.JTextField();
        jbtCancel = new javax.swing.JButton();
        jbtAdd = new javax.swing.JButton();
        jtbError = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VOI - Vehicle Make - Add");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbTitle.setText("Add Vehicle Make");
        getContentPane().add(jlbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 33, 310, -1));

        jlbMake.setText("Make *");
        getContentPane().add(jlbMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 83, -1, -1));
        getContentPane().add(jtfMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 83, 150, -1));

        jbtCancel.setText("Cancel");
        jbtCancel.setToolTipText("");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 123, -1, -1));

        jbtAdd.setText("Add");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddActionPerformed(evt);
            }
        });
        getContentPane().add(jbtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 123, 60, -1));

        jtbError.setEditable(false);
        jtbError.setText("Fields with an asterisk (*) are required");
        jtbError.setToolTipText("");
        jtbError.setBorder(null);
        jtbError.setDisabledTextColor(new java.awt.Color(204, 0, 0));
        jtbError.setEnabled(false);
        jtbError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbErrorActionPerformed(evt);
            }
        });
        getContentPane().add(jtbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jbtCancelActionPerformed

    private void jbtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddActionPerformed
                try {

            String make = jtfMake.getText();

            if (make != null && !make.trim().isEmpty()) {
                System.out.println("make = " + make);
            } else {
                throw new Exception("Null Pointer Error");
            }
            
            vc.createVehicleMake(make);
            this.dispose();
        } catch (Exception e) {

            jtbError.setVisible(true);
            this.revalidate();
            System.out.println("------------");
        }
    }//GEN-LAST:event_jbtAddActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtbError.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jtbErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtbErrorActionPerformed

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
            java.util.logging.Logger.getLogger(AddVehicleMakeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVehicleMakeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVehicleMakeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVehicleMakeWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVehicleMakeWindow().setVisible(true);
            }
        });
    }
VehiclesOfInterestController vc = new VehiclesOfInterestController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JLabel jlbMake;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JTextField jtbError;
    private javax.swing.JTextField jtfMake;
    // End of variables declaration//GEN-END:variables
}
