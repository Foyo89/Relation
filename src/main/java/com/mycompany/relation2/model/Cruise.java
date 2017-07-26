/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.model;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Grzegorz
 */
@Entity
@Table(name = "cruise")
public class Cruise implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String start;
    @Column
    private String destination;
    @Column
    private long distance;
    
    @OneToMany(mappedBy = "cruise")
    private Set<Reservation> reservations;
    
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipid")
    private Ship ship;
    

    public void setStart(String start) {
        this.start = start;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDistance(long distance) {
        this.distance = distance;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getStart() {
        return start;
    }

    public String getDestination() {
        return destination;
    }

    public long getDistance() {
        return distance;
    }

    public Ship getShip() {
        return ship;
    }
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cruise)) {
            return false;
        }
        Cruise other = (Cruise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.relation2.model.Cruise[ id=" + id + " ]";
    }
    
}
