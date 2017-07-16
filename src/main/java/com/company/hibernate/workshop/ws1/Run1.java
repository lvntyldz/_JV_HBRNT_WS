package com.company.hibernate.workshop.ws1;

import com.company.hibernate.workshop.entities.Product1;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

public class Run1 {

    public static void main(String[] args) {


//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Product1 product1 = new Product1();

        product1.setCount(3);
        product1.setName("Elma");
        session.save(product1);//Insert

        session.getTransaction().commit();
//        --------------- hibernate -----------

    }
}
