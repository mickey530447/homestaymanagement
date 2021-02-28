/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ui;

/**
 *
 * @author Emi Tiramis
 */
public class HomestayManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomestayManagementPanel
     */
    public HomestayManagementPanel() {
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        chkStove = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHomestay = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtHomestayID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtOwnerID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
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

        tblHomestay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblHomestay);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Homestay ID:");

        txtHomestayID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtHomestayID.setOpaque(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Owner ID:");

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/ui/images/icons8_delete_20px.png"))); // NOI18N
        btnDelete.setText("Delete");

        txtOwnerID.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtOwnerID.setOpaque(false);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");

        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setOpaque(false);

        txtPrice.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPrice.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price:");

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

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrice)
                                    .addComponent(txtAddress)
                                    .addComponent(txtOwnerID)
                                    .addComponent(txtHomestayID)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
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
                                                            .addComponent(chkSmoke))))))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 136, Short.MAX_VALUE))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHomestayID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtOwnerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tblHomestay;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtHomestayID;
    private javax.swing.JTextField txtOwnerID;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}