/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enrollmentsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author natha
 */
public class ApplicationForm extends javax.swing.JFrame {
    
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form ApplicationForm
     */
    public ApplicationForm() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtLRN = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtMiddlename = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtPlaceofbirth = new javax.swing.JTextField();
        optMale = new javax.swing.JRadioButton();
        optFemale = new javax.swing.JRadioButton();
        cmbCollege = new javax.swing.JComboBox();
        cmbCourse = new javax.swing.JComboBox();
        lblEnrollmentStatus = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnCheck = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnSubmit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("LRN:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(183, 49, 22, 13);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel3.setText("LASTNAME:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(150, 87, 56, 13);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel4.setText("FIRSTNAME:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(145, 125, 60, 13);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("MIDDLENAME:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(137, 163, 69, 13);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel15.setText("AGE:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(182, 201, 24, 13);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel16.setText("BIRTHDAY (MM/DD/YYYY):");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(79, 277, 126, 13);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel21.setText("ADDRESS:");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(156, 239, 49, 13);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("PLACE OF BIRTH:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(121, 315, 84, 13);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel22.setText("GENDER:");
        jPanel2.add(jLabel22);
        jLabel22.setBounds(162, 354, 43, 13);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel7.setText("CHOOSE COLLEGE:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(113, 394, 93, 13);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel8.setText("CHOOSE COURSE:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(116, 432, 89, 13);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setText("ENROLLMENT STATUS:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(96, 467, 109, 13);
        jPanel2.add(txtLRN);
        txtLRN.setBounds(216, 46, 201, 20);
        jPanel2.add(txtLastname);
        txtLastname.setBounds(216, 84, 201, 20);
        jPanel2.add(txtFirstname);
        txtFirstname.setBounds(216, 122, 201, 20);
        jPanel2.add(txtMiddlename);
        txtMiddlename.setBounds(216, 160, 201, 20);
        jPanel2.add(txtAge);
        txtAge.setBounds(216, 198, 58, 20);
        jPanel2.add(txtAddress);
        txtAddress.setBounds(216, 236, 270, 20);
        jPanel2.add(txtBirthday);
        txtBirthday.setBounds(216, 274, 201, 20);
        jPanel2.add(txtPlaceofbirth);
        txtPlaceofbirth.setBounds(216, 312, 270, 20);

        optMale.setText("Male");
        jPanel2.add(optMale);
        optMale.setBounds(216, 350, 47, 23);

        optFemale.setText("Female");
        jPanel2.add(optFemale);
        optFemale.setBounds(265, 350, 59, 23);

        cmbCollege.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---CHOOSE---" }));
        cmbCollege.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCollegeItemStateChanged(evt);
            }
        });
        jPanel2.add(cmbCollege);
        cmbCollege.setBounds(216, 391, 201, 20);

        cmbCourse.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---CHOOSE---" }));
        jPanel2.add(cmbCourse);
        cmbCourse.setBounds(216, 429, 201, 20);

        lblEnrollmentStatus.setText(" ");
        jPanel2.add(lblEnrollmentStatus);
        lblEnrollmentStatus.setBounds(216, 467, 201, 14);

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        btnBack.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(340, 490, 100, 30);

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));

        btnCancel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.setContentAreaFilled(false);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(230, 490, 100, 30);

        jPanel7.setBackground(new java.awt.Color(51, 204, 0));

