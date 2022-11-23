package rt;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Info extends javax.swing.JFrame {

    private void kosong_kolom(){
        txtNo.setText(null);
        txtKegiatan.setText(null);
        txtDes.setText(null);
        butTambah.setBackground (Color.white);
        butKembali.setBackground(Color.white);
        butHapus.setBackground(Color.white);
    }
    
    private void tampil_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nomor Kegiatan");
        model.addColumn("Kegiatan");
        model.addColumn("Deskripsi Kegiatan");
        model.addColumn("Tanggal Upload");
    
        try{
            String sql = "SELECT * FROM info_desa";
            java.sql.Connection conn = (Connection)setdb.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next()){
                model.addRow(new Object[]{res.getString(1),
                                          res.getString(2),
                                          res.getString(3),
                                          res.getString(4)});
            }
            tabelData.setModel(model);
            
        }catch(SQLException e){
            System.out.println("Eror : " + e.getMessage());
        }
    }
    
    public Info() {
        initComponents();
        tampil_data();
        kosong_kolom();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butTambah = new javax.swing.JButton();
        butKembali = new javax.swing.JButton();
        butHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDes = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        txtKegiatan = new javax.swing.JTextField();
        txtNo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butTambah.setText("Tambah");
        butTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butTambahMouseExited(evt);
            }
        });
        butTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTambahActionPerformed(evt);
            }
        });
        getContentPane().add(butTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 130, 50));

        butKembali.setText("Kembali");
        butKembali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butKembaliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butKembaliMouseExited(evt);
            }
        });
        butKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(butKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 130, 50));

        butHapus.setText("Hapus");
        butHapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                butHapusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                butHapusMouseExited(evt);
            }
        });
        butHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHapusActionPerformed(evt);
            }
        });
        getContentPane().add(butHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 130, 50));

        txtDes.setBackground (new java.awt.Color(0,0,0,1));
        txtDes.setColumns(20);
        txtDes.setFont(new java.awt.Font("YouYuan", 0, 18)); // NOI18N
        txtDes.setRows(5);
        txtDes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(txtDes);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 230, 100));

        tabelData.setFont(new java.awt.Font("YouYuan", 0, 12)); // NOI18N
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomor Kegiatan", "Kegiatan", "Deskripsi Singkat", "Tanggal Upload"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 400, 310));

        txtKegiatan.setBackground (new java.awt.Color(0,0,0,1));
        txtKegiatan.setFont(new java.awt.Font("YouYuan", 0, 18)); // NOI18N
        txtKegiatan.setBorder(null);
        txtKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKegiatanActionPerformed(evt);
            }
        });
        getContentPane().add(txtKegiatan, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 230, 30));

        txtNo.setBackground (new java.awt.Color(0,0,0,1));
        txtNo.setFont(new java.awt.Font("YouYuan", 0, 18)); // NOI18N
        txtNo.setBorder(null);
        txtNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 230, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fixDesa.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHapusActionPerformed
        try{
            String sql = "DELETE FROM info_desa WHERE id_kegiatan='"+txtNo.getText()+"'";
            java.sql.Connection conn = (Connection)setdb.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Informasi berhasil dihapus");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosong_kolom();
    }//GEN-LAST:event_butHapusActionPerformed

    private void txtKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKegiatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKegiatanActionPerformed

    private void txtNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoActionPerformed

    private void butKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butKembaliActionPerformed
        new mainmenu().show();
        this.dispose();
    }//GEN-LAST:event_butKembaliActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int baris = tabelData.rowAtPoint(evt.getPoint());
        String no= tabelData.getValueAt(baris, 0).toString();
        txtNo.setText(no);

        String kgt= tabelData.getValueAt(baris, 1).toString();
        txtKegiatan.setText(kgt);

        String des = tabelData.getValueAt(baris, 2).toString();
        txtDes.setText(des);
    }//GEN-LAST:event_tabelDataMouseClicked

    private void butTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTambahActionPerformed
        try{
            if (txtNo.getText().equals("")||txtKegiatan.getText().equals("") || txtDes.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harap Isi Semua Data!");
            }else{
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                LocalDateTime now = LocalDateTime.now();
                String sql= "INSERT INTO info_desa VALUES ('"+txtNo.getText()+"','"
                +txtKegiatan.getText()+"','"
                +txtDes.getText()+"','"
                +dtf.format(now)+"')";
                java.sql.Connection conn = (Connection)setdb.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Informasi berhasil disimpan");
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosong_kolom();
    }//GEN-LAST:event_butTambahActionPerformed

    private void butTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butTambahMouseEntered
        // TODO add your handling code here:
        butTambah.setBackground(Color.gray);
    }//GEN-LAST:event_butTambahMouseEntered

    private void butTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butTambahMouseExited
        // TODO add your handling code here:
        butTambah.setBackground(Color.white);
    }//GEN-LAST:event_butTambahMouseExited

    private void butKembaliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butKembaliMouseEntered
        // TODO add your handling code here:
        butKembali.setBackground(Color.gray);
    }//GEN-LAST:event_butKembaliMouseEntered

    private void butKembaliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butKembaliMouseExited
        // TODO add your handling code here:
        butKembali.setBackground(Color.white);
    }//GEN-LAST:event_butKembaliMouseExited

    private void butHapusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHapusMouseEntered
        // TODO add your handling code here:
        butHapus.setBackground(Color.gray);
    }//GEN-LAST:event_butHapusMouseEntered

    private void butHapusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_butHapusMouseExited
        // TODO add your handling code here:
        butHapus.setBackground(Color.white);
    }//GEN-LAST:event_butHapusMouseExited

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butHapus;
    private javax.swing.JButton butKembali;
    private javax.swing.JButton butTambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextArea txtDes;
    private javax.swing.JTextField txtKegiatan;
    private javax.swing.JTextField txtNo;
    // End of variables declaration//GEN-END:variables
}
