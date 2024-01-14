/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellserver;

import java.io.FileOutputStream;
import java.io.*;
import java.net.*;
import cellclient.*;

/**
 *
 * @author NAKS MTSHATSHENI
 */
public class CellServer {

    public CellServer() throws IOException, ClassNotFoundException {
        ServerSocket servSoc = new ServerSocket(80);
        while (true) {
            Socket soc = servSoc.accept();
            ObjectInputStream cp = new ObjectInputStream(soc.getInputStream());
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("cell.txt"));
            Object obj = cp.readObject();  
            output.writeObject(obj);
            output.close();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new CellServer();
    }

}
