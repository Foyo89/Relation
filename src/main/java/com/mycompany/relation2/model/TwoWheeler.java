/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author RENT
 */
@Entity
@Table (name = "Two_wheelers")
public class TwoWheeler extends Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    
    @Column (name = "Steering_type")
    private String steeringType;
    
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
    
    
    
    
}
