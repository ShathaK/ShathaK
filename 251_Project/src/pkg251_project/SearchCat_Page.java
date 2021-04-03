package pkg251_project;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Rahaf(1806039), Maha(1805384), Shatha(1806336) 
 * This interface (SearchCat_Page) displays the last 4 cat that has been added to the system.
 */
public class SearchCat_Page extends javax.swing.JFrame {

    // The 3 cat contain the last 3 Cat added by any user.
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();

    // Cats contains all cats that in our system.
    ArrayList<Cat> Cats = cat1.ReadInformation();

    // boolean variables to check the visbilty of the 3 cats post.
    boolean post1Check = false, post2Check = false, post3Check = false;
    // The number of cats.
    int number = cat1.CatNumber();
    // the position of the posts.
    int[] n = new int[3];
    // User ID.
    String ID = "0000";

    /**
     * This constructer will initate the component and check the visibility and fill the cat information
     */
    public SearchCat_Page() {
        n = cat1.noCatPosts();
        initComponents();
        visiblity();
        FillCats();
    }

    /**
     * This constructer will initate the component and check the visibility and fill the cat information
     * @param id cat
     */
    public SearchCat_Page(String id) {
        ID = id;
        n = cat1.noCatPosts();
        initComponents();
        visiblity();
        FillCats();
    }

    // This method will displays the last 3 cat that added to the system
    private void FillCats() {
        if (number > 0) {
            // Cat 1 Post
            cat1 = Cats.get(n[0]);
            post1.setText(cat1.PrintInfo());
            if (cat1.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(cat1.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_DEFAULT);
                photo1.setIcon(icon);
            }
            // Cat 2 Post
            cat2 = Cats.get(n[1]);
            post2.setText(cat2.PrintInfo());
            if (cat2.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(cat2.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo2.getWidth(), photo2.getHeight(), Image.SCALE_DEFAULT);
                photo2.setIcon(icon);
            }
            // Cat 3 Post
            cat3 = Cats.get(n[2]);
            post3.setText(cat3.PrintInfo());
            if (cat3.getPhoto() != null) {
                ImageIcon icon = new ImageIcon(cat3.getPhoto());
                Image i = icon.getImage().getScaledInstance(photo3.getWidth(), photo3.getHeight(), Image.SCALE_DEFAULT);
                photo3.setIcon(icon);
            }
        }

    }

    // Determine the visibility for each cat depending on the number of cat
    private void visiblity() {
        if (number > 0) {
            post1Check = true;
            if (number > 1) {
                post2Check = true;
                if (number > 2) {
                    post3Check = true;
                }
            }
        }
        // Post 1
        post1.setVisible(post1Check);
        jSP1.setVisible(post1Check);
        jP1.setVisible(post1Check);
        photo1.setVisible(post1Check);

        // Post 2
        post2.setVisible(post2Check);
        jSP2.setVisible(post2Check);
        jP2.setVisible(post2Check);
        photo2.setVisible(post2Check);

        // Post 3
        post3.setVisible(post3Check);
        jSP3.setVisible(post3Check);
        jP3.setVisible(post3Check);
        photo3.setVisible(post3Check);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        back2 = new javax.swing.JButton();
        jP1 = new javax.swing.JPanel();
        photo1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSP1 = new javax.swing.JScrollPane();
        post1 = new javax.swing.JTextPane();
        jSP2 = new javax.swing.JScrollPane();
        post2 = new javax.swing.JTextPane();
        jP2 = new javax.swing.JPanel();
        photo2 = new javax.swing.JLabel();
        jSP3 = new javax.swing.JScrollPane();
        post3 = new javax.swing.JTextPane();
        jP3 = new javax.swing.JPanel();
        photo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 228, 216));
        jPanel5.setPreferredSize(new java.awt.Dimension(600, 760));

        jPanel6.setBackground(new java.awt.Color(236, 236, 236));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(600, 100));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Search for Cat Page");

        back2.setBackground(new java.awt.Color(204, 204, 204));
        back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        back2.setToolTipText("");
        back2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        back2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(back2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jP1.setPreferredSize(new java.awt.Dimension(140, 160));

        photo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo1.setText("photo");
        photo1.setPreferredSize(new java.awt.Dimension(140, 140));
        photo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photo1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP1Layout = new javax.swing.GroupLayout(jP1);
        jP1.setLayout(jP1Layout);
        jP1Layout.setHorizontalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jP1Layout.setVerticalGroup(
            jP1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel1.setText("< click on the photo to go to the cat page>");

        post1.setEditable(false);
        jSP1.setViewportView(post1);

        post2.setEditable(false);
        jSP2.setViewportView(post2);

        jP2.setPreferredSize(new java.awt.Dimension(140, 160));

        photo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo2.setText("photo");
        photo2.setPreferredSize(new java.awt.Dimension(140, 140));
        photo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photo2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP2Layout = new javax.swing.GroupLayout(jP2);
        jP2.setLayout(jP2Layout);
        jP2Layout.setHorizontalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jP2Layout.setVerticalGroup(
            jP2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        post3.setEditable(false);
        jSP3.setViewportView(post3);

        jP3.setPreferredSize(new java.awt.Dimension(140, 160));

        photo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photo3.setText("photo");
        photo3.setPreferredSize(new java.awt.Dimension(140, 140));
        photo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                photo3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jP3Layout = new javax.swing.GroupLayout(jP3);
        jP3.setLayout(jP3Layout);
        jP3Layout.setHorizontalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jP3Layout.setVerticalGroup(
            jP3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSP3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jSP1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP2, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jSP2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jP3, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jSP3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // This button used to go back
    private void back2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back2ActionPerformed
        Home_Page h = new Home_Page(ID);
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back2ActionPerformed
    // When the user clicks on photo 1, the system transfer to cat page
    private void photo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photo1MouseClicked
        AdoptCat_Page a = new AdoptCat_Page(cat1, ID);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_photo1MouseClicked
    // When the user clicks on photo 2, the system transfer to cat page
    private void photo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photo2MouseClicked
        AdoptCat_Page a = new AdoptCat_Page(cat2, ID);
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_photo2MouseClicked
    // When the user clicks on photo 3, the system transfer to cat page
    private void photo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_photo3MouseClicked
        AdoptCat_Page a = new AdoptCat_Page(cat3, ID);
         a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_photo3MouseClicked

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
            java.util.logging.Logger.getLogger(SearchCat_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCat_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCat_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCat_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchCat_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jP1;
    private javax.swing.JPanel jP2;
    private javax.swing.JPanel jP3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jSP1;
    private javax.swing.JScrollPane jSP2;
    private javax.swing.JScrollPane jSP3;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JTextPane post1;
    private javax.swing.JTextPane post2;
    private javax.swing.JTextPane post3;
    // End of variables declaration//GEN-END:variables
}
