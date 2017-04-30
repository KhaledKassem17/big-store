package com.software.team.BigStore.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Prouduct_like implements Serializable {

    @Id
    private int like_id;

    @OneToOne
    @JoinColumn(name = "liker_id")
    private User liker;

    @ManyToOne
    @JoinColumn(name = "prouduct_id")
    private Product prouduct;

    public Prouduct_like() {
    }

    public Prouduct_like(int like_id, User liker, Product prouduct) {
        this.like_id = like_id;
        this.liker = liker;
        this.prouduct = prouduct;
    }

    public int getLike_id() {
        return like_id;
    }

    public void setLike_id(int like_id) {
        this.like_id = like_id;
    }

    public User getLiker() {
        return liker;
    }

    public void setLiker(User liker) {
        this.liker = liker;
    }

    public Product getProuduct() {
        return prouduct;
    }

    public void setProuduct(Product prouduct) {
        this.prouduct = prouduct;
    }

}
