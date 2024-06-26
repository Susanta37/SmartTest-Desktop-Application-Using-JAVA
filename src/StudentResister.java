
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class StudentResister extends javax.swing.JFrame {

    /**
     * Creates new form StudentResister
     */
    public StudentResister() {
        initComponents();
        date.addItem("Day");
        for(int i=1;i<=31;i++){
            date.addItem(String.valueOf(i));
        }
        month.addItem("Month");
        month.addItem("JAN");
        month.addItem("FEB");
        month.addItem("MAR");
        month.addItem("APR");
        month.addItem("MAY");
        month.addItem("JUN");
        month.addItem("JUL");
        month.addItem("AUG");
        month.addItem("SEP");
        month.addItem("OCT");
        month.addItem("NOV");
        month.addItem("DEC");
        
        year.addItem("Year");
        for(int j=1000;j<=2024;j++){
            year.addItem(String.valueOf(j));
        }
        gender.addItem("Select Your Gender");
        gender.addItem("Male");
        gender.addItem("Female");
        gender.addItem("Others");
        
        state.addItem("Select Your State");
        state.addItem("Odisha");
        state.addItem("Bihar");
        state.addItem("Pashimabang");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fullname = new javax.swing.JTextField();
        regdno = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        year = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        pincode = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        cps = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("REGISTRATION");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("STUDENT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 204, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("NEW");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        fullname.setBackground(new java.awt.Color(255, 204, 0));
        fullname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fullname.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "FULL NAME", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });

        regdno.setBackground(new java.awt.Color(255, 204, 0));
        regdno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        regdno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRATION NO.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        regdno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regdnoActionPerformed(evt);
            }
        });

        phoneno.setBackground(new java.awt.Color(255, 204, 0));
        phoneno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PHONE NO.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        phoneno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonenoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("D.O.B");

        date.setBackground(new java.awt.Color(255, 204, 0));
        date.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        month.setBackground(new java.awt.Color(255, 204, 0));
        month.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        year.setBackground(new java.awt.Color(255, 204, 0));
        year.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("GENDER");

        gender.setBackground(new java.awt.Color(255, 204, 0));
        gender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        email.setBackground(new java.awt.Color(255, 204, 0));
        email.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-MAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        pincode.setBackground(new java.awt.Color(255, 204, 0));
        pincode.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pincode.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PINCODE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        pincode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pincodeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("STATE");

        state.setBackground(new java.awt.Color(255, 204, 0));
        state.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        password.setBackground(new java.awt.Color(255, 204, 0));
        password.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        cps.setBackground(new java.awt.Color(255, 204, 0));
        cps.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cps.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONFIRM PASSWORD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jButton1.setBackground(new java.awt.Color(0, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("SIGN UP");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(state, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(regdno, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cps, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(fullname, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regdno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(pincode, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cps, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 540, 670));

        jLabel1.setBackground(new java.awt.Color(255, 204, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Admin regd.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1470, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void regdnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regdnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regdnoActionPerformed

    private void phonenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phonenoActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void pincodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pincodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pincodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        StudentLoginPage SL=new StudentLoginPage();
        SL.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String FNAME=fullname.getText();
      String REGDNO=regdno.getText();
      String PHONENO=phoneno.getText();
    
      String DATE=date.getSelectedItem().toString();
      String MONTH=month.getSelectedItem().toString();
      String YEAR=year.getSelectedItem().toString();
      String DOB=(DATE+"/"+MONTH+"/"+YEAR);
      String GENDER=gender.getSelectedItem().toString();
      String EMAIL=email.getText();
      String PINCODE=pincode.getText();
       String STATE=state.getSelectedItem().toString();
      String PASSWORD=password.getText();
      String CPASSWORD=cps.getText();
      if(FNAME.isEmpty()||REGDNO.isEmpty()||PHONENO.isEmpty()||DATE.equals("date")||MONTH.equals("month")||YEAR.equals("year")||GENDER.equals("Select Your Gender")||EMAIL.isEmpty()||STATE.equals("Select Your State")||pincode.getText().isEmpty()|| PASSWORD.isEmpty() ||CPASSWORD.isEmpty()){
          JOptionPane.showMessageDialog(null,"Please Enter Required field's");
      }else if(REGDNO.isEmpty()){
           JOptionPane.showMessageDialog(null,"Please Enter Registration No");
      }else if(PHONENO.isEmpty()){
          JOptionPane.showMessageDialog(null,"Please Enter Phone no");
      }
      else if(PHONENO.length()>10&&PHONENO.length()<10){
          JOptionPane.showMessageDialog(null,"Please Enter a valid mobile no");
      }else if(EMAIL.isEmpty()){
          JOptionPane.showMessageDialog(null,"Please Enter Email");
          
      }else if(pincode.getText().isEmpty()){
          JOptionPane.showMessageDialog(null,"Please Enter your Pincode");
      }else if(PINCODE.length()>6||PINCODE.length()<0){
          JOptionPane.showMessageDialog(null,"Please Enter a valid Pincode");
      }
      else if(!PASSWORD.equals(CPASSWORD)){
           JOptionPane.showMessageDialog(null,"Password must be same");
      }else{
           try{
              Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","203435@Susanta");
             PreparedStatement ps=con.prepareStatement("insert into StudentDB values(?,?,?,?,?,?,?,?,?)");
            ps.setString(1,FNAME );
            ps.setString(2, REGDNO);
            ps.setString(3,PHONENO );
            ps.setString(4,DOB );
            ps.setString(5, GENDER);
            ps.setString(6, EMAIL);
            ps.setString(7,pincode.getText() );
            ps.setString(8,STATE );
            ps.setString(9, PASSWORD);
           int r= ps.executeUpdate();
           if(r>0){
                JOptionPane.showMessageDialog(null,"Resistration Successful");
           }else{
               JOptionPane.showMessageDialog(null,"Something went wrong while updating please try again");
           }
           }catch(Exception e){
               
           }
      }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(StudentResister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cps;
    private javax.swing.JComboBox<String> date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phoneno;
    private javax.swing.JTextField pincode;
    private javax.swing.JTextField regdno;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