        btnCheck.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheck.setText("CHECK");
        btnCheck.setContentAreaFilled(false);
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCheck, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);
        jPanel7.setBounds(120, 490, 100, 30);

        jPanel8.setBackground(new java.awt.Color(51, 204, 0));

        btnSubmit.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSubmit.setText("SUBMIT APPLICATION");
        btnSubmit.setContentAreaFilled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel8);
        jPanel8.setBounds(180, 530, 210, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("APPLICATION FORM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(70, 0, 420, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enrollmentsystem/Pictures/applicationBG.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 560, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Applicant a = new Applicant();
        a.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCollegeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCollegeItemStateChanged
        // TODO add your handling code here:
        String str = cmbCollege.getSelectedItem().toString(), str2 = "";
        try{
            if(!str.equals("---CHOOSE---")){
                if(str.equals("College of Engineering and Technology"))
                    str2 = "CET";
                else if(str.equals("College of Science"))
                    str2 = "CS";
                String sql = "SELECT * FROM COURSE WHERE COLLEGE_CODE = '"+str2+"'";
                conn = ConnectDB.Connect();
                ps = conn.prepareStatement(sql);
                rs = ps.executeQuery();
                cmbCourse.removeAllItems();
                cmbCourse.addItem("---CHOOSE---");
                while(rs.next()){
                    cmbCourse.addItem(rs.getString("COURSEDESCRIPTION"));
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_cmbCollegeItemStateChanged

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        // TODO add your handling code here:
        if(!txtLRN.getText().trim().equals("") &&
                !txtLastname.getText().trim().equals("") &&
                !txtFirstname.getText().trim().equals("") &&
                !txtMiddlename.getText().trim().equals("") &&
                !txtAge.getText().trim().equals("") &&
                !txtAddress.getText().trim().equals("") &&
                !txtBirthday.getText().trim().equals("") &&
                !txtPlaceofbirth.getText().trim().equals("") &&
                (optMale.isSelected() || optFemale.isSelected()) &&
                !cmbCollege.getSelectedItem().toString().trim().equals("---CHOOSE---") &&
                !cmbCollege.getSelectedItem().toString().trim().equals("---CHOOSE---"))
        {
            btnCancel.setEnabled(true);
            btnSubmit.setEnabled(true);
            btnCheck.setEnabled(false);
            
            disableAll();
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Fill Up All Fields");
            btnSubmit.setEnabled(false);
            btnCancel.setEnabled(false);
            btnCheck.setEnabled(true);
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnCancel.setEnabled(false);
        btnSubmit.setEnabled(false);
        lblEnrollmentStatus.setText("Applicant");
        try{
            String sql = "SELECT COLLEGEDESCRIPTION FROM COLLEGE";
            conn = ConnectDB.Connect();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cmbCollege.addItem(rs.getString("COLLEGEDESCRIPTION"));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        enableAll();
        clearAll();
        btnSubmit.setEnabled(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        try{
            String str = "SELECT * FROM APPLICANT WHERE LRN = '"+txtLRN.getText().trim()+"'";
            ps = conn.prepareStatement(str);
            rs = ps.executeQuery();
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "Record Already Exist");
                enableAll();
                clearAll();
                btnSubmit.setEnabled(false);
                btnCheck.setEnabled(true);
                btnCancel.setEnabled(false);
            }
            else{
                if(JOptionPane.showConfirmDialog(null, "Submit Application Form?", 
                        "Application", JOptionPane.YES_NO_OPTION, 1) == JOptionPane.YES_NO_OPTION){
                    String gender = "", college = "", course = "";
                    
                    if(optMale.isSelected())
                        gender = optMale.getText();
                    else
                        gender = optFemale.getText();
                   
                    if(cmbCollege.getSelectedItem().toString().equals("College of Engineering and Technology"))
                        college = "CET";
                    else if(cmbCollege.getSelectedItem().toString().equals("College of Science"))
                        college = "CS";
                    
                    if(cmbCourse.getSelectedItem().toString().equals("BS Computer Science"))
                        course = "BSCS";
                    else if(cmbCourse.getSelectedItem().toString().equals("BS Civil Engineering"))
                        course = "BSCE";
                    else if(cmbCourse.getSelectedItem().toString().equals("BS Biology"))
                        course = "BSBIO";
                    else if(cmbCourse.getSelectedItem().toString().equals("BS Psychology"))
                        course = "BSPSYCH";
                    
                    String sql = "INSERT INTO APPLICANT VALUES ('"
                            +txtLRN.getText().trim()+"', '"
                            +txtLastname.getText().trim()+"', '"
                            +txtFirstname.getText().trim()+"', '"
                            +txtMiddlename.getText().trim()+"', '"
                            +txtAge.getText().trim()+"', '"
                            +txtAddress.getText().trim()+"', '"
                            +txtBirthday.getText().trim()+"', '"
                            +txtPlaceofbirth.getText().trim()+"', '"
                            +gender+"', '"
                            +college+"', '"
                            +course+"', '"
                            +lblEnrollmentStatus.getText().trim()+"',null,null)";
                    ps = conn.prepareStatement(sql);
                    ps.executeUpdate();
                    clearAll();
                    enableAll();
                    btnCheck.setEnabled(true);
                    btnCancel.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "Form Submitted");
                    btnSubmit.setEnabled(false);
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed
    
    public void disableAll(){
        txtLRN.setEnabled(false);
        txtLastname.setEnabled(false);
        txtFirstname.setEnabled(false);
        txtMiddlename.setEnabled(false);
        txtAge.setEnabled(false);
        txtBirthday.setEnabled(false);
        txtAddress.setEnabled(false);
        txtPlaceofbirth.setEnabled(false);
        cmbCourse.setEnabled(false);
        cmbCollege.setEnabled(false);
        optMale.setEnabled(false);
        optFemale.setEnabled(false);
    }
    
    public void enableAll(){
        txtLRN.setEnabled(true);
        txtLastname.setEnabled(true);
        txtFirstname.setEnabled(true);
        txtMiddlename.setEnabled(true);
        txtAge.setEnabled(true);
        txtBirthday.setEnabled(true);
        txtAddress.setEnabled(true);
        txtPlaceofbirth.setEnabled(true);
        cmbCourse.setEnabled(true);
        cmbCollege.setEnabled(true);
        optMale.setEnabled(true);
        optFemale.setEnabled(true);
    }
    
    public void clearAll(){
        txtLRN.setText("");
        txtLastname.setText("");
        txtFirstname.setText("");
        txtMiddlename.setText("");
        txtAge.setText("");
        txtBirthday.setText("");
        txtAddress.setText("");
        txtPlaceofbirth.setText("");
        cmbCourse.setSelectedIndex(0);
        cmbCollege.setSelectedIndex(0);
        optMale.setSelected(false);
        optFemale.setSelected(false);
    }
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
            java.util.logging.Logger.getLogger(ApplicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ApplicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ApplicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ApplicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ApplicationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cmbCollege;
    private javax.swing.JComboBox cmbCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblEnrollmentStatus;
    private javax.swing.JRadioButton optFemale;
    private javax.swing.JRadioButton optMale;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtLRN;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMiddlename;
    private javax.swing.JTextField txtPlaceofbirth;
    // End of variables declaration//GEN-END:variables
}