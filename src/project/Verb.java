/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Chalee
 */
public class Verb extends javax.swing.JFrame {

    /**
     * Creates new form Verb2
     */
    public Verb() {
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

        bg = new javax.swing.JPanel();
        WordGame1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        กากบาท = new javax.swing.JLabel();
        กากบาท1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        option1 = new javax.swing.JButton();
        option3 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        option4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        WordGame1.setBackground(new java.awt.Color(0, 0, 0));
        WordGame1.setFont(new java.awt.Font("Ashcan BB", 1, 36)); // NOI18N
        WordGame1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WordGame1.setText("\tRead");
        bg.add(WordGame1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 0, 0));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        กากบาท.setFont(new java.awt.Font("Ashcan BB", 1, 30)); // NOI18N
        กากบาท.setForeground(new java.awt.Color(255, 255, 255));
        กากบาท.setText("X");
        กากบาท.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                กากบาทMouseClicked(evt);
            }
        });

        กากบาท1.setFont(new java.awt.Font("Ashcan BB", 1, 24)); // NOI18N
        กากบาท1.setForeground(new java.awt.Color(255, 255, 255));
        กากบาท1.setText("<<");
        กากบาท1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                กากบาท1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(กากบาท1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 326, Short.MAX_VALUE)
                .addComponent(กากบาท, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(กากบาท, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(กากบาท1))
                .addContainerGap())
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("___________________________");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 360, -1));

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setForeground(new java.awt.Color(204, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(204, 102, 0));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Medium", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 0));
        jLabel6.setText("___________________________");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 350, -1));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, -1, -1));

        option1.setText("ทดสอบ");
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });
        jPanel1.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 60));

        option3.setText("jButton2");
        jPanel1.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 60));

        option2.setText("jButton2");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });
        jPanel1.add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 150, 60));

        option4.setText("jButton2");
        jPanel1.add(option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 150, 60));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void กากบาทMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_กากบาทMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_กากบาทMouseClicked

    private void กากบาท1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_กากบาท1MouseClicked
        // TODO add your handling code here:
         Page2 p = new Page2();
        p.setVisible(true);
    }//GEN-LAST:event_กากบาท1MouseClicked

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option1ActionPerformed

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2ActionPerformed

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
            java.util.logging.Logger.getLogger(Verb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Verb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Verb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Verb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Verb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel WordGame1;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton option1;
    private javax.swing.JButton option2;
    private javax.swing.JButton option3;
    private javax.swing.JButton option4;
    private javax.swing.JLabel กากบาท;
    private javax.swing.JLabel กากบาท1;
    // End of variables declaration//GEN-END:variables
}