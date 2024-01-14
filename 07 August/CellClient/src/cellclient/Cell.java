/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cellclient;

import java.io.*;
/**
 *
 * @author NAKS MTSHATSHENI
 */
public class Cell implements Serializable  {
    private String manufacturer;
    private String modeNumber;
    private double retailPrice;

    public Cell(String manufacturer, String modeNumber, double retailPrice) {
        this.manufacturer = manufacturer;
        this.modeNumber = modeNumber;
        retailPrice = 0;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModeNumber() {
        return modeNumber;
    }

    public void setModeNumber(String modeNumber) {
        this.modeNumber = modeNumber;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }
    
    
    
    
    
    
}
