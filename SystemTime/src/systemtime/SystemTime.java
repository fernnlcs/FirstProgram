/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemtime;

import java.util.Date;

/**
 *
 * @author temp
 */
public class SystemTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date now = new Date();
        System.out.print("Current date and time: ");
        System.out.println(now.toString());
    }
    
}
