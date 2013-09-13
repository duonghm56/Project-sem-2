/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Thanhnx
 */
public class validateInfo {

    private static Pattern pattern = null;
    private static Matcher matcher;

    public static boolean check(String s) {
        if (s == null || s.length() == 0 || s.equals(" ")) {
            return false;
        }
        return true;
    }

    public static boolean checkNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        } else {
            pattern = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
            matcher = pattern.matcher(s);
            return matcher.matches();
        }
    }

    public static boolean checkNumber1(String s) {
        pattern = Pattern.compile("^[-+]?[0-9]*\\.?[0-9]+$");
        matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean checkEmail(String s) {
        if (s == null || s.length() == 0) {
            return false;
        } else {
            pattern = Pattern.compile(".+@.+\\.[a-z]+");
            matcher = pattern.matcher(s);
            return matcher.matches();
        }
    }

    public static void main(String[] args) {
        System.out.println(checkNumber("345f"));
    }
}
