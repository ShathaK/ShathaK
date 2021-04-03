package pkg251_project;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336)
 * This interface (MyReports_Page) displays the last 3 reports that has been made by the user.
 * 
 */
public class MyReports_Page extends javax.swing.JFrame {

    // the 3 reports contain the last 3 reports by the user.
    Report report1 = new Report();
    Report report2 = new Report();
    Report report3 = new Report();

    // Reports contains the reports by all users where MyReports contains the reports by specific user.
    ArrayList<Report> Reports = report1.ReadInformation();
    ArrayList<Report> MyReports = new ArrayList<>();

    // boolean variables to check the visbilty of the 3 reports.
    boolean R1Check = false, R2Check = false, R3Check = false;
    int[] n = new int[3]; // Reports number.
    String ID = "0000"; // User ID.

    /**
     * This constructer will initate the component and check the visibility and fill the reports
     */
    public MyReports_Page() {
        initComponents();
        n = report1.noReports(ID);
        MyReports = report1.Myreports(ID);
        visiblity();
        FillReports();
    }

    /**
     *
     * @param id cat breeder
     */
    public MyReports_Page(String id) {
        ID = id;
        initComponents();
        n = report1.noReports(ID);
        MyReports = report1.Myreports(ID);
        visiblity();
        FillReports();
    }

    // This method will displays the last 3 reports that the user Creates
    private void FillReports() {
        int number = report1.myReportsize(ID);
        if (number > 0) {
            // Report 1
            report1 = MyReports.get(n[0]);
            r1.setText(report1.getReport_info());
            if (report1.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(report1.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT);
                photo1.setIcon(icon);
            }
            // Report 2
            report2 = MyReports.get(n[1]);
            r2.setText(report2.getReport_info());
            if (report2.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(report2.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo2.getWidth(), photo2.getHeight(), Image.SCALE_DEFAULT);
                photo2.setIcon(icon);
            }
            // Report 3
            report3 = MyReports.get(n[2]);
            r3.setText(report3.getReport_info());
            if (report3.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(report3.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo3.getWidth(), photo3.getHeight(), Image.SCALE_DEFAULT);
                photo3.setIcon(icon);
            }
        }

    }

