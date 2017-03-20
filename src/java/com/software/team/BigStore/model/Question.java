/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.software.team.BigStore.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author tito
 */

@Entity
public class Question implements Serializable {
    
    @Id
    int questionId;
    
    @OneToOne
    User owner;
    
    String question_content;
    
    @Temporal(TemporalType.TIMESTAMP)
    Date question_date;
    
    @OneToOne
    Answer right_answer;
    
    int rate;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getQuestion_content() {
        return question_content;
    }

    public void setQuestion_content(String question_content) {
        this.question_content = question_content;
    }

    public Date getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(Date question_date) {
        this.question_date = question_date;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
    
    
    
    
    
    
    
    
}
