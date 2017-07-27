/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.test;


import com.mycompany.relation2.model.Customer;
import com.mycompany.relation2.model.FourWheeler;
import com.mycompany.relation2.model.TwoWheeler;
import com.mycompany.relation2.model.Vehicle;
import java.sql.Statement;
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
            
            
            
                
            
        //Customer customer = new Customer();
       
        
//        SessionFactory instance = ConfigHibernate.getInstance();
//        Session session = instance.openSession();
//        Transaction transaction = session.beginTransaction();
//        
//            customer.setFirstname("Grzegorz");
//            customer.setLastname("Foik");
//        
//        session.save(customer);
//        transaction.commit();
//    
//        session.close();
//        System.out.println("Test");
//        
//        
        Vehicle v = new Vehicle();
        
        v.setName("Ford");
        v.setAddDate(new Date());
        
        
        SessionFactory instance = ConfigHibernate.getInstance();
        Session session = instance.openSession();
        Transaction transaction = session.beginTransaction();
        
           
        
        session.save(v);
        transaction.commit();
    
        session.close();
        
        
        Vehicle v1;
        
        session = instance.openSession();
        Query query = session.createQuery("from Vehicle Where name='Ford'");
        
        v1 = (Vehicle) query.uniqueResult();
        
        session.evict(v1);
        
        v1.setName("Toyota");
        v1.setEditDate(new Date());
        
        transaction = session.beginTransaction();
        session.save(v1);
        transaction.commit();
    
        session.close();
        
            instance = ConfigHibernate.getInstance();
            session = instance.openSession();
            transaction = session.beginTransaction();
        
        
            FourWheeler fw = new FourWheeler();
            fw.setName("Trabant");
            fw.setAddDate(new Date());
            fw.setEditDate(fw.getAddDate());
            fw.setSteeringType("typ sterowania Four Wheel");
            
            
            TwoWheeler tw = new TwoWheeler();
            tw.setName("Rower");
            tw.setAddDate(new Date());
            tw.setEditDate(tw.getAddDate());
            tw.setSteeringType("typ sterowania Two Wheeler");
            session = instance.openSession();
            transaction = session.beginTransaction();
            
            session.save(fw);
            session.save(tw);
            transaction.commit();
            
            
        
        instance.close();
        System.out.println("Test Done");
        
            
        
    
    
}
    
}
