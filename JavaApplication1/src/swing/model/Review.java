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
public class Review {
    String telephone,name,review,day,id;

    public Review() {
    }

    public Review(String telephone, String name, String review, String day, String id) {
        this.telephone = telephone;
        this.name = name;
        this.review = review;
        this.day = day;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

  

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
}
