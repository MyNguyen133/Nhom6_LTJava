/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DAOhd;
import Controller.DAOsp;
import Controller.DAOspct;
import Model.Hoadon;
import Model.Sanpham;
import Model.SanphamCT;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class Capnhatdonhang extends javax.swing.JFrame {

    /**
     * Creates new form QLsanpham
     */
    private List<Hoadon> hoadon;
    private List<Sanpham> sanpham;
    private List<SanphamCT> sanphamct;
    
    private DefaultTableModel ModelHD;
    private DefaultTableModel ModelSP;
    private DefaultTableModel ModelSPCT;
    int SelectedIndex;
    public Capnhatdonhang() {
        initComponents();
        ModelHD=(DefaultTableModel) tableHD.getModel();
        ModelSP=(DefaultTableModel) tableSP.getModel();
        ModelSPCT=(DefaultTableModel) tableCTSP.getModel();
        showTableHD();
        showTableSP();
        showTableSPCT();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtTenKh = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTensp = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMasp = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        ComboxLoai = new javax.swing.JComboBox<>();
        btnAddHD = new javax.swing.JButton();
        btnDeleteHD = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSP = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCTSP = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableHD = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnAddSP = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        btnXoasp = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Số điện thoại:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ngày đặt:");

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Tên khách hàng");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Địa chỉ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSDT)
                    .addComponent(txtTenKh, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDate)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên sản phẩm:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số lượng:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Mã sản phẩm:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Loại:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Giá:");

        ComboxLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sơ mi", "Quần", "Phụ kiện", "Áo" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(27, 27, 27)
                        .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(32, 32, 32)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(txtMasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboxLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAddHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddHD.setText("Thêm Sản Phẩm");
        btnAddHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddHDActionPerformed(evt);
            }
        });

        btnDeleteHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDeleteHD.setText("Xóa Hóa Đơn");
        btnDeleteHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteHDActionPerformed(evt);
            }
        });

        btnLuu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLuu.setText("Lưu Hóa Đơn");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        tableSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã sản phẩm", "Tên sản phẩm", "Loại", "Số lượng", "Giá"
            }
        ));
        tableSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSP);

        tableCTSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mã sản phẩm", "Số lượng", "Giá"
            }
        ));
        tableCTSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCTSPMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableCTSP);

        tableHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Tên khách hàng", "Địa chỉ", "Số điện thoại", "Ngày đặt", "Thành tiền"
            }
        ));
        tableHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableHD);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Bảng Sản Phẩm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Bảng Hóa Đơn");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Bảng Chi Tiết Sản Phẩm Bán");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("THOÁT");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnAddSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAddSP.setText("Thêm Số Lượng Sản Phẩm Bán");
        btnAddSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSPActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("QUẢN LÝ HÓA ĐƠN");

        btnXoasp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoasp.setText("Xóa Sản Phẩm");
        btnXoasp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaspActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAddHD)
                                .addGap(37, 37, 37)
                                .addComponent(btnXoasp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddSP)
                                .addGap(63, 63, 63)
                                .addComponent(btnLuu)
                                .addGap(36, 36, 36)
                                .addComponent(btnDeleteHD)
                                .addGap(86, 86, 86)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddSP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddHD)
                            .addComponent(btnDeleteHD)
                            .addComponent(btnLuu)
                            .addComponent(btnXoasp))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.dispose();
            Home home= new Home();
            home.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tableSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSPMouseClicked
         SelectedIndex= tableSP.getSelectedRow();
         Sanpham sp= sanpham.get(SelectedIndex);
         txtMasp.setText(sp.getMasp());
         txtTensp.setText(sp.getTensp());
         ComboxLoai.setSelectedItem(sp.getLoai());
         txtGia.setText(sp.getGia()+"");
         
         
    }//GEN-LAST:event_tableSPMouseClicked

    //Thêm sản phẩm
    private void btnAddHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddHDActionPerformed
        Sanpham nv=new Sanpham();
        //Không được để trống
         if (txtMasp.getText().isEmpty() || txtTensp.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin sản phẩm!");
        return;
        }
        
        nv.setMasp(txtMasp.getText());
        //Kiểm tra nhân viên đã tồn tại hay chưa
        if(new DAOsp().isMaNVExist(nv.getMasp())) {
            JOptionPane.showMessageDialog(this, "Mã sản phẩm đã tồn tại!");
            return; 
        }
        nv.setLoai(ComboxLoai.getSelectedItem().toString());
        nv.setTensp(txtTensp.getText());       
        boolean isOK= true;
        try{
            nv.setSoluong(Integer.parseInt(txtSoluong.getText()));
            nv.setGia(Integer.parseInt(txtGia.getText()));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Là số không phải kí tự");
        }
        if(isOK){
            new DAOsp().AddSP(nv);
            showTableSP();
            JOptionPane.showMessageDialog(this,"Thêm thành công");
        }
    }//GEN-LAST:event_btnAddHDActionPerformed

    //Thêm chi tiết bán
    private void btnAddSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSPActionPerformed
        String Masp = txtMasp.getText();
        String soluongText = txtSoluong.getText();
        String giaText = txtGia.getText();

        if (Masp.isEmpty() || soluongText.isEmpty() || giaText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin sản phẩm!");
            return;
        }

        int soluong;
        int Gia;
        int gia;

        try {
            soluong = Integer.parseInt(soluongText);
            Gia = Integer.parseInt(giaText);
            gia = Gia * soluong;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng hoặc giá không hợp lệ!");
            return;
    }

    SanphamCT sp = new SanphamCT(Masp, soluong, gia);
    new DAOspct().AddSPCT(sp);        
    showTableSPCT();
        
    }//GEN-LAST:event_btnAddSPActionPerformed

    //Xóa chi tiết bán
    private void tableCTSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCTSPMouseClicked
        SelectedIndex= tableCTSP.getSelectedRow();
        int option= JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa!");
        if (option == JOptionPane.YES_OPTION) {
         SanphamCT sp= sanphamct.get(SelectedIndex);
         new DAOspct().DeleteSPCT(sp.getId());
         showTableSPCT();
        }
    }//GEN-LAST:event_tableCTSPMouseClicked

    //Thêm hóa đơn
    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        String DateOrder= "";
        int gia=0;
        for(int i=0; i< tableCTSP.getRowCount(); i++){
            gia+=Integer.parseInt( tableCTSP.getValueAt(i,3).toString());
        }
        DateOrder=txtDate.getText();
        String Tenkh= txtTenKh.getText();
        String Diachi= txtAddress.getText();
        String SDT= txtSDT.getText();
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date orderDate = dateFormat.parse(DateOrder);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Định dạng ngày tháng không hợp lệ! (dd/MM/yyyy)");
            return;
        }
        if (DateOrder.isEmpty() || Tenkh.isEmpty() || Diachi.isEmpty()|| SDT.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách hàng!");
            return;
        }

        Hoadon hd=new Hoadon(Tenkh,Diachi,SDT, DateOrder,gia);
            new DAOhd().AddHD(hd);
            showTableHD();
            JOptionPane.showConfirmDialog(this, "Thêm hóa đơn thành công!");
    }//GEN-LAST:event_btnLuuActionPerformed

    //Xóa hóa đơn
    private void btnDeleteHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteHDActionPerformed
        int selectedIndex = tableHD.getSelectedRow();
        if (selectedIndex == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn một hóa đơn để xóa!");
            return;
        }

        int option = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa hóa đơn này?");
        if (option == JOptionPane.YES_OPTION) {
            Hoadon hd = hoadon.get(selectedIndex);
            new DAOhd().DeleteHD(hd.getMaHD());
            hoadon.remove(selectedIndex); // Xóa hóa đơn khỏi danh sách
            showTableHD();
        }

    }//GEN-LAST:event_btnDeleteHDActionPerformed

    private void btnXoaspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaspActionPerformed
        int selectedIndex = tableSP.getSelectedRow();
    if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Vui lòng chọn một sản phẩm để xóa!");
        return;
    }

    int option = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa sản phẩm này?");
    if (option == JOptionPane.YES_OPTION) {
        Sanpham sp = sanpham.get(selectedIndex);
        new DAOsp().DeleteSP(sp.getId());
        sanpham.remove(selectedIndex); // Xóa sản phẩm khỏi danh sách
        showTableSP();
    }
    }//GEN-LAST:event_btnXoaspActionPerformed

    private void tableHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHDMouseClicked
        SelectedIndex= tableHD.getSelectedRow();
        Hoadon nv= hoadon.get(SelectedIndex);
        txtTenKh.setText(nv.getTenKH());
        txtDate.setText(nv.getDateOrder()); 
        txtAddress.setText(nv.getDiaChi());
        txtSDT.setText(nv.getSDT());

    }//GEN-LAST:event_tableHDMouseClicked

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
            java.util.logging.Logger.getLogger(Capnhatdonhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Capnhatdonhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Capnhatdonhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Capnhatdonhang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Capnhatdonhang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboxLoai;
    private javax.swing.JButton btnAddHD;
    private javax.swing.JButton btnAddSP;
    private javax.swing.JButton btnDeleteHD;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoasp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tableCTSP;
    private javax.swing.JTable tableHD;
    private javax.swing.JTable tableSP;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMasp;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenKh;
    private javax.swing.JTextField txtTensp;
    // End of variables declaration//GEN-END:variables

    private void showTableHD() {
        hoadon= new DAOhd().getListHD();
        ModelHD.setRowCount(0);
        for(Hoadon hd:hoadon){
            ModelHD.addRow(new Object[]{
            tableHD.getRowCount()+1,hd.getTenKH(),hd.getDiaChi(), hd.getSDT(), hd.getDateOrder(), hd.getThanhtien()
            });
        }
        
    }

    private void showTableSP() {
        sanpham= new DAOsp().getListSP();
        ModelSP.setRowCount(0);
        for(Sanpham hd:sanpham){
            ModelSP.addRow(new Object[]{
            tableSP.getRowCount()+1, hd.getMasp(), hd.getTensp(), hd.getLoai(),hd.getSoluong(),hd.getGia()
            });
        }
    }

    private void showTableSPCT() {
        sanphamct= new DAOspct().getListSPCT();
        ModelSPCT.setRowCount(0);
        for(SanphamCT hd:sanphamct){
            ModelSPCT.addRow(new Object[]{
            tableCTSP.getRowCount()+1, hd.getMasp(), hd.getSoluong(),hd.getGia()
            });
        }
    }
}
