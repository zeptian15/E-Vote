/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoteorbit;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Septian Ricky M
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        Kata_dua = new javax.swing.JLabel();
        Kata_satu = new javax.swing.JLabel();
        btn_cek = new javax.swing.JLabel();
        btn_masuk = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(41, 61, 107));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Kata_dua.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Kata_dua.setForeground(new java.awt.Color(255, 255, 255));
        Kata_dua.setText("yang Lebih Baik?");
        jPanel1.add(Kata_dua, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        Kata_satu.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Kata_satu.setForeground(new java.awt.Color(255, 255, 255));
        Kata_satu.setText("Ingin ORBIT memiliki Masa Depan");
        jPanel1.add(Kata_satu, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonCekHasil.png"))); // NOI18N
        btn_cek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cekMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_cekMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_cekMouseExited(evt);
            }
        });
        jPanel1.add(btn_cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonVote.png"))); // NOI18N
        btn_masuk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_masukMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_masukMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_masukMouseExited(evt);
            }
        });
        jPanel1.add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.png"))); // NOI18N
        jPanel1.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_masukMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseEntered
        // Set Background
        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonVoteHover.png")));
    }//GEN-LAST:event_btn_masukMouseEntered

    private void btn_masukMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseExited
        // Set Background
        btn_masuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonVote.png")));
    }//GEN-LAST:event_btn_masukMouseExited

    private void btn_masukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_masukMouseClicked
        System.out.println("Selamat Datang Zeptian");
        Dashboard_Pilih pilih = new Dashboard_Pilih();
        pilih.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_masukMouseClicked

    private void btn_cekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cekMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_cekMouseClicked

    private void btn_cekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cekMouseEntered
         // Set Background
        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonCekHasilHover.png")));
    }//GEN-LAST:event_btn_cekMouseEntered

    private void btn_cekMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cekMouseExited
        // Set Background
        btn_cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonCekHasil.png")));
    }//GEN-LAST:event_btn_cekMouseExited

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Kata_dua;
    private javax.swing.JLabel Kata_satu;
    private javax.swing.JLabel btn_cek;
    private javax.swing.JLabel btn_masuk;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
