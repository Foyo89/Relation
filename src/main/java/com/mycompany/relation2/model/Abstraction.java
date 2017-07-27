/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author RENT
 */
 
@MappedSuperclass
public abstract class Abstraction {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Integer id;
    @Column
    protected Date addDate;
    @Column
    protected Date editDate;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }
    
    

    public Integer getId() {
        return id;
    }

    public Date getAddDate() {
        return addDate;
    }

    public Date getEditDate() {
        return editDate;
    }
    
    
}
