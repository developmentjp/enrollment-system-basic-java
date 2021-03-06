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
public class ViewApplicantInformation extends javax.swing.JFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    /**
     * Creates new form ViewApplicantInformation
     */
    public ViewApplicantInformation() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtLRN = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblLastname = new javax.swing.JLabel();
        lblMiddlename = new javax.swing.JLabel();
        lblPlaceofbirth = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblCollege = new javax.swing.JLabel();
        lblCourse = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblExamscore = new javax.swing.JLabel();
        lblExamresult = new javax.swing.JLabel();
        lblFirstname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 0));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 3, true));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel8.setText("COURSE:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(388, 189, 39, 14);

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel22.setText("GENDER:");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(389, 125, 40, 14);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel7.setText("COLLEGE:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(385, 157, 43, 14);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel6.setText("PLACE OF BIRTH:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(348, 93, 75, 14);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel16.setText("BIRTHDAY (MM/DD/YYYY):");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(35, 253, 126, 14);

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel15.setText("AGE:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(138, 189, 22, 14);

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel21.setText("ADDRESS:");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(112, 221, 45, 14);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel3.setText("LASTNAME:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(106, 93, 54, 14);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel2.setText("LRN:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(139, 56, 21, 14);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel5.setText("MIDDLENAME:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(93, 157, 69, 14);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel4.setText("FIRSTNAME:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(101, 125, 56, 14);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setText("APPLICANT INFORMATION");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(140, 10, 400, 30);

        txtLRN.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jPanel1.add(txtLRN);
        txtLRN.setBounds(172, 53, 150, 20);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel10.setText("EXAM SCORE:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(362, 253, 62, 14);

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel11.setText("EXAM RESULT:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(359, 285, 66, 14);

        lblLastname.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblLastname.setText(" ");
        jPanel1.add(lblLastname);
        lblLastname.setBounds(172, 93, 138, 14);

        lblMiddlename.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblMiddlename.setText(" ");
        jPanel1.add(lblMiddlename);
        lblMiddlename.setBounds(172, 157, 138, 14);

        lblPlaceofbirth.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblPlaceofbirth.setText(" ");
        jPanel1.add(lblPlaceofbirth);
        lblPlaceofbirth.setBounds(439, 93, 138, 14);

        lblAge.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblAge.setText(" ");
        jPanel1.add(lblAge);
        lblAge.setBounds(172, 189, 138, 14);

        lblAddress.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblAddress.setText(" ");
        jPanel1.add(lblAddress);
        lblAddress.setBounds(172, 221, 138, 14);

        lblBirthday.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblBirthday.setText(" ");
        jPanel1.add(lblBirthday);
        lblBirthday.setBounds(172, 253, 138, 14);

        lblGender.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblGender.setText(" ");
        jPanel1.add(lblGender);
        lblGender.setBounds(439, 125, 138, 14);

        lblCollege.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblCollege.setText(" ");
        jPanel1.add(lblCollege);
        lblCollege.setBounds(439, 157, 239, 14);

        lblCourse.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblCourse.setText(" ");
        jPanel1.add(lblCourse);
        lblCourse.setBounds(439, 189, 138, 14);

        lblStatus.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblStatus.setText(" ");
        jPanel1.add(lblStatus);
        lblStatus.setBounds(440, 221, 138, 14);

        lblExamscore.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblExamscore.setText(" ");
        jPanel1.add(lblExamscore);
        lblExamscore.setBounds(440, 253, 138, 14);

        lblExamresult.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblExamresult.setText(" ");
        jPanel1.add(lblExamresult);
        lblExamresult.setBounds(440, 285, 138, 14);

        lblFirstname.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblFirstname.setText(" ");
        jPanel1.add(lblFirstname);
        lblFirstname.setBounds(172, 125, 138, 14);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 3, true));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(51, 204, 0));

        btnSearch.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(340, 10, 100, 30);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 11)); // NOI18N
        jLabel9.setText("ENROLLMENT STATUS:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(330, 180, 101, 14);

        jPanel4.setBackground(new java.awt.Color(51, 204, 0));

        btnBack.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorderPainted(false);
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
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);
        jPanel4.setBounds(450, 10, 100, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 40, 700, 270);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Applicant a = new Applicant();
        a.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try
        {
            conn = ConnectDB.Connect();
            String str = "SELECT applicant.lastname, applicant.firstname, applicant.middlename, "
                    + "applicant.age, applicant.address, applicant.birthday, applicant.placeofbirth, "
                    + "applicant.gender, college.collegedescription, course.coursedescription, applicant.status_code, "
                    + "applicant.examscore, applicant.examresult FROM APPLICANT "
                    + "INNER JOIN college ON applicant.college_code=college.college_code "
                    + "INNER JOIN course ON applicant.course_code=course.course_code "
                    + "WHERE LRN = '"+txtLRN.getText().trim()+"'";
            ps = conn.prepareStatement(str);
            rs = ps.executeQuery();
            
            if(rs.next())
            {
                lblLastname.setText(rs.getString("LASTNAME"));
                lblFirstname.setText(rs.getString("FIRSTNAME"));
                lblMiddlename.setText(rs.getString("MIDDLENAME"));
                lblAge.setText(rs.getString("AGE"));
                lblBirthday.setText(rs.getString("BIRTHDAY"));
                lblAddress.setText(rs.getString("ADDRESS"));
                lblPlaceofbirth.setText(rs.getString("PLACEOFBIRTH"));
                lblGender.setText(rs.getString("GENDER"));
                lblCollege.setText(rs.getString("COLLEGEDESCRIPTION"));
                lblCourse.setText(rs.getString("COURSEDESCRIPTION"));
                lblStatus.setText(rs.getString("STATUS_CODE"));
                if(rs.getString("EXAMSCORE") == null){
                    lblExamscore.setText("Not Available Yet");
                    lblExamresult.setText("Not Available Yet");
                }
                else{
                    lblExamscore.setText(rs.getString("EXAMSCORE"));
                    lblExamresult.setText(rs.getString("EXAMRESULT"));
                }
                       
                JOptionPane.showMessageDialog(null, "RECORD FOUND!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "RECORD DOES NOT EXIST!");
                txtLRN.setText("");
            }
                  
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(ViewApplicantInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewApplicantInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewApplicantInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewApplicantInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewApplicantInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblCollege;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblExamresult;
    private javax.swing.JLabel lblExamscore;
    private javax.swing.JLabel lblFirstname;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblMiddlename;
    private javax.swing.JLabel lblPlaceofbirth;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtLRN;
    // End of variables declaration//GEN-END:variables
}
