package pkg251_project;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 * This interface (Home_Page) it is the menu of the system that allowed the user to transform easily.
 * 
 */
public class Home_Page extends javax.swing.JFrame {

    // The CatBreeder C represent the user
    CatBreeder C = new CatBreeder();
    
    // User ID
    String ID = "0000";

    /**
     * This constructer will initate the component
     */
    public Home_Page() {
        initComponents();
    }

    /**
     *
     * @param id cat breeder
     */
    public Home_Page(String id) {
        C = C.FindByID(id);
        ID = id;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        View_my_Profile = new javax.swing.JButton();
        Submit_Report = new javax.swing.JButton();
        Communication_Forum = new javax.swing.JButton();
        Search_for_Clinic_and_Store = new javax.swing.JButton();
        Search_for_Cat = new javax.swing.JButton();
        Add_New_Cat = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 228, 216));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 760));

        View_my_Profile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        View_my_Profile.setText("View my Profile");
        View_my_Profile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_my_ProfileActionPerformed(evt);
            }
        });

        Submit_Report.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Submit_Report.setText("Submit Report");
        Submit_Report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_ReportActionPerformed(evt);
            }
        });

        Communication_Forum.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Communication_Forum.setText("The Communication Forum");
        Communication_Forum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Communication_ForumActionPerformed(evt);
            }
        });

        Search_for_Clinic_and_Store.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Search_for_Clinic_and_Store.setText("Search for Clinic/Store");
        Search_for_Clinic_and_Store.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_for_Clinic_and_StoreActionPerformed(evt);
            }
        });

        Search_for_Cat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Search_for_Cat.setText("Search for Cat");
        Search_for_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_for_CatActionPerformed(evt);
            }
        });

        Add_New_Cat.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Add_New_Cat.setText("Add New Cat");
        Add_New_Cat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_New_CatActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Home Page");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        Logout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Search_for_Clinic_and_Store, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(View_my_Profile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Communication_Forum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Search_for_Cat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Submit_Report, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add_New_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(View_my_Profile, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add_New_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Search_for_Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Communication_Forum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Submit_Report, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Search_for_Clinic_and_Store, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // This button used to transform to (Search_for_CatActionPerformed)
    private void Search_for_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_for_CatActionPerformed
        this.dispose();
        new SearchCat_Page(ID).setVisible(true);
    }//GEN-LAST:event_Search_for_CatActionPerformed

    // This button used to transform to (Communication_ForumActionPerformed)
    private void Communication_ForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Communication_ForumActionPerformed
        this.dispose();
        new CommunicationFourm_Page(ID).setVisible(true);
    }//GEN-LAST:event_Communication_ForumActionPerformed

    // This button used to transform to (View_my_ProfileActionPerformed)
    private void View_my_ProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_my_ProfileActionPerformed
        this.dispose();
        new MyProfile_Page(ID).setVisible(true);
    }//GEN-LAST:event_View_my_ProfileActionPerformed

    // This button used to Logout from the system
    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        this.dispose();
        new Welcome_Page().setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    // This button used to transform to (Search_for_Clinic_and_StoreActionPerformed)
    private void Search_for_Clinic_and_StoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_for_Clinic_and_StoreActionPerformed
        this.dispose();
        new SearchPlace_Page(ID).setVisible(true);
    }//GEN-LAST:event_Search_for_Clinic_and_StoreActionPerformed

    // This button used to transform to (Add_New_CatActionPerformed)
    private void Add_New_CatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_New_CatActionPerformed
        this.dispose();
        new AddCat_Page(ID).setVisible(true);
    }//GEN-LAST:event_Add_New_CatActionPerformed

    // This button used to transform to (Submit_ReportActionPerformed)
    private void Submit_ReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_ReportActionPerformed
        this.dispose();
        new SubmitReport_Page(ID).setVisible(true);
    }//GEN-LAST:event_Submit_ReportActionPerformed

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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_New_Cat;
    private javax.swing.JButton Communication_Forum;
    private javax.swing.JButton Logout;
    private javax.swing.JButton Search_for_Cat;
    private javax.swing.JButton Search_for_Clinic_and_Store;
    private javax.swing.JButton Submit_Report;
    private javax.swing.JButton View_my_Profile;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
