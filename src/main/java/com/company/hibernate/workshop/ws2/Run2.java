package com.company.hibernate.workshop.ws2;

import com.company.hibernate.workshop.entities.Product2;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

public class Run2 {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Product2 product = new Product2();
        product.setName("Elma");
        product.setCategory("Meyve");

        Product2 product22 = new Product2();
        product22.setName("Kiraz");
        product22.setCategory("Meyve");

        Product2 product23 = new Product2();
        product23.setName("Java Programlama");
        product23.setCategory("Kitap");




        session.save(product);//Insert
        session.save(product22);//Insert
        session.save(product23);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
