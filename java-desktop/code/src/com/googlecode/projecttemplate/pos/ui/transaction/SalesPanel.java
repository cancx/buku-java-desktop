/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SalesPanel.java
 *
 * Created on Nov 7, 2010, 7:21:25 AM
 */

package com.googlecode.projecttemplate.pos.ui.transaction;

import com.googlecode.projecttemplate.pos.Main;
import com.googlecode.projecttemplate.pos.model.Product;
import com.googlecode.projecttemplate.pos.model.Sales;
import com.googlecode.projecttemplate.pos.model.SalesDetail;
import com.googlecode.projecttemplate.pos.util.TextComponentUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author ifnu
 */
public class SalesPanel extends javax.swing.JInternalFrame {

    private Sales sales;
    private List<SalesDetail> salesDetails = new ArrayList<SalesDetail>();
    private static Logger log = Logger.getLogger(SalesPanel.class);

    /** Creates new form SalesPanel */
    public SalesPanel() {
        initComponents();
        tblSalesDetail.setAutoCreateColumnsFromModel(false);
        jdcTransaction.setDate(new Date());
        enableForm(false);
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalesDetail = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtProductId = new javax.swing.JTextField();
        btnLookupProduct = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jdcTransaction = new com.toedter.calendar.JDateChooser();
        lblTotal = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Penjualan");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnudoor.png"))); // NOI18N
        btnExit.setText("Keluar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnuCancel.png"))); // NOI18N
        btnCancel.setText("Batal");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnuSave.png"))); // NOI18N
        btnSave.setText("Simpan");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnudelete.png"))); // NOI18N
        btnDelete.setText("Hapus");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnuManuaEdit.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnuNew.png"))); // NOI18N
        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mnuFind.png"))); // NOI18N
        btnSearch.setText("Cari");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblSalesDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Barang", "Nama Barang", "Harga Satuan", "Kuantitas", "Sub Total"
            }
        ));
        tblSalesDetail.setCellSelectionEnabled(true);
        jScrollPane1.setViewportView(tblSalesDetail);

        jLabel1.setText("Kode Barang");

        txtProductId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductIdActionPerformed(evt);
            }
        });

        btnLookupProduct.setText("...");
        btnLookupProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLookupProductActionPerformed(evt);
            }
        });

        jLabel2.setText("ID Transaksi");

        jLabel3.setText("Tanggal");

        txtId.setEnabled(false);

        jdcTransaction.setEnabled(false);

        lblTotal.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        lblTotal.setText("Rp. 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExit)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLookupProduct))
                            .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jdcTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit, btnExit, btnSave, btnSearch});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(btnCancel)
                    .addComponent(btnEdit)
                    .addComponent(btnSearch)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdcTransaction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLookupProduct)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnCancel, btnDelete, btnEdit, btnExit, btnSave, btnSearch});

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void clearForm(){
    txtProductId.setText("");
    lblTotal.setText("Rp. 0");
    jdcTransaction.setDate(new Date());
    salesDetails = new ArrayList<SalesDetail>();
    sales = null;
    tblSalesDetail.setModel(new SalesDetailTableModel(salesDetails));
}

private void enableForm(boolean status){
    txtProductId.setEnabled(status);
    btnLookupProduct.setEnabled(status);
    tblSalesDetail.setEnabled(status);
}

