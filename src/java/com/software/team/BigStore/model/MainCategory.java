package com.software.team.BigStore.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "maincategory")
public class MainCategory implements Serializable {

    private int category_id;
    private String category_name;
    private byte[] category_icon;


    public MainCategory() {
    }

    public MainCategory(int category_id, byte[] category_icon, String category_name) {
        this.category_id = category_id;
        this.category_icon = category_icon;
        this.category_name = category_name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Lob
    public byte[] getCategory_icon() {
        return category_icon;
    }

    public void setCategory_icon(byte[] category_icon) {
        this.category_icon = category_icon;
    }



}
