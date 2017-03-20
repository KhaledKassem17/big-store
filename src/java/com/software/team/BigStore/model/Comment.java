package com.software.team.BigStore.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Comment implements Serializable {

    @Id
    private int comment_id;

    @ManyToOne
    @JoinColumn(name = "prouduct_id")
    private Product post_id;
    @OneToOne
    @JoinColumn(name = "commentor_id")
    private User commentator;
    
    private String comment_content;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date comment_date;
    
    
    

    public int getComment_id() {
        return comment_id;
    }

    public void setComment_id(int comment_id) {
        this.comment_id = comment_id;
    }

    public Product getPost_id() {
        return post_id;
    }

    public void setPost_id(Product post_id) {
        this.post_id = post_id;
    }

    public User getCommentator() {
        return commentator;
    }

    public void setCommentator(User commentator) {
        this.commentator = commentator;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }



}
