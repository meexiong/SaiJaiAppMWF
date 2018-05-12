
package Forms;

import javax.swing.JFrame;



public class frmMain extends javax.swing.JFrame {
    public frmMain() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
        System.err.println(this.getClass().getSimpleName());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTaskPane1 = new com.l2fprod.common.swing.JTaskPane();
        jLabel1 = new javax.swing.JLabel();
        jTaskPaneGroup1 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuSale = new com.xzq.osc.JocHyperlink();
        btnMenuSearchSale = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup2 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuProduct = new com.xzq.osc.JocHyperlink();
        btnMenuCategory = new com.xzq.osc.JocHyperlink();
        btnMenuUnit = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup3 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuEmployee = new com.xzq.osc.JocHyperlink();
        btnMenuPosition = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup4 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuRptEmp = new com.xzq.osc.JocHyperlink();
        btnMenuRptProduct = new com.xzq.osc.JocHyperlink();
        btnMenuRptSaleByDate = new com.xzq.osc.JocHyperlink();
        btnMenuSaleDuring = new com.xzq.osc.JocHyperlink();
        btnMenuSaleByEmp = new com.xzq.osc.JocHyperlink();
        jTaskPaneGroup5 = new com.l2fprod.common.swing.JTaskPaneGroup();
        btnMenuUser = new com.xzq.osc.JocHyperlink();
        btnMenuHelp = new com.xzq.osc.JocHyperlink();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Saysettha OT", 0, 14)); // NOI18N
        jLabel1.setText("ຮ້ານຂາຍເຄື່ອງໃສ່ໃຈ          ");
        jTaskPane1.add(jLabel1);

        jTaskPaneGroup1.setTitle("ການຂາຍ");
        jTaskPaneGroup1.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnMenuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/13 di sieu thi.png"))); // NOI18N
        btnMenuSale.setText("ຂາຍ");
        btnMenuSale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuSale.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSaleActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(btnMenuSale);

        btnMenuSearchSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/sa-icon-big.png"))); // NOI18N
        btnMenuSearchSale.setText("ຄົ້ນຫາການຂາຍ");
        btnMenuSearchSale.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuSearchSale.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuSearchSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuSearchSaleActionPerformed(evt);
            }
        });
        jTaskPaneGroup1.getContentPane().add(btnMenuSearchSale);

        jTaskPane1.add(jTaskPaneGroup1);

        jTaskPaneGroup2.setTitle("ຂໍ້ມູນສີນຄ້າ");
        jTaskPaneGroup2.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnMenuProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus-blue.png"))); // NOI18N
        btnMenuProduct.setText("ລາຍການສິນຄ້າ");
        btnMenuProduct.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuProductActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnMenuProduct);

        btnMenuCategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Cube.png"))); // NOI18N
        btnMenuCategory.setText("ປະເພດສິນຄ້າ");
        btnMenuCategory.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuCategory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCategoryActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnMenuCategory);

        btnMenuUnit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Martz90-Circle-Addon2-Group.png"))); // NOI18N
        btnMenuUnit.setText("ຫົວໜ່ວຍ");
        btnMenuUnit.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuUnit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuUnitActionPerformed(evt);
            }
        });
        jTaskPaneGroup2.getContentPane().add(btnMenuUnit);

        jTaskPane1.add(jTaskPaneGroup2);

        jTaskPaneGroup3.setTitle("ຂໍ້ມູນພະນັກງານ");
        jTaskPaneGroup3.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnMenuEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/employee.png"))); // NOI18N
        btnMenuEmployee.setText("ພະນັກງານ");
        btnMenuEmployee.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuEmployeeActionPerformed(evt);
            }
        });
        jTaskPaneGroup3.getContentPane().add(btnMenuEmployee);

        btnMenuPosition.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Organization.png"))); // NOI18N
        btnMenuPosition.setText("ຕຳແໜ່ງ");
        btnMenuPosition.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuPosition.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMenuPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPositionActionPerformed(evt);
            }
        });
        jTaskPaneGroup3.getContentPane().add(btnMenuPosition);

        jTaskPane1.add(jTaskPaneGroup3);

        jTaskPaneGroup4.setExpanded(false);
        jTaskPaneGroup4.setTitle("ລາຍງານ");
        jTaskPaneGroup4.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnMenuRptEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/medial-report-icon.png"))); // NOI18N
        btnMenuRptEmp.setText("ພະນັກງານ");
        btnMenuRptEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuRptEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(btnMenuRptEmp);

        btnMenuRptProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/medial-report-icon.png"))); // NOI18N
        btnMenuRptProduct.setText("ສິນຄ້າ");
        btnMenuRptProduct.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuRptProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(btnMenuRptProduct);

        btnMenuRptSaleByDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/medial-report-icon.png"))); // NOI18N
        btnMenuRptSaleByDate.setText("ການຂາຍຕາມວັນທີ່");
        btnMenuRptSaleByDate.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuRptSaleByDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(btnMenuRptSaleByDate);

        btnMenuSaleDuring.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/medial-report-icon.png"))); // NOI18N
        btnMenuSaleDuring.setText("ການຂາຍຕາມຊ່ວງໄລຍະ");
        btnMenuSaleDuring.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuSaleDuring.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(btnMenuSaleDuring);

        btnMenuSaleByEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/medial-report-icon.png"))); // NOI18N
        btnMenuSaleByEmp.setText("ການຂາຍຕາມພະນັກງານ");
        btnMenuSaleByEmp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuSaleByEmp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup4.getContentPane().add(btnMenuSaleByEmp);

        jTaskPane1.add(jTaskPaneGroup4);

        jTaskPaneGroup5.setExpanded(false);
        jTaskPaneGroup5.setTitle("ຕັ້ງຄ່າ");
        jTaskPaneGroup5.setFont(new java.awt.Font("Saysettha OT", 1, 14)); // NOI18N

        btnMenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icon-multi_users-blue.png"))); // NOI18N
        btnMenuUser.setText("ຜູ້ໃຊ້ລະບົບ");
        btnMenuUser.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(btnMenuUser);

        btnMenuHelp.setText("ຊ່ວຍເຫຼືອ");
        btnMenuHelp.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        btnMenuHelp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jTaskPaneGroup5.getContentPane().add(btnMenuHelp);

        jTaskPane1.add(jTaskPaneGroup5);

        jPanel1.add(jTaskPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 3));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
        );

        jPanel2.add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuEmployeeActionPerformed
        frmEmployeeList frmEmpListObject = new frmEmployeeList();
        jDesktopPane1.add(frmEmpListObject);
        frmEmpListObject.setVisible(true);
    }//GEN-LAST:event_btnMenuEmployeeActionPerformed

    private void btnMenuUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuUnitActionPerformed
        frmUnit f = new frmUnit();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnMenuUnitActionPerformed

    private void btnMenuCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCategoryActionPerformed
        frmCategory f = new frmCategory();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnMenuCategoryActionPerformed

    private void btnMenuProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuProductActionPerformed
        frmProduct f = new frmProduct();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnMenuProductActionPerformed

    private void btnMenuPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPositionActionPerformed
        frmPosition f = new frmPosition();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnMenuPositionActionPerformed

    private void btnMenuSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSaleActionPerformed
        frmSale f = new frmSale();
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnMenuSaleActionPerformed

    private void btnMenuSearchSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuSearchSaleActionPerformed

    }//GEN-LAST:event_btnMenuSearchSaleActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.xzq.osc.JocHyperlink btnMenuCategory;
    private com.xzq.osc.JocHyperlink btnMenuEmployee;
    private com.xzq.osc.JocHyperlink btnMenuHelp;
    private com.xzq.osc.JocHyperlink btnMenuPosition;
    private com.xzq.osc.JocHyperlink btnMenuProduct;
    private com.xzq.osc.JocHyperlink btnMenuRptEmp;
    private com.xzq.osc.JocHyperlink btnMenuRptProduct;
    private com.xzq.osc.JocHyperlink btnMenuRptSaleByDate;
    private com.xzq.osc.JocHyperlink btnMenuSale;
    private com.xzq.osc.JocHyperlink btnMenuSaleByEmp;
    private com.xzq.osc.JocHyperlink btnMenuSaleDuring;
    private com.xzq.osc.JocHyperlink btnMenuSearchSale;
    private com.xzq.osc.JocHyperlink btnMenuUnit;
    private com.xzq.osc.JocHyperlink btnMenuUser;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.l2fprod.common.swing.JTaskPane jTaskPane1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup1;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup2;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup3;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup4;
    private com.l2fprod.common.swing.JTaskPaneGroup jTaskPaneGroup5;
    // End of variables declaration//GEN-END:variables
}
