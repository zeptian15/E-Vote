/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evoteorbit;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author AlvaroDwi
 */
public class HasilPilihan extends javax.swing.JFrame {

    /**
     * Creates new form HasilPilihan
     */
    Connection koneksi;
    
    public HasilPilihan() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setAlwaysOnTop(false);
        koneksi = KoneksiDB.connect();
        
        System.out.println("Paslon 1 : "+loadData(1)+" suara");
        System.out.println("Paslon 2 : "+loadData(2)+" suara");
        System.out.println("Paslon 3 : "+loadData(3)+" suara");
        
        // Set Hasil
        lbl_paslon1.setText(String.valueOf(loadData(1)));
        lbl_paslon2.setText(String.valueOf(loadData(2)));
        lbl_paslon3.setText(String.valueOf(loadData(3)));
    }
    
    public int loadData(int id){
        int countVote = 0;
        try{
            Statement stmt = koneksi.createStatement();
            String query = "SELECT COUNT(id_vote) FROM vote INNER JOIN calon ON (vote.id_calon=calon.id_calon) WHERE vote.id_calon = '"+id+"'";
            System.out.println(query);
            
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                countVote = rs.getInt("COUNT(id_vote)");
            }
        }catch(SQLException ez){
            ez.printStackTrace();
            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan Pada Query");
        }
        return countVote;
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
        lbl_paslon3 = new javax.swing.JLabel();
        lbl_paslon2 = new javax.swing.JLabel();
        lbl_paslon1 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_paslon3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_paslon3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paslon3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paslon3.setText("3");
        jPanel1.add(lbl_paslon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 70, -1));

        lbl_paslon2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_paslon2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paslon2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paslon2.setText("2");
        jPanel1.add(lbl_paslon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 80, -1));

        lbl_paslon1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_paslon1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_paslon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_paslon1.setText("1");
        jPanel1.add(lbl_paslon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 80, -1));

        btn_reset.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonReset.png"))); // NOI18N
        btn_reset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resetMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_resetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_resetMouseExited(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 110, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Hasil.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setText("Paslon 3");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel1.setText("JUMLAH VOTE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_resetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseEntered
        // Set Background
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonResetHover.png")));
    }//GEN-LAST:event_btn_resetMouseEntered

    private void btn_resetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseExited
        // Set Background
        btn_reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ButtonReset.png")));
    }//GEN-LAST:event_btn_resetMouseExited

    private void btn_resetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resetMouseClicked
        Connection koneksi = KoneksiDB.connect();
            Statement stmt = null;
        try {
            stmt = koneksi.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(HasilPilihan.class.getName()).log(Level.SEVERE, null, ex);
        }
            String sql = "DELETE FROM vote";
            int berhasil = 0;
        try {
            berhasil = stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(HasilPilihan.class.getName()).log(Level.SEVERE, null, ex);
        }
            if(berhasil == 1){                  
//                JOptionPane.showMessageDialog(null,"DB Berhasil Di Reset");
                System.out.println("Database Gagal di Delete");
            }else{
//                JOptionPane.showMessageDialog(null,"Terjadi Kesalahan...");
                System.out.println("Database Berhasil di Delete");
                this.dispose();
            }
    }//GEN-LAST:event_btn_resetMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HasilPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HasilPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HasilPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HasilPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HasilPilihan().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_paslon1;
    private javax.swing.JLabel lbl_paslon2;
    private javax.swing.JLabel lbl_paslon3;
    // End of variables declaration//GEN-END:variables
}
