
package rt;

import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.awt.event.*;
/**
 *
 * @author ASUS
 */
public class Menu extends javax.swing.JFrame {
    private String x;
    /**
     * Creates new form Menu
     */
    private void kosong_kolom(){
        txtNik.setText(null);
        txtNama.setText(null);
        txtLahir.setText(null);
        txtGender.setText(null);
    }
    
    public class Publik {
        public static String id;
    }
    
    private void tampil_data(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("NIK");
        model.addColumn("Nama");
        model.addColumn("Tanggal Lahir");
        model.addColumn("Gender");
    
        try{
            String sql = "SELECT * FROM data_penduduk";
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
    
    public Menu() {
        initComponents();
        tampil_data();
        kosong_kolom();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        butTambah = new javax.swing.JButton();
        butUbah = new javax.swing.JButton();
        butHapus = new javax.swing.JButton();
        butKembali = new javax.swing.JButton();
        txtNik = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtLahir = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        butTambah.setText("Tambah");
        butTambah.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                butTambahAncestorResized(evt);
            }
        });
        butTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butTambahActionPerformed(evt);
            }
        });
        getContentPane().add(butTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 90, 50));

        butUbah.setText("Perbarui");
        butUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butUbahActionPerformed(evt);
            }
        });
        getContentPane().add(butUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 90, 50));

        butHapus.setText("Hapus");
        butHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butHapusActionPerformed(evt);
            }
        });
        getContentPane().add(butHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 90, 50));

        butKembali.setText("Kembali");
        butKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(butKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 90, 50));

        txtNik.setBackground (new java.awt.Color(0,0,0,1));
        txtNik.setFont(new java.awt.Font("YouYuan", 0, 22)); // NOI18N
        txtNik.setBorder(null);
        txtNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNikActionPerformed(evt);
            }
        });
        txtNik.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNikKeyTyped(evt);
            }
        });
        getContentPane().add(txtNik, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 230, 30));

        txtNama.setBackground (new java.awt.Color(0,0,0,1));
        txtNama.setFont(new java.awt.Font("YouYuan", 0, 22)); // NOI18N
        txtNama.setBorder(null);
        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 230, 30));

        txtLahir.setBackground (new java.awt.Color(0,0,0,1));
        txtLahir.setFont(new java.awt.Font("YouYuan", 0, 22)); // NOI18N
        txtLahir.setBorder(null);
        txtLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLahirActionPerformed(evt);
            }
        });
        getContentPane().add(txtLahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 220, 20));

        txtGender.setBackground (new java.awt.Color(0,0,0,1));
        txtGender.setFont(new java.awt.Font("YouYuan", 0, 22)); // NOI18N
        txtGender.setBorder(null);
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 230, 20));

        tabelData.setFont(new java.awt.Font("YouYuan", 0, 12)); // NOI18N
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIK", "Nama", "Tanggal Lahir", "Gender"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 400, 320));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fixData.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butTambahActionPerformed
        try{
            if (txtNik.getText().equals("") ||txtNama.getText().equals("")|| txtLahir.getText().equals("")|| txtGender.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Harap Isi Semua Data!");
            }else{
                if (txtGender.getText().equals("L") || txtGender.getText().equals("P")){
                    String sql = "INSERT INTO data_penduduk VALUES ('"+txtNik.getText()+"','"
                                                               +txtNama.getText()+"','"
                                                               +txtLahir.getText()+"','"
                                                               +txtGender.getText()+"')";
                    java.sql.Connection conn = (Connection)setdb.configDB();
                    java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                    pstm.execute();
                    JOptionPane.showMessageDialog(null, "Data Penduduk berhasil disimpan");
                } else {
                    JOptionPane.showMessageDialog(null, "Format Gender: Laki-Laki (L) dan Perempuan (P)");
                }
                
            }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosong_kolom();
    }//GEN-LAST:event_butTambahActionPerformed

    private void butUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butUbahActionPerformed
        try{
            if (txtGender.getText().equals("L") || txtGender.getText().equals("P")){
                String sql = "UPDATE data_penduduk SET nik='"+txtNik.getText()+"',nama='"
                                                         +txtNama.getText()+"',tgl_lahir='"
                                                         +txtLahir.getText()+"',gender='"
                                                         +txtGender.getText()+"' WHERE nik='"+Publik.id+"'";
                java.sql.Connection conn = (Connection)setdb.configDB();
                java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Penduduk berhasil diperbarui");
                kosong_kolom();
                tampil_data();
            }else{
                JOptionPane.showMessageDialog(null, "Format Gender: Laki-Laki (L) dan Perempuan (P)");
            }
            
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
    }//GEN-LAST:event_butUbahActionPerformed

    private void butHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butHapusActionPerformed
        try{
            String sql = "DELETE FROM data_penduduk WHERE nik='"+txtNik.getText()+"'";
            java.sql.Connection conn = (Connection)setdb.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Data Penduduk berhasil dihapus");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampil_data();
        kosong_kolom();
    }//GEN-LAST:event_butHapusActionPerformed

    private void txtNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNikActionPerformed
        
    }//GEN-LAST:event_txtNikActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void txtLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLahirActionPerformed

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void butKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butKembaliActionPerformed
        new mainmenu().show();
        this.dispose();
    }//GEN-LAST:event_butKembaliActionPerformed

    private void butTambahAncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_butTambahAncestorResized
        // TODO add your handling code here:
    }//GEN-LAST:event_butTambahAncestorResized

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
        int baris = tabelData.rowAtPoint(evt.getPoint());
        String nik = tabelData.getValueAt(baris, 0).toString();
        txtNik.setText(nik);
        Publik.id = nik;
        
        String nama = tabelData.getValueAt(baris, 1).toString();
        txtNama.setText(nama);

        String lahir = tabelData.getValueAt(baris, 2).toString();
        txtLahir.setText(lahir);

        String gender = tabelData.getValueAt(baris, 3).toString();
        txtGender.setText(gender);
        
    }//GEN-LAST:event_tabelDataMouseClicked

    private void txtNikKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNikKeyTyped
        if (Character.isAlphabetic(evt.getKeyChar())){
            evt.consume();
            if((txtNik.getText().length()) >= 13){
                JOptionPane.showMessageDialog(null, "Panjang NIK Melewati Batas");
                kosong_kolom();
            }
        } else {
        }
    }//GEN-LAST:event_txtNikKeyTyped

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butHapus;
    private javax.swing.JButton butKembali;
    private javax.swing.JButton butTambah;
    private javax.swing.JButton butUbah;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtLahir;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNik;
    // End of variables declaration//GEN-END:variables
}
