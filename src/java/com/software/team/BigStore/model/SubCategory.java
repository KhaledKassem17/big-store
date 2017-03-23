package com.software.team.BigStore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SubCategory")
public class SubCategory implements Serializable {

    private int sub_cat_id;
    private String cat_name;

    private byte[] cat_icon;

    MainCategory cat_parent_id;

    private List<User> InterstedUsers = new ArrayList();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getSub_cat_id() {
        return sub_cat_id;
    }

    public void setSub_cat_id(int sub_cat_id) {
        this.sub_cat_id = sub_cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    @Column(columnDefinition = "LONGBLOB")
    public byte[] getCat_icon() {
        return cat_icon;
    }

    public void setCat_icon(byte[] cat_icon) {
        this.cat_icon = cat_icon;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_category_id")
    public MainCategory getCat_parent_id() {
        return cat_parent_id;
    }

    public void setCat_parent_id(MainCategory cat_parent_id) {
        this.cat_parent_id = cat_parent_id;
    }

    @ManyToMany(cascade = CascadeType.ALL, targetEntity = User.class)
    @JoinTable(name = "user_intersts", joinColumns = {
        @JoinColumn(name = "interst_id")}, inverseJoinColumns = {
        @JoinColumn(name = "user_id")})
    public List<User> getInterstedUsers() {
        return InterstedUsers;
    }

    public void setInterstedUsers(List<User> InterstedUsers) {
        this.InterstedUsers = InterstedUsers;
    }

}
