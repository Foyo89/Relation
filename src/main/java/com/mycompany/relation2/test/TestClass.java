/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.test;


import com.mycompany.relation2.model.Customer;
import java.util.Date;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author RENT
 */
public class TestClass {
    public static void main(String [] args) 
	{
        Customer customer = new Customer();
       
        
        SessionFactory instance = ConfigHibernate.getInstance();
        Session session = instance.openSession();
        Transaction transaction = session.beginTransaction();
        
            customer.setFirstname("Grzegorz");
            customer.setLastname("Foik");
        
        session.save(customer);
        transaction.commit();
    
        session.close();
        System.out.println("Test");
    
    
}
    
}