    // Determine the visibility for each report depending on the number of reports
    private void visiblity() {
        int number = report1.myReportsize(ID);
        if (number > 0) {
            R1Check = true;
            if (number > 1) {
                R2Check = true;
                if (number > 2) {
                    R3Check = true;
                }
            }
        }
        // Report 1
        r1.setVisible(R1Check);
        jSP1.setVisible(R1Check);
        jP1.setVisible(R1Check);
        photo1.setVisible(R1Check);
        Edit1.setVisible(R1Check);
        Delete1.setVisible(R1Check);

        // Report 2
        r2.setVisible(R2Check);
        jSP2.setVisible(R2Check);
        jP2.setVisible(R2Check);
        photo2.setVisible(R2Check);
        Edit2.setVisible(R2Check);
        Delete2.setVisible(R2Check);

        // Report 3
        r3.setVisible(R3Check);
        jSP3.setVisible(R3Check);
        jP3.setVisible(R3Check);
        photo3.setVisible(R3Check);
        Edit3.setVisible(R3Check);
        Delete3.setVisible(R3Check);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jP1 = new javax.swing.JPanel();
        photo1 = new javax.swing.JLabel();
        jSP1 = new javax.swing.JScrollPane();
        r1 = new javax.swing.JTextPane();
        Edit1 = new javax.swing.JButton();
        jSP2 = new javax.swing.JScrollPane();
        r2 = new javax.swing.JTextPane();
        jP2 = new javax.swing.JPanel();
        photo2 = new javax.swing.JLabel();
        jSP3 = new javax.swing.JScrollPane();
        r3 = new javax.swing.JTextPane();
        jP3 = new javax.swing.JPanel();
        photo3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Delete1 = new javax.swing.JButton();
        Delete2 = new javax.swing.JButton();
        Edit2 = new javax.swing.JButton();
        Delete3 = new javax.swing.JButton();
        Edit3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 228, 216));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 760));

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("My Reports Page");

        back.setBackground(new java.awt.Color(204, 204, 204));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back.setToolTipText("");
        back.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jP1.setPreferredSize(new java.awt.Dimension(200, 200));

        photo1.setBackground(new java.awt.Color(255, 255, 255));
        photo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo1.setText(" photo");

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP1Layout.createSequentialGroup()
                .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jSP1.setViewportView(r1);

        Edit1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Edit1.setText("Edit");
        Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit1ActionPerformed(evt);
            }
        });

        jSP2.setViewportView(r2);

        jP2.setPreferredSize(new java.awt.Dimension(200, 200));

        photo2.setBackground(new java.awt.Color(255, 255, 255));
        photo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo2.setText("photo");

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP2Layout.createSequentialGroup()
                .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jSP3.setViewportView(r3);

        jP3.setPreferredSize(new java.awt.Dimension(200, 200));

        photo3.setBackground(new java.awt.Color(255, 255, 255));
        photo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo3.setText(" photo");

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jP3Layout.createSequentialGroup()
                .addComponent(photo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("My Reports:");

        Delete1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete1.setText("Delete");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });

        Delete2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete2.setText("Delete");
        Delete2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete2ActionPerformed(evt);
            }
        });

        Edit2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Edit2.setText("Edit");
        Edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit2ActionPerformed(evt);
            }
        });

        Delete3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete3.setText("Delete");
        Delete3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete3ActionPerformed(evt);
            }
        });

        Edit3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Edit3.setText("Edit");
        Edit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jP3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSP3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Edit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Edit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Edit3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Edit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Edit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSP3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jP3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Edit3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Delete3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // This button used to go back
    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        MyProfile_Page m = new MyProfile_Page(ID);
        m.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    // This button used to edit report 1
    private void Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit1ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[0]).toString())) {
                report1.setReport_info(r1.getText());
                Reports.set(i, MyReports.get(n[0]));
            }
        }
        report1.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been edited!");
    }//GEN-LAST:event_Edit1ActionPerformed

    // This button used to delete report 1
    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[0]).toString())) {
                Reports.remove(i);
                break;
            }
        }
        report1.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been deleted!");
        this.setVisible(false);
        MyReports_Page a = new MyReports_Page(ID);
        a.setVisible(true);
    }//GEN-LAST:event_Delete1ActionPerformed

    // This button used to delete report 2
    private void Delete2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete2ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[1]).toString())) {
                Reports.remove(i);
                break;
            }
        }
        report2.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been deleted!");
        this.setVisible(false);
        MyReports_Page a = new MyReports_Page(ID);
        a.setVisible(true);
    }//GEN-LAST:event_Delete2ActionPerformed

    // This button used to edit report 2
    private void Edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit2ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[1]).toString())) {
                report2.setReport_info(r2.getText());
                Reports.set(i, MyReports.get(n[1]));
            }
        }
        report2.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been edited!");
    }//GEN-LAST:event_Edit2ActionPerformed

    // This button used to delete report 3
    private void Delete3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete3ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[2]).toString())) {
                Reports.remove(i);
                break;
            }
        }
        report3.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been deleted!");
        this.setVisible(false);
        MyReports_Page a = new MyReports_Page(ID);
        a.setVisible(true);
    }//GEN-LAST:event_Delete3ActionPerformed

    // This button used to edit report 3
    private void Edit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit3ActionPerformed
        for (int i = 0; i < Reports.size(); i++) {
            if (Reports.get(i).toString().equals(MyReports.get(n[2]).toString())) {
                report3.setReport_info(r3.getText());
                Reports.set(i, MyReports.get(n[2]));
            }
        }
        report3.UpdateInformation(Reports);
        JOptionPane.showMessageDialog(null, "The report has been edited!");
    }//GEN-LAST:event_Edit3ActionPerformed

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
            java.util.logging.Logger.getLogger(MyReports_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyReports_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyReports_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyReports_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyReports_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete1;
    private javax.swing.JButton Delete2;
    private javax.swing.JButton Delete3;
    private javax.swing.JButton Edit1;
    private javax.swing.JButton Edit2;
    private javax.swing.JButton Edit3;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jSP1;
    private javax.swing.JScrollPane jSP2;
    private javax.swing.JScrollPane jSP3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JTextPane r1;
    private javax.swing.JTextPane r2;
    private javax.swing.JTextPane r3;
    // End of variables declaration//GEN-END:variables
}
