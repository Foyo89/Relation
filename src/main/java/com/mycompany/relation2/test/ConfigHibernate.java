/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.relation2.test;

import com.mycompany.relation2.model.FourWheeler;
import com.mycompany.relation2.model.TwoWheeler;
import com.mycompany.relation2.model.Vehicle;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 *
 * @author RENT
 */
public class ConfigHibernate {
    
    private static SessionFactory sessionFactory;

    public static SessionFactory getInstance() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
//            configuration.addAnnotatedClass(Vehicle.class);
//            configuration.addAnnotatedClass(TwoWheeler.class);
//            configuration.addAnnotatedClass(FourWheeler.class);
            configuration.configure();
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }

    
}
