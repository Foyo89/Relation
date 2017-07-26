/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author RENT
 */
@Entity
//@Table(name = "Four_wheelers")
public class FourWheeler extends Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    
//    @Id
//    private Integer id;
    
    @Column (name = "Steering_type")
    private String steeringType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getSteeringType() {
        return steeringType;
    }

    public void setSteeringType(String steeringType) {
        this.steeringType = steeringType;
    }
    


    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (getId() != null ? getId().hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FourWheeler)) {
            return false;
        }
        FourWheeler other = (FourWheeler) object;
        if ((this.getId() == null && other.getId() != null) || (this.getId() != null && !this.getId().equals(other.getId()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.relation2.model.FourWheller[ id=" + getId() + " ]";
    }
    
}
