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
public class User {

    private String telephone, FirstName, LastName, Address, Country;
    private int Sex;
    private String password;
    private byte[] picture;

    public User() {
    }

    public User(String telephone, String password) {
        this.telephone = telephone;
        this.password = password;
    }

    public User(String telephone, String FirstName, String LastName, String Address, String Country, int Sex, String password, byte[] picture) {
        this.telephone = telephone;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Address = Address;
        this.Country = Country;
        this.Sex = Sex;
        this.password = password;
        this.picture = picture;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getSex() {
        return Sex;
    }

    public void setSex(int Sex) {
        this.Sex = Sex;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
