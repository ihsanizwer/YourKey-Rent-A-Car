/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import classes.DBconnection;
import com.mysql.jdbc.Connection;
import java.awt.Container;
import java.util.HashMap;
import javax.swing.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author dreams
 */
public class ReportView extends JFrame{
    
    public ReportView(String filename)
    {
        this(filename,null);
        
    }
    
    public ReportView(String filename,HashMap para)
    {
        super("Hospital Management Systems (Report Viewer)");
        
          Connection con = (Connection) DBconnection.connect();
        
        try
        {
            JasperPrint print = JasperFillManager.fillReport(filename, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);
        }
        catch(Exception e)
        {
            
        }
    }
}
