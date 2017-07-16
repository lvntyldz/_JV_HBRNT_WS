package com.company.hibernate.workshop.ws3;

import com.company.hibernate.workshop.entities.Product3;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

public class Run3 {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Product3 product = new Product3();
        product.setName("Elma");
        product.setCategory("Meyve");

        Product3 product2 = new Product3();
        product2.setName("Kiraz");
        product2.setCategory("Meyve");

        Product3 product3 = new Product3();
        product3.setName("Java Programlama");
        product3.setCategory("Kitap");

        session.save(product);//Insert
        session.save(product2);//Insert
        session.save(product3);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
