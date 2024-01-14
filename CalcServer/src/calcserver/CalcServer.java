/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcserver;
import java.rmi.*;
import java.rmi.server.*;
/**
 *
 * @author NAKS MTSHATSHENI
 */
public class CalcServer {

   
    public static void main(String[] args) {
        
    try {
            CalcServerImplementation mathServer = new CalcServerImplementation();
            Naming.rebind("MathServer", mathServer);
        } catch(Exception exp) {
            exp.printStackTrace();
        }
    }
    
}
