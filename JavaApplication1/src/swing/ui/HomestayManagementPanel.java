/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ui;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import swing.dao.HomestayDao;
import swing.helpers.DataValidator;
import swing.helpers.MessageDialogHelper;
import swing.helpers.SharedData;
import swing.model.Homestay;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class HomestayManagementPanel extends javax.swing.JPanel {
    public User u = SharedData.u;
    /**
     * Creates new form HomestayManagementPanel
     */
    public HomestayManagementPanel() {
        initComponents();
        try {
            HomestayDao dao = new HomestayDao();
            dao.showHomestay();
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(null, e.getMessage(), "Error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        chkStove = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        chkKitchen = new javax.swing.JCheckBox();
        chkWifi = new javax.swing.JCheckBox();
        chkParking = new javax.swing.JCheckBox();
        chkElevator = new javax.swing.JCheckBox();
        chkAC = new javax.swing.JCheckBox();
        chkSmoke = new javax.swing.JCheckBox();
        chkFirstAid = new javax.swing.JCheckBox();
        chkMicrowave = new javax.swing.JCheckBox();
        btnPicture = new keeptoo.KButton();
        jLabel7 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        kGradientPanel1.setkEndColor(new java.awt.Color(63, 120, 208));
        kGradientPanel1.setkStartColor(new java.awt.Color(39, 56, 83));

        chkStove.setForeground(new java.awt.Color(255, 255, 255));
        chkStove.setText("Stove");
        chkStove.setOpaque(false);

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/ui/images/icons8_save_20px.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/ui/images/icons8_edit_20px_1.png"))); // NOI18N
        btnEdit.setText("Edit");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Manage your place");

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/ui/images/icons8_erase_20px.png"))); // NOI18N
        btnClear.setText("Clear");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/ui/images/icons8_delete_20px.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtName.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");

        txtPrice.setForeground(new java.awt.Color(255, 255, 255));
        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPrice.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Picture");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amenities:");

        chkKitchen.setForeground(new java.awt.Color(255, 255, 255));
        chkKitchen.setText("Kitchen");
        chkKitchen.setOpaque(false);

        chkWifi.setForeground(new java.awt.Color(255, 255, 255));
        chkWifi.setText("Wifi");
        chkWifi.setOpaque(false);

        chkParking.setForeground(new java.awt.Color(255, 255, 255));
        chkParking.setText("Free parking");
        chkParking.setOpaque(false);
        chkParking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkParkingActionPerformed(evt);
            }
        });

        chkElevator.setForeground(new java.awt.Color(255, 255, 255));
        chkElevator.setText("Elevator");
        chkElevator.setOpaque(false);

        chkAC.setForeground(new java.awt.Color(255, 255, 255));
        chkAC.setText("Air conditioner");
        chkAC.setOpaque(false);
        chkAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkACActionPerformed(evt);
            }
        });

        chkSmoke.setForeground(new java.awt.Color(255, 255, 255));
        chkSmoke.setText("Smoke alarm");
        chkSmoke.setOpaque(false);

        chkFirstAid.setForeground(new java.awt.Color(255, 255, 255));
        chkFirstAid.setText("First aid kit");
        chkFirstAid.setOpaque(false);

        chkMicrowave.setForeground(new java.awt.Color(255, 255, 255));
        chkMicrowave.setText("Microwave");
        chkMicrowave.setOpaque(false);
        chkMicrowave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMicrowaveActionPerformed(evt);
            }
        });

        btnPicture.setText("Choose picture");
        btnPicture.setkEndColor(new java.awt.Color(63, 120, 208));
        btnPicture.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnPicture.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnPicture.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnPicture.setkStartColor(new java.awt.Color(111, 122, 140));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");

        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setOpaque(false);

        jLabel2.setText("Number of result");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(225, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(190, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSave))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkFirstAid)
                                    .addComponent(chkElevator)
                                    .addComponent(chkKitchen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addComponent(chkWifi)
                                        .addGap(68, 68, 68)
                                        .addComponent(chkParking))
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkAC)
                                            .addComponent(chkMicrowave))
                                        .addGap(18, 18, 18)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(chkStove)
                                            .addComponent(chkSmoke)))))
                            .addComponent(btnPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 145, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(37, 37, 37)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice)
                                    .addComponent(txtName)))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(25, 25, 25)
                                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 129, Short.MAX_VALUE))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1))
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(btnPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(chkKitchen)
                    .addComponent(chkWifi)
                    .addComponent(chkParking))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkElevator)
                        .addComponent(chkAC))
                    .addComponent(chkSmoke))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkFirstAid)
                    .addComponent(chkStove)
                    .addComponent(chkMicrowave))
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnEdit)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void chkACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkACActionPerformed

    private void chkMicrowaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMicrowaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkMicrowaveActionPerformed

    private void chkParkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkParkingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkParkingActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Missing name");
        DataValidator.validateEmpty(txtPrice, sb, "Missing price");
        DataValidator.validateEmpty(txtAddress, sb, "Missing address");
        if (sb.length() > 0){
            MessageDialogHelper.showErrorDialog(null, sb.toString(), "Error");
            return;
        }
        if (MessageDialogHelper.showConfirmDialog(null, "Confirm?", "Are you sure?") == JOptionPane.NO_OPTION){
            return;
        }
        StringBuilder ame = new StringBuilder();
        if (chkKitchen.isSelected()) {
            ame.append(chkKitchen.getText() + ", ");
        }
        if (chkWifi.isSelected()) {
            ame.append(chkWifi.getText() + ", ");
        }
        if (chkParking.isSelected()) {
            ame.append(chkParking.getText() + ", ");
        }
        if (chkElevator.isSelected()) {
            ame.append(chkElevator.getText() + ", ");
        }
        if (chkAC.isSelected()) {
            ame.append(chkAC.getText() + ", ");
        }
        if (chkSmoke.isSelected()) {
            ame.append(chkSmoke.getText() + ", ");
        }
        if (chkFirstAid.isSelected()) {
            ame.append(chkFirstAid.getText() + ", ");
        }
        if (chkMicrowave.isSelected()) {
            ame.append(chkMicrowave.getText() + ", ");
        }
        if (chkStove.isSelected()) {
            ame.append(chkStove.getText() + ", ");
        }
        
