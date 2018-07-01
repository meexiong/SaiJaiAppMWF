
package Forms;

import Conntroller.ConnectDB;
import Conntroller.GetMaxID;
import Conntroller.GlobalVariable;
import static Conntroller.GlobalVariable.productID;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class frmNewProduct extends javax.swing.JDialog {
    ArrayList<Integer> array_Cate = new ArrayList();
    ArrayList<Integer> array_Unit = new ArrayList();
    String path;
    FileInputStream fts;
    public frmNewProduct(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }
    private void showCategory(){
        try {
            Connection c =  ConnectDB.getConection();
            DefaultComboBoxModel model =  new DefaultComboBoxModel();
            array_Cate.clear(); 
            model.removeAllElements();
            String query = "Select CateID,CateName from Tbl_Categorys";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                array_Cate.add(rs.getInt("CateID"));
                model.addElement(rs.getString("CateName"));
            }
            cmb_Cate.setModel(model);
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void showUnit(){
        try {
            Connection c =  ConnectDB.getConection();
            DefaultComboBoxModel model =  new DefaultComboBoxModel();
            array_Unit.clear(); 
            model.removeAllElements();
            String query = "Select UnitID,UnitName from tbl_Units";
            ResultSet rs = c.createStatement().executeQuery(query);
            while(rs.next()){
                array_Unit.add(rs.getInt("UnitID"));
                model.addElement(rs.getString("UnitName"));
            }
            cmb_Unit.setModel(model);
            rs.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void showData(){
        try {
            Connection c= ConnectDB.getConection();
            String sql="Select p.ProductName, c.CateName, p.Price, p.Qty, u.UnitName, p.Total from tbl_Products p inner join tbl_Categorys c on p.CateID= c.CateID"
                    + " inner join tbl_Units u on p.UnitID = u.UnitID where p.ProductID = '"+txtProductID1.getText().trim()+"'";
            ResultSet rs = c.createStatement().executeQuery(sql);
            if(rs.next()){
                txtProductName1.setText(rs.getString(1));
                cmb_Cate.setSelectedItem(rs.getString(2));
                txtPrice.setText(String.valueOf(String.format("%,.0f",rs.getDouble(3))));
                txtQty.setText(String.valueOf(String.format("%d",rs.getInt(4))));
                cmb_Unit.setSelectedItem(rs.getString(5));
                txtTotalPrice.setText(String.valueOf(String.format("%,.0f", rs.getDouble(6))));
            }
        } catch (Exception e) {
        }
    }
    private BufferedImage ResizeScall(Image img, int w, int h){
        BufferedImage ims = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
        Graphics2D g = ims.createGraphics();
        g.drawImage(img,0,0,w,h,null);
        g.dispose();
        return ims;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtProductID1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtProductName1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTotalPrice = new javax.swing.JTextField();
        cmb_Cate = new javax.swing.JComboBox<>();
        cmb_Unit = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        cmb_Currency = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New Product");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        btnSave.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnSave.setText("ບັນທຶກ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel4.add(btnSave);

        btnDelete.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnDelete.setText("ຍົກເລີກ");
        jPanel4.add(btnDelete);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));

        jLabel3.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel3.setText("ລະຫັດສິນຄ້າ");

        txtProductID1.setEditable(false);
        txtProductID1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtProductID1.setText("New");

        jLabel4.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel4.setText("ຊື່ສິນຄ້າ");

        txtProductName1.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtProductName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProductName1KeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel5.setText("ປະເພດສິນຄ້າ");

        txtQty.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtQty.setText("0");
        txtQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQtyKeyReleased(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel6.setText("ລາຄາ");

        txtPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtPrice.setText("0");
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel7.setText("ຈຳນວນ");

        jLabel8.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel8.setText("ຫົວໜ່ວຍ");

        jLabel9.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel9.setText("ລາຄາລວມ");

        txtTotalPrice.setEditable(false);
        txtTotalPrice.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        txtTotalPrice.setText("0");

        cmb_Cate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        cmb_Unit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N

        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblImage.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setText("ຮູບພາບ");
        lblImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
        );

        cmb_Currency.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        cmb_Currency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ກີບ", "ບາດ", "ໂດລາ" }));

        jLabel10.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        jLabel10.setText("ສະກຸນເງິນ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_Currency, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Unit, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmb_Cate, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtProductID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtProductName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmb_Cate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(cmb_Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(cmb_Currency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.LINE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProductName1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProductName1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductName1KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        showCategory();
        showUnit();
        txtProductID1.setText(productID);
        if(!"New".equals(txtProductID1.getText().trim())){
            showData();
        }
    }//GEN-LAST:event_formWindowOpened

    private void lblImageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageMouseClicked
        try {
            if(evt.getClickCount()==2){
                lblImage.setText("");
                JFileChooser choose = new JFileChooser();
                choose.showOpenDialog(null);
                path=choose.getSelectedFile().getAbsolutePath();
                ImageIcon imic = new ImageIcon(path);
                Image img = imic.getImage();
                Image ic = ResizeScall(img,lblImage.getWidth(),lblImage.getHeight());
                lblImage.setIcon(new ImageIcon(ic));
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_lblImageMouseClicked

    private void txtQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQtyKeyReleased
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)||c==KeyEvent.VK_SPACE)) {
            evt.consume();
            txtQty.setText("0");
        }else {
            double p = Double.parseDouble(txtQty.getText().replace(",", ""));
            txtQty.setText(String.valueOf(String.format("%,.0f", p)));
            double price = Double.parseDouble(txtPrice.getText().replace(",", ""));
            int qty = Integer.parseInt(txtQty.getText());
            double Total = price * qty;
            txtTotalPrice.setText(String.valueOf(String.format("%,.2f", Total)));
        }
        
    }//GEN-LAST:event_txtQtyKeyReleased

    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c == KeyEvent.VK_BACK_SPACE)|| (c == KeyEvent.VK_DELETE)||c==KeyEvent.VK_SPACE)) {
            evt.consume();
            txtPrice.setText("0");
        }else{
            double p = Double.parseDouble(txtPrice.getText().replace(",", ""));
            txtPrice.setText(String.valueOf(String.format("%,.0f", p)));
        }

    }//GEN-LAST:event_txtPriceKeyReleased

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed

    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            Connection c = ConnectDB.getConection();
            int cateIndex = cmb_Cate.getSelectedIndex();
            int unitIndex = cmb_Unit.getSelectedIndex();
            if (txtProductID1.getText().equals("New")) {
                String insert = "Insert into tbl_Products(ProductID,ProductName,CateID,Price,Qty,UnitID,Total,Images,Currency)"
                        + "values(?,?,?,?,?,?,?,?,?)";
                GetMaxID gm = new GetMaxID();
                String productID = gm.autoMaxID("tbl_Products", "ProductID", "P");
                PreparedStatement p = c.prepareStatement(insert);
                p.setString(1, productID);
                p.setString(2, txtProductName1.getText().trim());
                p.setInt(3, array_Cate.get(cateIndex));
                p.setDouble(4, Double.parseDouble(txtPrice.getText().replace(",", "")));
                p.setFloat(5, Float.parseFloat(txtQty.getText().replace(",", "")));
                p.setInt(6, array_Unit.get(unitIndex));
                p.setDouble(7, Double.parseDouble(txtTotalPrice.getText().replace(",", "")));
                if (path == null) {
                    p.setNull(8, java.sql.Types.BLOB);
                } else {
                    File ff = new File(path);
                    FileInputStream fst = new FileInputStream(ff);
                    int len = (int) ff.length();
                    p.setBinaryStream(8, fst, len);
                }
                p.setString(9, cmb_Currency.getSelectedItem().toString());
                p.executeUpdate();
                p.close();
            } else {
                String update ="Update tbl_Products set ProductName=?, CateID=?,Price=?, qty=?, UnitID=?"
                        + ", Total=?,Currency=? where ProductID=?";
                PreparedStatement p = c.prepareStatement(update);
                p.setString(1, txtProductName1.getText().trim());
                p.setInt(2, array_Cate.get(cateIndex));
                p.setDouble(3, Double.parseDouble(txtPrice.getText().replace(",", "")));
                p.setFloat(4, Float.parseFloat(txtQty.getText().replace(",", "")));
                p.setInt(5, array_Unit.get(unitIndex));
                p.setDouble(6, Double.parseDouble(txtTotalPrice.getText().replace(",", "")));
                p.setString(7, cmb_Currency.getSelectedItem().toString());
                p.setString(8, txtProductID1.getText().trim());
                if(p.executeUpdate() != -1) {
                    String updateImage = "update tbl_Products set Images=? where ProductID=?";
                    PreparedStatement p1 = c.prepareStatement(updateImage);
                    if (path != null) {
                        File ff = new File(path);
                        FileInputStream fst = new FileInputStream(ff);
                        int len = (int) ff.length();
                        p1.setBinaryStream(1, fst, len);
                        p1.setString(2, txtProductID1.getText().trim());
                        p1.executeUpdate();
                        p1.close();
                    }
                }
                p.close();
            }
            c.close();
            dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

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
            java.util.logging.Logger.getLogger(frmNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNewProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmNewProduct dialog = new frmNewProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmb_Cate;
    private javax.swing.JComboBox<String> cmb_Currency;
    private javax.swing.JComboBox<String> cmb_Unit;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblImage;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProductID1;
    private javax.swing.JTextField txtProductName1;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtTotalPrice;
    // End of variables declaration//GEN-END:variables
}
