/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Grzegorz
 */
@Entity
@Table(name = "reservations")
public class Reservation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column
    private Date reservationDate;
    
    @Column
    private BigDecimal cost;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cruiseid")
    private Cruise cruise;
    
    @ManyToMany
    @JoinTable(
    name = "reservations_customers",
            joinColumns = @JoinColumn(name = "RESERVATION_ID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "CUSTOMER_ID", referencedColumnName = "id")
    )
    private Set<Customer> customers;

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public Set<Customer> getCustomers() {
        return customers;
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
        if (!(object instanceof Reservation)) {
            return false;
        }
        Reservation other = (Reservation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.relation2.model.Reservation[ id=" + id + " ]";
    }
    
}
