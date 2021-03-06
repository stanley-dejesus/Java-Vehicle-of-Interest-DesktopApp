/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vehiclesofinterestdesktop;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sdeje
 */
public class ViewReasonForInterestWindow extends javax.swing.JFrame {

    /**
     * Creates new form InquiryWindow
     */
    public ViewReasonForInterestWindow() {
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

        jbtAdd = new javax.swing.JButton();
        jbtEdit = new javax.swing.JButton();
        jbtDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtlROI = new javax.swing.JTable();
        jbtRefresh = new javax.swing.JButton();
        jbtReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VOI Inquiry - View Reasons for Interest");
        setIconImages(null);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtAdd.setText("Add");
        jbtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddVOIButtonClicked(evt);
            }
        });
        getContentPane().add(jbtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 33, 124, 63));

        jbtEdit.setText("Edit");
        jbtEdit.setEnabled(false);
        jbtEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVOIButtonClicked(evt);
            }
        });
        getContentPane().add(jbtEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 33, 124, 63));

        jbtDelete.setText("Delete");
        jbtDelete.setEnabled(false);
        jbtDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteVOIButtonClicked(evt);
            }
        });
        getContentPane().add(jbtDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 33, 124, 63));

        jtlROI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reason", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtlROI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtlROIMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtlROI);
        if (jtlROI.getColumnModel().getColumnCount() > 0) {
            jtlROI.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 776, 409));

        jbtRefresh.setText("Refresh");
        jbtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRefreshActionPerformed(evt);
            }
        });
        getContentPane().add(jbtRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 572, 124, 63));

        jbtReturn.setText("Return to Main");
        jbtReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtReturnActionPerformed(evt);
            }
        });
        getContentPane().add(jbtReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 572, 124, 63));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtReturnActionPerformed
        //this button can close the current window.
        this.dispose();
    }//GEN-LAST:event_jbtReturnActionPerformed

    private void AddVOIButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddVOIButtonClicked
        // Creates ADD window and provides required information        
        AddROIWindow aw = new AddROIWindow();
        aw.show();
    }//GEN-LAST:event_AddVOIButtonClicked

    private void editVOIButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVOIButtonClicked
        // Creates edit window and provides required information
        int selectedRow = jtlROI.getSelectedRow();
        ArrayList<String> row = new ArrayList<String>();
        for (int x = 0; x < 2; x++) {
            row.add((String) jtlROI.getValueAt(selectedRow, x));
        }
        EditROIWindow ew = new EditROIWindow(row.get(0), row.get(1));
        ew.show();

    }//GEN-LAST:event_editVOIButtonClicked

    private void deleteVOIButtonClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteVOIButtonClicked
        //Creates delete window
        int selectedRow = jtlROI.getSelectedRow();
        ArrayList<String> row = new ArrayList<String>();
        for (int x = 0; x < 2; x++) {
            row.add((String) jtlROI.getValueAt(selectedRow, x));
        }
        DeleteROIWindow dw = new DeleteROIWindow(row.get(0), row.get(1));
        dw.show();
    }//GEN-LAST:event_deleteVOIButtonClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Populates table
        DefaultTableModel model = (DefaultTableModel) jtlROI.getModel();
        model.setRowCount(0);
        String[][] ROIList = vc.getAllReasonsForInterest();
        vc.getAllReasonsForInterest();

        for (int x = 0; x < ROIList.length; x++) {
            model.addRow(ROIList[x]);
        }
        //set up accelerators.
        jbtRefresh.setMnemonic(KeyEvent.VK_R);
        jbtRefresh.setToolTipText("Alt+R - Retrieves updated database entries");
        jbtAdd.setMnemonic(KeyEvent.VK_A);
        jbtAdd.setToolTipText("Alt+A - Adds new Vehicle of Interest");
        jbtEdit.setMnemonic(KeyEvent.VK_E);
        jbtEdit.setToolTipText("Alt+E - Edit Selected Vehicle of Interest");
        jbtDelete.setMnemonic(KeyEvent.VK_D);
        jbtDelete.setToolTipText("Alt+D - Delete Selected Vehicle of Interest");
        jbtReturn.setMnemonic(KeyEvent.VK_C);
        jbtReturn.setToolTipText("Alt+C; Closes view screen and returns to main menu");
        jtlROI.setToolTipText("Select row to enable more options");
    }//GEN-LAST:event_formWindowOpened

    private void jbtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRefreshActionPerformed
        //Repopulates database  and set edit and delete buttons to disable      
        DefaultTableModel model = (DefaultTableModel) jtlROI.getModel();
        model.setRowCount(0);
        String[][] ROIList = vc.getAllReasonsForInterest();
        vc.getAllReasonsForInterest();

        for (int x = 0; x < ROIList.length; x++) {
            model.addRow(ROIList[x]);
        }
        jbtEdit.setEnabled(false);
        jbtDelete.setEnabled(false);
    }//GEN-LAST:event_jbtRefreshActionPerformed

    private void jtlROIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtlROIMouseClicked
        //When a row is clicked, it enables the edit and delete buttons.  Reclicking a selected row will de-select it.
        int selection = jtlROI.getSelectedRow();
        if (selection == table_state) {
            jtlROI.clearSelection();
            selection = jtlROI.getSelectedRow();

        }
        System.out.println(selection);
        if (selection >= 0) {
            jbtEdit.setEnabled(true);
            jbtDelete.setEnabled(true);
        } else {
            jbtEdit.setEnabled(false);
            jbtDelete.setEnabled(false);
        }
        table_state = selection;

    }//GEN-LAST:event_jtlROIMouseClicked

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
            java.util.logging.Logger.getLogger(ViewReasonForInterestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewReasonForInterestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewReasonForInterestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewReasonForInterestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewReasonForInterestWindow().setVisible(true);
            }
        });
    }
    VehiclesOfInterestController vc = new VehiclesOfInterestController();
    private int table_state;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtAdd;
    private javax.swing.JButton jbtDelete;
    private javax.swing.JButton jbtEdit;
    private javax.swing.JButton jbtRefresh;
    private javax.swing.JButton jbtReturn;
    private javax.swing.JTable jtlROI;
    // End of variables declaration//GEN-END:variables
}
