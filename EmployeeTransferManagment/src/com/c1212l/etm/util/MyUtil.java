/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c1212l.etm.util;

import com.toedter.calendar.JDateChooser;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;

/**
 *
 * @author DUONGHM
 */
public class MyUtil {
    public static String getDateStr(JDateChooser dc){
        Format formatter = new SimpleDateFormat("yyyy-MM-dd");
        return formatter.format(dc.getDate());
    }
    public static String getDateStr(JDateChooser dc, JCheckBox cb){
        if(!cb.isSelected()){
            Format formatter = new SimpleDateFormat("yyyy-MM-dd");
            return formatter.format(dc.getDate());
        }else{
            return "";
        }
    }
    
    public static java.sql.Date getDate(JDateChooser dc){        
        return java.sql.Date.valueOf(getDateStr(dc));
    }
    
}
