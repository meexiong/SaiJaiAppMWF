/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conntroller;

import Forms.frmReport;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JDialog;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Programming
 */
public class DisplayReport {
    public void myReport(String rptName,String paraName, String paraVal, JDialog jd){
        try {
            Connection c = ConnectDB.getConection();
            HashMap map = new HashMap();
            map.put(paraName, paraVal);
            JasperPrint jp = JasperFillManager.fillReport("src/report/"+rptName+".jasper",map,c);
            frmReport frm = new frmReport();
            frm.jPanel1.hide();
            frm.setTitle("Print Bill");
            frm.getContentPane().add(new JRViewer(jp));
            jd.dispose();
            frm.setVisible(true);
        } catch (Exception e) {
        }
    }
    public void myReport(String rptName){
        try {
            Connection c = ConnectDB.getConection();
            JasperPrint jp = JasperFillManager.fillReport("src/report/"+rptName+".jasper",null,c);
            frmReport frm = new frmReport();
            frm.jPanel1.hide();
            frm.setTitle("Report");
            frm.getContentPane().add(new JRViewer(jp));
            frm.setVisible(true);
        } catch (Exception e) {
        }
    }
    public void myReport(String rptName, String parName, String date){
        try {
            Connection c = ConnectDB.getConection();
            HashMap map = new HashMap();
            map.put(parName, date);
            JasperPrint jp = JasperFillManager.fillReport("src/report/"+rptName+".jasper",map,c);
            frmReport frm = new frmReport();
            frm.jPanel1.hide();
            frm.setTitle("Report");
            frm.getContentPane().add(new JRViewer(jp));
            frm.setVisible(true);
        } catch (Exception e) {
        }
    }
    public void myReport(String rptName, String paraDate1, String date1, String paraDate2, String date2){
        try {
            Connection c = ConnectDB.getConection();
            HashMap map = new HashMap();
            map.put(paraDate1, date1);
            map.put(paraDate2, date2);
            JasperPrint jp = JasperFillManager.fillReport("src/report/"+rptName+".jasper",map,c);
            frmReport frm = new frmReport();
            frm.jPanel1.hide();
            frm.setTitle("Report");
            frm.getContentPane().add(new JRViewer(jp));
            frm.setVisible(true);
        } catch (Exception e) {
        }
    }
}