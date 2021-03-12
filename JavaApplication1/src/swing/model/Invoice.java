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
public class Invoice {
    private String homestay_ID, user_telephone,review;
    private int days;

    public Invoice() {
    }

    public Invoice(String homestay_ID, String user_telephone, String review, int days) {
        this.homestay_ID = homestay_ID;
        this.user_telephone = user_telephone;
        this.review = review;
        this.days = days;
    }

    public String getHomestay_ID() {
        return homestay_ID;
    }

    public void setHomestay_ID(String homestay_ID) {
        this.homestay_ID = homestay_ID;
    }

    public String getUser_telephone() {
        return user_telephone;
    }

    public void setUser_telephone(String user_telephone) {
        this.user_telephone = user_telephone;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
}
