/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vehiclesofinterestdesktop;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author sdeje
 */
public class AddVOIWindow extends javax.swing.JFrame {

    /**
     * Creates new form AddVOIWindow
     */
    public AddVOIWindow() {
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
        jlbLicense = new javax.swing.JLabel();
        jlbReasons = new javax.swing.JLabel();
        jlbVehicleMake = new javax.swing.JLabel();
        jlbVehicleModel = new javax.swing.JLabel();
        jlbVehicleYear = new javax.swing.JLabel();
        jlbVehicleColor = new javax.swing.JLabel();
        jlbOwnerName = new javax.swing.JLabel();
        jlbOwnerPhone = new javax.swing.JLabel();
        jtfLicense = new javax.swing.JTextField();
        jtfOwnerName = new javax.swing.JTextField();
        jtfOwnerPhone = new javax.swing.JTextField();
        jbtCancel = new javax.swing.JButton();
        jbtOk = new javax.swing.JButton();
        jcbVehicleColor = new javax.swing.JComboBox<>();
        jcbReason = new javax.swing.JComboBox<>();
        jcbVehicleMake = new javax.swing.JComboBox<>();
        jcbVehicleModel = new javax.swing.JComboBox<>();
        jcbVehicleYear = new javax.swing.JComboBox<>();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 32767));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        jtbError = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VOI Inquiry - Add");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbTitle.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jlbTitle.setText("Add New VOI");
        getContentPane().add(jlbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 24, 310, -1));

        jlbLicense.setText("License Plate *");
        getContentPane().add(jlbLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 73, -1, -1));

        jlbReasons.setText("Reason for Interest *");
        getContentPane().add(jlbReasons, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 111, -1, -1));

        jlbVehicleMake.setText("Vehicle Make *");
        getContentPane().add(jlbVehicleMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 146, -1, -1));

        jlbVehicleModel.setText("Vehicle Model *");
        getContentPane().add(jlbVehicleModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 185, -1, -1));

        jlbVehicleYear.setText("Vehicle Year *");
        getContentPane().add(jlbVehicleYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 222, -1, -1));

        jlbVehicleColor.setText("Vehicle Color *");
        getContentPane().add(jlbVehicleColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 261, -1, -1));

        jlbOwnerName.setText("Owner's Name *");
        getContentPane().add(jlbOwnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 302, -1, -1));

        jlbOwnerPhone.setText("Owner's Phone Number *");
        getContentPane().add(jlbOwnerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 340, -1, -1));
        getContentPane().add(jtfLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, -1));
        getContentPane().add(jtfOwnerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 302, 160, -1));
        getContentPane().add(jtfOwnerPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 160, -1));

        jbtCancel.setText("Cancel");
        jbtCancel.setToolTipText("");
        jbtCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jbtCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 378, -1, -1));

        jbtOk.setText("Ok");
        jbtOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtOkActionPerformed(evt);
            }
        });
        getContentPane().add(jbtOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 378, 60, -1));

        jcbVehicleColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbVehicleColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVehicleColorActionPerformed(evt);
            }
        });
        getContentPane().add(jcbVehicleColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 264, 160, -1));

        jcbReason.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbReason.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbReasonActionPerformed(evt);
            }
        });
        getContentPane().add(jcbReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 108, 160, -1));

        jcbVehicleMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbVehicleMake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbVehicleMakeActionPerformed(evt);
            }
        });
        getContentPane().add(jcbVehicleMake, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 146, 160, -1));

        jcbVehicleModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jcbVehicleModel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 184, 160, -1));

        jcbVehicleYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jcbVehicleYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 223, 160, -1));
        getContentPane().add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(365, 0, -1, 446));
        getContentPane().add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 10, 446));

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
        getContentPane().add(jtbError, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtCancelActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        String[] reasons = vc.allReasonsForInterestKey();
        jcbReason.removeAllItems();
        jcbReason.addItem("");
        for (int x = 0; x < reasons.length; x++) {
            jcbReason.addItem(reasons[x]);
        }
        String[] vehicleMakes = vc.allVehicleMakeKey();
        jcbVehicleMake.removeAllItems();
        jcbVehicleMake.addItem("");
        for (int x = 0; x < vehicleMakes.length; x++) {
            jcbVehicleMake.addItem(vehicleMakes[x]);
        }
        jcbVehicleModel.removeAllItems();
        java.util.Date d = new java.util.Date();
        jcbVehicleYear.removeAllItems();
        for (int x = (int) d.getYear() + 1900 + 1; x >= 1980; x--) {
            jcbVehicleYear.addItem(String.valueOf(x));
        }
        jcbVehicleColor.removeAllItems();
        jcbVehicleColor.addItem("");
        String currentDirectory = new File("").getAbsolutePath();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(currentDirectory + "\\src\\vehiclesofinterestdesktop\\colors.txt"));
            
            String str;
            while ((str = br.readLine()) != null) {
                jcbVehicleColor.addItem(str);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        jtbError.setVisible(false);

    }//GEN-LAST:event_formWindowOpened

    private void jcbVehicleColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVehicleColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbVehicleColorActionPerformed

    private void jcbVehicleMakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbVehicleMakeActionPerformed
        String[][] cars = vc.allVehicleModel();
        jcbVehicleModel.removeAllItems();
        for (int x = 0; x < cars.length; x++) {
            try {
                if (cars[x][1].equals(jcbVehicleMake.getSelectedItem())) {
                    jcbVehicleModel.addItem(cars[x][0]);
                }
            } catch (Exception e) {
                jcbVehicleModel.removeAllItems();
                
            }
        }

    }//GEN-LAST:event_jcbVehicleMakeActionPerformed

    private void jbtOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtOkActionPerformed
        try {
            
            String license = jtfLicense.getText();
            String ROI = (String) jcbReason.getSelectedItem();
            String vMake = (String) jcbVehicleMake.getSelectedItem();
            String vModel = (String) jcbVehicleModel.getSelectedItem();
            String vYear = (String) jcbVehicleYear.getSelectedItem();
            String vColor = (String) jcbVehicleColor.getSelectedItem();
            String ownerName = (String) jtfOwnerName.getText();
            String ownerPhone = (String) jtfOwnerPhone.getText();
            if (license != null && !license.trim().isEmpty()) {
                System.out.println("license = " + license);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (ROI != null && !ROI.trim().isEmpty()) {
                System.out.println("Reason for Interest = " + ROI);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (vMake != null && !vMake.trim().isEmpty()) {
                System.out.println("Vehicle Make = " + vMake);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (vModel != null && !vModel.trim().isEmpty()) {
                System.out.println("Vehicle Model = " + vModel);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (vYear != null && !vYear.trim().isEmpty()) {
                System.out.println("Vehicle Year = " + vYear);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (vColor != null && !vColor.trim().isEmpty()) {
                System.out.println("Vehicle Color = " + vColor);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (ownerName != null && !ownerName.trim().isEmpty()) {
                System.out.println("Owner's Name = " + ownerName);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (ownerPhone != null && !ownerPhone.trim().isEmpty()) {
                System.out.println("Owner's Phone Number = " + ownerPhone);
            } else {
                throw new Exception("Fields with an asterisk(*) are required");
            }
            if (ownerPhone.length() != 10) {
                throw new Exception("Owner phone number must have 10 digits only");
            }
            vc.createVehicleOfInterest(license, ROI, vMake, vModel, vYear, vColor, ownerName, ownerPhone);
            this.dispose();
        } catch (Exception e) {
            jtbError.setText(e.getMessage());
            jtbError.setVisible(true);
            this.revalidate();
            System.out.println("------------");
        }
        

    }//GEN-LAST:event_jbtOkActionPerformed

    private void jcbReasonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbReasonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbReasonActionPerformed

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
            java.util.logging.Logger.getLogger(AddVOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddVOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddVOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddVOIWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddVOIWindow().setVisible(true);
            }
        });
    }
    private VehiclesOfInterestController vc = new VehiclesOfInterestController();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JButton jbtCancel;
    private javax.swing.JButton jbtOk;
    private javax.swing.JComboBox<String> jcbReason;
    private javax.swing.JComboBox<String> jcbVehicleColor;
    private javax.swing.JComboBox<String> jcbVehicleMake;
    private javax.swing.JComboBox<String> jcbVehicleModel;
    private javax.swing.JComboBox<String> jcbVehicleYear;
    private javax.swing.JLabel jlbLicense;
    private javax.swing.JLabel jlbOwnerName;
    private javax.swing.JLabel jlbOwnerPhone;
    private javax.swing.JLabel jlbReasons;
    private javax.swing.JLabel jlbTitle;
    private javax.swing.JLabel jlbVehicleColor;
    private javax.swing.JLabel jlbVehicleMake;
    private javax.swing.JLabel jlbVehicleModel;
    private javax.swing.JLabel jlbVehicleYear;
    private javax.swing.JTextField jtbError;
    private javax.swing.JTextField jtfLicense;
    private javax.swing.JTextField jtfOwnerName;
    private javax.swing.JTextField jtfOwnerPhone;
    // End of variables declaration//GEN-END:variables
}
