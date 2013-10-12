/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.util;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author TuanAnhIT
 */
public class MyReport {
    private String fileName;
    private HashMap parameters;
    private JRBeanCollectionDataSource dataSource;

    public MyReport(String fileName, HashMap parameters, JRBeanCollectionDataSource dataSource) {
        this.fileName = fileName;
        this.parameters = parameters;
        this.dataSource = dataSource;
    }
    
    public JRViewer getPanelReport(){
        try {
            JasperPrint print = JasperFillManager.fillReport(fileName, parameters, dataSource);            
            JRViewer viewer = new JRViewer(print);
            return viewer;
        } catch (Exception ex) {
            Logger.getLogger(MyReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public JFrame getFrameReport(){
        try {
            JasperPrint print = JasperFillManager.fillReport(fileName, parameters, dataSource);            
            JRViewer viewer = new JRViewer(print);
            JFrame frame = new JFrame("Preview | Print");
            //frame.setIconImage(new ImageIcon(getClass().getResource("/resource/printer_32.png")).getImage());
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dim = toolkit.getScreenSize();
            frame.add(viewer);
            frame.pack();
            frame.setBounds((dim.width-1014)/2, (dim.height-684)/2, 1014, 684);
            //frame.setSize((int) dim.getWidth(), (int) dim.getHeight() - 30);
            return frame;
        } catch (Exception ex) {
            Logger.getLogger(MyReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
