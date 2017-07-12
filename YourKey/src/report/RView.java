/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import classes.DBconnection;
import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Ihsan Izwer
 */
public class RView  extends JFrame{
    public RView(String fileName){
        this(fileName, null);
    }
    
    public RView(String fileName, HashMap para){
        super("Your Key car rental system.");
        Connection con = DBconnection.connect();
        try{
            JasperPrint print = JasperFillManager.fillReport(fileName, para, con);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.add(viewer);
        }catch(Exception e){
           
        }
        setBounds(10, 10, 820, 512);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
}
