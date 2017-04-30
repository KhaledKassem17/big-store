package com.software.team.BigStore.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Prouduct")
public class Product implements Serializable {

    @Id
    @Column(name = "prouduct_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int product_id;

    private String product_name;
    @Lob
    private byte[] product_image;
    private String product_details;
    private double product_price;
    private int product_rate;

    @Temporal(TemporalType.DATE)
    private Date expiry_date;

    private boolean selled;

    @Temporal(TemporalType.TIMESTAMP)
    private Date post_date;

    @ManyToOne(targetEntity = SubCategory.class)
    @JoinColumn(name = "prouduct_category")
    private SubCategory product_category;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Prouduct_like.class, mappedBy = "prouduct")
    private List<Prouduct_like> likes;

    @OneToMany(cascade = CascadeType.ALL, targetEntity = Comment.class, mappedBy = "post_id")
    private List<Comment> comments;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public byte[] getProduct_image() {
        return product_image;
    }

    public void setProduct_image(byte[] product_image) {
        this.product_image = product_image;
    }

    public String getProduct_details() {
        return product_details;
    }

    public void setProduct_details(String product_details) {
        this.product_details = product_details;
    }

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public int getProduct_rate() {
        return product_rate;
    }

    public void setProduct_rate(int product_rate) {
        this.product_rate = product_rate;
    }

    public Date getExpiry_date() {
        return expiry_date;
    }

    public void setExpiry_date(Date expiry_date) {
        this.expiry_date = expiry_date;
    }

    public boolean isSelled() {
        return selled;
    }

    public void setSelled(boolean selled) {
        this.selled = selled;
    }

    public Date getPost_date() {
        return post_date;
    }

    public void setPost_date(Date post_date) {
        this.post_date = post_date;
    }

    public SubCategory getProduct_category() {
        return product_category;
    }

    public void setProduct_category(SubCategory product_category) {
        this.product_category = product_category;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Product{" + "product_id=" + product_id + ", product_name=" + product_name + ", product_image=" + product_image + ", product_details=" + product_details + ", product_price=" + product_price + ", product_rate=" + product_rate + ", expiry_date=" + expiry_date + ", selled=" + selled + ", post_date=" + post_date + ", product_category=" + product_category + ", owner=" + owner + '}';
    }

    public List<Prouduct_like> getLikes() {
        return likes;
    }

    public void setLikes(List<Prouduct_like> likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

}