private boolean validateForm(){
    if(salesDetails==null || salesDetails.isEmpty()){
        JOptionPane.showMessageDialog(this, "Transaksi tidak boleh kosong!"
                ,"Error",JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}

private void loadFormToModel(){
    sales.setSalesDetails(salesDetails);
    sales.setSalesDate(new Date());
    BigDecimal total = BigDecimal.ZERO;
    for (SalesDetail salesDetail : salesDetails) {
        total = total.add(salesDetail.getSubtotal());
        salesDetail.setSales(sales);
    }
    sales.setTotalSales(total);
}

private void loadModelToForm(){
    salesDetails = sales.getSalesDetails();
    tblSalesDetail.setModel(new SalesDetailTableModel(salesDetails));
    lblTotal.setText(TextComponentUtils.formatNumber(sales.getTotalSales()));
}

private void refreshTable(){
    tblSalesDetail.setModel(new SalesDetailTableModel(salesDetails));
}

private void refreshTotalLabel(){
    if(salesDetails!=null && !salesDetails.isEmpty()){
        BigDecimal total = BigDecimal.ZERO;
        for (SalesDetail salesDetail : salesDetails) {
            total = total.add(salesDetail.getSubtotal());
        }
        lblTotal.setText("Rp. " + TextComponentUtils.formatNumber(total));
    }
}

private void addSalesDetail(Product p){
    if(p!=null){
        SalesDetail salesDetail = new SalesDetail();
        salesDetail.setProduct(p);
        salesDetail.setPrice(p.getPrice());
        salesDetail.setQuantity(1);
        if(salesDetail.getSubtotal() != null){
            salesDetail.setSubtotal(salesDetail.getSubtotal().add(p.getPrice()));
        } else {
            salesDetail.setSubtotal(p.getPrice());
        }
        salesDetails.add(salesDetail);
        refreshTable();
        refreshTotalLabel();
    } else {
        JOptionPane.showMessageDialog(this, "Barang tidak ada!"
            ,"Error",JOptionPane.ERROR_MESSAGE);
    }
}

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        Main.getFrame().salesPanel = null;
        dispose();
}//GEN-LAST:event_btnExitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearForm();
        enableForm(false);
        //pengaturan tombol
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(true);
        btnCancel.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);
}//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(validateForm()){
            if(sales == null){
                sales = new Sales();
            }
            loadFormToModel();
            try{
                Main.getSalesService().save(sales);
                clearForm();
                refreshTable();
                enableForm(false);
                //pengaturan tombol
                btnDelete.setEnabled(false);
                btnAdd.setEnabled(true);
                btnCancel.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
            } catch(Exception ex){
                log.error(ex);
                JOptionPane.showMessageDialog(this, "Data gagal disimpan!"
                        ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(sales!=null){
            try{
                Main.getSalesService().delete(sales);
                clearForm();
                sales = null;
                refreshTable();
                enableForm(false);
                //pengaturan tombol
                btnDelete.setEnabled(false);
                btnAdd.setEnabled(true);
                btnCancel.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
            } catch(Exception ex){
                log.error(ex);
                JOptionPane.showMessageDialog(this, "Data masih digunakan tidak bisa dihapus!"
                        ,"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
}//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if(sales!=null){
            enableForm(true);
            btnDelete.setEnabled(false);
            btnAdd.setEnabled(false);
            btnCancel.setEnabled(true);
            btnEdit.setEnabled(false);
            btnSave.setEnabled(true);
        }
}//GEN-LAST:event_btnEditActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        clearForm();
        enableForm(true);
        //pengaturan tombol
        btnDelete.setEnabled(false);
        btnAdd.setEnabled(false);
        btnCancel.setEnabled(true);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(true);
}//GEN-LAST:event_btnAddActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Sales s = new SalesLookupDialog().getSales();
        if(s!=null){
            sales = Main.getSalesService().getSales(s.getId());
            loadModelToForm();
            //edit mode
            btnDelete.setEnabled(true);
            btnAdd.setEnabled(false);
            btnCancel.setEnabled(true);
            btnEdit.setEnabled(true);
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtProductIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductIdActionPerformed
        String productId = txtProductId.getText();
        try {
            //cari apakah barang sudah ada di dalam tblSalesDetail
            Long pId = Long.valueOf(productId);
            boolean isProductInSalesDetails = false;
            for (SalesDetail salesDetail : salesDetails) {
                if(salesDetail.getProduct().getId().equals(pId)){
                    salesDetail.setQuantity(salesDetail.getQuantity() + 1);
                    salesDetail.setSubtotal(
                        salesDetail.getPrice().multiply(
                            new BigDecimal(salesDetail.getQuantity())));
                    isProductInSalesDetails = true;
                    break;
                }
            }
            if(isProductInSalesDetails){
                refreshTable();
                refreshTotalLabel();
            } else {
                Product p = Main.getProductService().getProduct(pId);
                if(p!=null){
                    addSalesDetail(p);
                }
            }
            txtProductId.setText("");
        } catch (NumberFormatException numberFormatException) {
            JOptionPane.showMessageDialog(this, "Id barang harus berupa angka!"
                    ,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtProductIdActionPerformed


    private void btnLookupProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLookupProductActionPerformed
        Product p = new ProductLookupDialog().getProduct();
        if(p!=null){
            boolean isProductInSalesDetails = false;
            for (SalesDetail salesDetail : salesDetails) {
                if(salesDetail.getProduct().getId().equals(p.getId())){
                    salesDetail.setQuantity(salesDetail.getQuantity() + 1);
                    salesDetail.setSubtotal(
                        salesDetail.getPrice().multiply(
                            new BigDecimal(salesDetail.getQuantity())));
                    isProductInSalesDetails = true;
                    break;
                }
            }
            if(isProductInSalesDetails){
                refreshTable();
                refreshTotalLabel();
            } else {
                addSalesDetail(p);
            }
        }
    }//GEN-LAST:event_btnLookupProductActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        Main.getFrame().salesPanel = null;
    }//GEN-LAST:event_formInternalFrameClosing

private class SalesDetailTableModel extends AbstractTableModel{

    private List<SalesDetail> salesDetails;

    SalesDetailTableModel(List<SalesDetail> salesDetails) {
        this.salesDetails = salesDetails;
    }

    public int getRowCount() {
        return salesDetails.size();
    }

    public int getColumnCount() {
        return 5;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        SalesDetail s = salesDetails.get(rowIndex);
        switch(columnIndex){
            case 0: return s.getProduct().getId();
            case 1: return s.getProduct().getName();
            case 2: return s.getPrice();
            case 3: return s.getQuantity();
            case 4: return s.getSubtotal();
            default: return "";
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if(columnIndex == 2 || columnIndex == 4){
            return BigDecimal.class;
        } else if(columnIndex == 3){
            return Integer.class;
        }
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 3) {
            return true;
        }
        return false;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        SalesDetail s = salesDetails.get(rowIndex);
        if(columnIndex == 3){
            s.setQuantity((Integer) aValue);
            s.setSubtotal(s.getPrice().multiply(
                    new BigDecimal(s.getQuantity())));
            refreshTotalLabel();
        }
    }

}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLookupProduct;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcTransaction;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tblSalesDetail;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtProductId;
    // End of variables declaration//GEN-END:variables

}
