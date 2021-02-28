/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.ui;

import javax.swing.JOptionPane;
import swing.dao.UserDao;
import swing.helpers.DataValidator;
import swing.helpers.MessageDialogHelper;
import swing.model.User;

/**
 *
 * @author Emi Tiramis
 */
public class SignupDialog extends javax.swing.JDialog {

    /**
     * Creates new form SignupDialog
     */
    public SignupDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rdbFemale = new javax.swing.JRadioButton();
        rdbMale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnPicture = new keeptoo.KButton();
        btnClear = new keeptoo.KButton();
        btnAdd = new keeptoo.KButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(63, 120, 208));
        kGradientPanel1.setkStartColor(new java.awt.Color(39, 56, 83));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Signup");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        kGradientPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 470, 20));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First Name:");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        txtFirstName.setForeground(new java.awt.Color(255, 255, 255));
        txtFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtFirstName.setOpaque(false);
        kGradientPanel1.add(txtFirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 350, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last Name:");
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtLastName.setForeground(new java.awt.Color(255, 255, 255));
        txtLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtLastName.setOpaque(false);
        kGradientPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 350, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address:");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddress.setOpaque(false);
        kGradientPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 350, -1));

        txtTelephone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTelephone.setOpaque(false);
        kGradientPanel1.add(txtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 350, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telephone:");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Sex:");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Password:");
        kGradientPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        rdbFemale.setForeground(new java.awt.Color(255, 255, 255));
        rdbFemale.setText("Female");
        rdbFemale.setOpaque(false);
        kGradientPanel1.add(rdbFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        rdbMale.setForeground(new java.awt.Color(255, 255, 255));
        rdbMale.setText("Male");
        rdbMale.setOpaque(false);
        kGradientPanel1.add(rdbMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Upload your picture profile: ");
        kGradientPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        txtCountry.setForeground(new java.awt.Color(255, 255, 255));
        txtCountry.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCountry.setOpaque(false);
        kGradientPanel1.add(txtCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 350, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Country:");
        kGradientPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        btnPicture.setText("Choose picture");
        btnPicture.setkEndColor(new java.awt.Color(63, 120, 208));
        btnPicture.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnPicture.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnPicture.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnPicture.setkStartColor(new java.awt.Color(111, 122, 140));
        kGradientPanel1.add(btnPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 30));

        btnClear.setText("Clear");
        btnClear.setkEndColor(new java.awt.Color(63, 120, 208));
        btnClear.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnClear.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnClear.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnClear.setkStartColor(new java.awt.Color(111, 122, 140));
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 90, 30));

        btnAdd.setText("Add");
        btnAdd.setkEndColor(new java.awt.Color(63, 120, 208));
        btnAdd.setkHoverEndColor(new java.awt.Color(255, 255, 255));
        btnAdd.setkHoverForeGround(new java.awt.Color(0, 0, 0));
        btnAdd.setkHoverStartColor(new java.awt.Color(255, 255, 255));
        btnAdd.setkStartColor(new java.awt.Color(111, 122, 140));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        kGradientPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 90, 30));

        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtPassword.setOpaque(false);
        kGradientPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 350, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAddress.setText("");
        txtTelephone.setText("");
        txtPassword.setText("");
        txtCountry.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtFirstName, sb, "First Name field is empty");
        DataValidator.validateEmpty(txtLastName, sb, "Last Name field is empty");
        DataValidator.validateEmpty(txtAddress, sb, "Address field is empty");
        DataValidator.validateEmpty(txtTelephone, sb, "Telephone field is empty");
        DataValidator.validateEmpty(txtPassword, sb, "Password field is empty");
        DataValidator.validateEmpty(txtCountry, sb, "Country field is empty");
        if (sb.length() > 0){
            MessageDialogHelper.showErrorDialog(null, sb.toString(), "Error");
            return;
        }
        if (MessageDialogHelper.showConfirmDialog(null, "Confirm?", "Question") == JOptionPane.NO_OPTION){
            return;
        }
        try {
            User u = new User();
            u.setFirstName(txtFirstName.getText());
            u.setLastName(txtLastName.getText());
            u.setTelephone(txtTelephone.getText());
            u.setAddress(txtAddress.getText());
            u.setCountry(txtCountry.getText());
            u.setPassword(new String(txtPassword.getPassword()));
            u.setSex(rdbMale.isSelected() ? 1: 0);

            UserDao dao = new UserDao();
            if (dao.insertUser(u)){
                MessageDialogHelper.showMessageDialog(null, "Saved", "Information");
            } else {
                MessageDialogHelper.showConfirmDialog(null, "Cannot saved", "Warning");
            }

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(null, e.getMessage(), "Error");
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(SignupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignupDialog dialog = new SignupDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private keeptoo.KButton btnAdd;
    private keeptoo.KButton btnClear;
    private keeptoo.KButton btnPicture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JRadioButton rdbFemale;
    private javax.swing.JRadioButton rdbMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}