//        JOptionPane.showMessageDialog(null, ame.toString().substring(0, ame.toString().length() - 2));
        
        try {
            Homestay home = new Homestay();
            home.setTelephone(u.getTelephone());
            home.setName(txtName.getText());
            home.setAddress(txtAddress.getText());
            home.setPrice(Double.parseDouble(txtPrice.getText()));
            home.setAmenities(ame.toString().substring(0, ame.toString().length() - 2));
            HomestayDao dao = new HomestayDao();
            if (dao.insertHomestay(home)){
                MessageDialogHelper.showMessageDialog(null, "Saved", "Information");
            } else {
                MessageDialogHelper.showConfirmDialog(null, "Cannot saved", "Warning");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(null, e.getMessage(), "Error");
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtName, sb, "Missing name");
        DataValidator.validateEmpty(txtPrice, sb, "Missing price");
        DataValidator.validateEmpty(txtAddress, sb, "Missing address");
        if (sb.length() > 0){
            MessageDialogHelper.showErrorDialog(null, sb.toString(), "Error");
            return;
        }
        if (MessageDialogHelper.showConfirmDialog(null, "Confirm?", "Are you sure?") == JOptionPane.NO_OPTION){
            return;
        }
        StringBuilder ame = new StringBuilder();
        if (chkKitchen.isSelected()) {
            ame.append(chkKitchen.getText() + ", ");
        }
        if (chkWifi.isSelected()) {
            ame.append(chkWifi.getText() + ", ");
        }
        if (chkParking.isSelected()) {
            ame.append(chkParking.getText() + ", ");
        }
        if (chkElevator.isSelected()) {
            ame.append(chkElevator.getText() + ", ");
        }
        if (chkAC.isSelected()) {
            ame.append(chkAC.getText() + ", ");
        }
        if (chkSmoke.isSelected()) {
            ame.append(chkSmoke.getText() + ", ");
        }
        if (chkFirstAid.isSelected()) {
            ame.append(chkFirstAid.getText() + ", ");
        }
        if (chkMicrowave.isSelected()) {
            ame.append(chkMicrowave.getText() + ", ");
        }
        if (chkStove.isSelected()) {
            ame.append(chkStove.getText() + ", ");
        }
        
//        JOptionPane.showMessageDialog(null, ame.toString().substring(0, ame.toString().length() - 2));
        
        try {
            Homestay home = new Homestay();
            home.setTelephone(u.getTelephone());
            home.setName(txtName.getText());
            home.setAddress(txtAddress.getText());
            home.setPrice(Double.parseDouble(txtPrice.getText()));
            home.setAmenities(ame.toString().substring(0, ame.toString().length() - 2));
            HomestayDao dao = new HomestayDao();
            if (dao.insertHomestay(home)){
                MessageDialogHelper.showMessageDialog(null, "Saved", "Information");
            } else {
                MessageDialogHelper.showConfirmDialog(null, "Cannot saved", "Warning");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(null, e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private keeptoo.KButton btnPicture;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkAC;
    private javax.swing.JCheckBox chkElevator;
    private javax.swing.JCheckBox chkFirstAid;
    private javax.swing.JCheckBox chkKitchen;
    private javax.swing.JCheckBox chkMicrowave;
    private javax.swing.JCheckBox chkParking;
    private javax.swing.JCheckBox chkSmoke;
    private javax.swing.JCheckBox chkStove;
    private javax.swing.JCheckBox chkWifi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
