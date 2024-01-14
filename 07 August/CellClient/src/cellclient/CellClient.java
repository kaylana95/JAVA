/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cellclient;

import java.io.*;
import java.net.Socket;
import javax.swing.JOptionPane;

/**
 *
 * @author NAKS MTSHATSHENI
 */
public class CellClient {
    
    String manufacturer;
    String modeNumber;
    double retailPrice;
    
    
    public void sendToServer() throws IOException{
        Socket soc = new Socket("localhost", 80);
        ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
        captureDetails();
        Cell cell = new Cell(manufacturer, modeNumber, retailPrice);
        out.writeObject(cell);
        out.close();
    }

    public void captureDetails(){
        manufacturer = JOptionPane.showInputDialog(null, "Enter the manufacturer name: ");
        modeNumber = JOptionPane.showInputDialog(null, "Enter the number of the mode: ");
        retailPrice = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cell retail price: "));
        
    }
    
    public static void main(String[] args) {
        CellClient d = new CellClient();
        d.captureDetails();
        
    }
    
}
