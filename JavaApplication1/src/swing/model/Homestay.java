/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.model;

/**
 *
 * @author Emi Tiramis
 */
public class Homestay {
    private String telephone,name,address;
    private double price;
    private byte[] picture;

    public Homestay() {
    }

    public Homestay(String telephone, String name, String address, double price, byte[] picture) {
        this.telephone = telephone;
        this.name = name;
        this.address = address;
        this.price = price;
        this.picture = picture;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
    
}
