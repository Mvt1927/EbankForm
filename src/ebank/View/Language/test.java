/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank.View.Language;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author DELL
 */
public class test {

    public static void main(String[] args) {
        Locale localeEn = new Locale("en");
        ResourceBundle labels = ResourceBundle.getBundle("ebank.View.Language.messages", localeEn);
        System.out.println("Xin chào trong tiếng anh: " + labels.getString("hello"));

        Locale localeVi = new Locale("vi");
        labels = ResourceBundle.getBundle("ebank.View.Language.messages", localeVi);
        System.out.println("Xin chào trong tiếng việt: " + labels.getString("hello"));
    }
}
