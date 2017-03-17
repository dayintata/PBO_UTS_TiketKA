/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiket.kai;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayinta-PC
 */
public class frmTiket extends javax.swing.JFrame {

    private String Nama, ID, Telp, Loket, Stsawal, Ststujuan, Tgl, Wkt, Jenis, Tempat, Harga;


    /**
     * Creates new form frmTiket
     */
    public frmTiket() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        stsawal = new javax.swing.JTextField();
        ststujuan = new javax.swing.JTextField();
        waktu = new javax.swing.JTextField();
        tmpduduk = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        tgl = new com.toedter.calendar.JDateChooser();
        jenis = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        save = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        print = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        notlp = new javax.swing.JTextField();
        lkt1 = new javax.swing.JRadioButton();
        lkt2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("PT. Kereta Api Indonesia");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 60, 290, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\MOKLET\\XI\\PBO\\LOGO PT KERETA API.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, -10, 110, 90);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Form Pemesanan Tiket Kereta Api");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(190, 20, 400, 30);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 800, 100);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INFO PERJALANAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel12.setText("Harga                    :");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(420, 80, 150, 20);

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel13.setText("Stasiun Awal         :");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(10, 30, 150, 20);

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel14.setText("Stasiun Tujuan      :");
        jPanel5.add(jLabel14);
        jLabel14.setBounds(10, 60, 140, 20);

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel15.setText("Tanggal Berangkat :");
        jPanel5.add(jLabel15);
        jLabel15.setBounds(10, 90, 150, 20);

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel16.setText("Waktu Berangkat   :");
        jPanel5.add(jLabel16);
        jLabel16.setBounds(10, 120, 150, 20);

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel17.setText("Jenis Kereta           :");
        jPanel5.add(jLabel17);
        jLabel17.setBounds(420, 20, 150, 20);

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel18.setText("Tempat Duduk       :");
        jPanel5.add(jLabel18);
        jLabel18.setBounds(420, 50, 150, 20);

        stsawal.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        stsawal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stsawalActionPerformed(evt);
            }
        });
        jPanel5.add(stsawal);
        stsawal.setBounds(160, 20, 160, 30);

        ststujuan.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        ststujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ststujuanActionPerformed(evt);
            }
        });
        jPanel5.add(ststujuan);
        ststujuan.setBounds(160, 50, 160, 30);

        waktu.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        waktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waktuActionPerformed(evt);
            }
        });
        jPanel5.add(waktu);
        waktu.setBounds(160, 110, 160, 30);

        tmpduduk.setEditable(false);
        tmpduduk.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        tmpduduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmpdudukActionPerformed(evt);
            }
        });
        jPanel5.add(tmpduduk);
        tmpduduk.setBounds(570, 50, 160, 30);

        harga.setEditable(false);
        harga.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        harga.setEnabled(false);
        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });
        jPanel5.add(harga);
        harga.setBounds(570, 80, 160, 30);
        jPanel5.add(tgl);
        tgl.setBounds(160, 80, 160, 30);

        jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Kereta--", "Bisnis", "Ekonomi", "Eksekutif" }));
        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });
        jPanel5.add(jenis);
        jenis.setBounds(570, 20, 160, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 220, 800, 150);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("TABEL INFO"), "RESULT PEMESANAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel7.setLayout(null);

        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama_Pemesan", "No_ID", "No_Telp", "Loket", "Sts_Awal", "Sts_Tujuan", "Tgl_Berangkat", "Wkt_Berangkat", "Jns_Kereta", "Tmp_Duduk", "Harga"
            }
        ));
        jScrollPane1.setViewportView(data);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(0, 70, 800, 130);

        save.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel7.add(save);
        save.setBounds(170, 30, 80, 27);

        clear.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel7.add(clear);
        clear.setBounds(350, 30, 80, 27);

        delete.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel7.add(delete);
        delete.setBounds(260, 30, 80, 27);

        print.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel7.add(print);
        print.setBounds(550, 30, 80, 27);

        refresh.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel7.add(refresh);
        refresh.setBounds(450, 30, 85, 27);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(0, 380, 800, 200);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATA PEMESAN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Maiandra GD", 1, 14))); // NOI18N
        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel9.setText("Nama Pemesan :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(20, 30, 120, 20);

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel10.setText("No ID              :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 60, 120, 20);

        nama.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaActionPerformed(evt);
            }
        });
        jPanel3.add(nama);
        nama.setBounds(140, 20, 160, 30);

        id.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel3.add(id);
        id.setBounds(140, 60, 160, 30);

        notlp.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        notlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notlpActionPerformed(evt);
            }
        });
        jPanel3.add(notlp);
        notlp.setBounds(570, 20, 160, 30);

        lkt1.setText("Loket 1");
        jPanel3.add(lkt1);
        lkt1.setBounds(580, 60, 70, 23);

        lkt2.setText("Loket 2");
        jPanel3.add(lkt2);
        lkt2.setBounds(690, 60, 70, 23);

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel11.setText("No Telp           :");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(440, 20, 120, 20);

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 14)); // NOI18N
        jLabel8.setText("Loket               :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(440, 60, 120, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 110, 800, 100);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 580);

        setSize(new java.awt.Dimension(814, 618));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void stsawalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stsawalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stsawalActionPerformed

    private void ststujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ststujuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ststujuanActionPerformed

    private void tmpdudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmpdudukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tmpdudukActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        if (jenis.getSelectedItem().equals("Bisnis"))
        {
            tmpduduk.setText("Gerbong 1-2");
            harga.setText("Rp.20.000,00");
        } else if (jenis.getSelectedItem().equals("Ekonomi"))
        {
            tmpduduk.setText("Gerbong 2-3");
            harga.setText("Rp.10.000,00");
        } else if (jenis.getSelectedItem().equals("Eksekutif"))
        {
            tmpduduk.setText("Gerbong 4-5");
            harga.setText("Rp.30.000,00");
        }
    }//GEN-LAST:event_jenisActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(tgl.getDate());
        String LKT = "";
            if (lkt1.isSelected()) {
                LKT = "Loket1";
            } else {
                LKT  = "Loket2";
            }
            String Jenis = "";
            if(jenis.getSelectedItem().equals("Bisnis"))
            {
                Jenis = "Bisnis";
            } else if (jenis.getSelectedItem().equals("Ekonomo"))
            {
                Jenis = "Ekonomi";
            } else if (jenis.getSelectedItem().equals("Eksekutif"))
            {
                Jenis = "Eksekutif";
            }
            if ("".equals(nama.getText()) || "".equals(id.getText()) ||
            "".equals(notlp.getText()) || LKT.equals("") || "".equals(stsawal.getText()) ||
            "".equals(ststujuan.getText()) || tanggal.equals("") ||
            "".equals(waktu.getText()) || Jenis.equals("") ||
            "".equals(tmpduduk.getText()) || "".equals(harga.getText())){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);

        } else {
            String SQL = "INSERT INTO tb_pesan (Nama_Pemesan,No_ID,No_Telp,Loket,Sts_Awal,Sts_Tujuan,Tgl_Berangkat,Wkt_Berangkat,Jns_Kereta,Tmp_Duduk,Harga)"
            + "VALUES('"+nama.getText()+"','"+id.getText()+"','"+notlp.getText()+"','"+LKT+"','"+stsawal.getText()+"','"+ststujuan.getText()+"','"+tanggal+"',"
            +"'"+waktu.getText()+"','"+Jenis+"','"+tmpduduk.getText()+"','"+harga.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }
            }
    }//GEN-LAST:event_saveActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        nama.setText("");
        id.setText("");
        notlp.setText("");
        stsawal.setText("");
        ststujuan.setText("");
        tgl.getDate();
        waktu.setText("");
        jenis.setSelectedItem("");
        tmpduduk.setText("");
        harga.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int baris = data.getSelectedRow();
        if (baris != -1) {
            String No_ID = data.getValueAt(baris, 1).toString();
            String SQL = "DELETE FROM tb_pesan WHERE No_ID='" + No_ID + "'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus!!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Data Gagal Dihapus ", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Silahkan Pilih Baris Untuk Dihapus", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        int baris = data.getSelectedRow();
        if (baris != -1) {
            String No_ID = data.getValueAt(baris, 1).toString();
            String SQL = "SELECT * FROM tb_pesan WHERE No_ID = '" + No_ID+ "'";
            ResultSet rs = KoneksiDB.executeQuery(SQL);
            try{
                while (rs.next()) {
                    Nama = rs.getString(1);
                    ID = rs.getString(2);
                    Telp = rs.getString(3);
                    Loket = "";
                        if ("Loket 1".equals(rs.getString(4))) {
                            Loket = "Loket 1";
                        } else {
                            Loket = "Loket 2";
                        }
                    Stsawal = rs.getString(5);
                    Ststujuan = rs.getString(6);
                    Tgl = rs.getString(7);
                    Wkt = rs.getString(8);
                    Jenis = rs.getString(9);
                    Tempat = rs.getString(10);
                    Harga = rs.getString(11);
                }
            } catch (SQLException ex) {
                Logger.getLogger(frmTiket.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            JOptionPane.showConfirmDialog(null, "Nama Pemesan : " +Nama+ "\n"
                                                + "No ID : " +ID+ "\n"
                                                + "No Telp : " +Telp+ "\n"
                                                + "Loket : " +Loket+ "\n"
                                                + "Stasiun Awal : " +Stsawal+ "\n"
                                                + "Stasiun Tujuan : " +Ststujuan+ "\n"
                                                + "Tanggal Berangkat : " +Tgl+ "\n"
                                                + "Waktu Berangkat : " +Wkt+ "\n"
                                                + "Jenis Kereta: " +Jenis+ "\n"
                                                + "Tempat Duduk: " +Tempat+ "\n"
                                                + "Harga: " +Harga+ "\n", "Rekap Tiket", JOptionPane.DEFAULT_OPTION);
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris Untuk Dilihat :)", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_printActionPerformed

    private void notlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notlpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notlpActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        selectData();
    }//GEN-LAST:event_refreshActionPerformed

    private void waktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_waktuActionPerformed

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
            java.util.logging.Logger.getLogger(frmTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JTable data;
    private javax.swing.JButton delete;
    private javax.swing.JTextField harga;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis;
    private javax.swing.JRadioButton lkt1;
    private javax.swing.JRadioButton lkt2;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField notlp;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private javax.swing.JTextField stsawal;
    private javax.swing.JTextField ststujuan;
    private com.toedter.calendar.JDateChooser tgl;
    private javax.swing.JTextField tmpduduk;
    private javax.swing.JTextField waktu;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom [] = {"Nama_Pemesan","No_ID","No_Telp","Loket","Sts_Awal","Sts_Tujuan","Tgl_Berangkat","Wkt_Berangkat","Jns_Kereta","Tmp_Duduk","Harga"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);   
        String SQL = "SELECT * FROM tb_pesan";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try {
            while(rs.next()) {
                String Nama_Pemesan = rs.getString(1);
                String No_ID = rs.getString(2);
                String No_Telp = rs.getString(3);
                String Loket = "";
                if ("Loket 1".equals(rs.getString(4))) {
                    Loket = "Loket 1";
                } else {
                    Loket = "Loket 2";
                }
                String Sts_Awal = rs.getString(5);
                String Sts_Tujuan = rs.getString(6);
                String Tgl_Berangkat = rs.getString(7);
                String Wkt_Berangkat = rs.getString(8);
                String Jns_Kereta = rs.getString(9);
                String Tmp_Duduk = rs.getString(10);
                String Harga = rs.getString(11);
                String data[] = {Nama_Pemesan,No_ID,No_Telp,Loket,Sts_Awal,Sts_Tujuan,Tgl_Berangkat,Wkt_Berangkat,Jns_Kereta,Tmp_Duduk,Harga};
                dtm.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(frmTiket.class.getName()).log(Level.SEVERE, null, ex);
        }
        data.setModel(dtm);
    }
    
    
}
