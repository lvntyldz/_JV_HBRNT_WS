package com.company.hibernate.workshop.ws2;

import com.company.hibernate.workshop.entities.Product;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

public class Run {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Product product = new Product();
        product.setName("Elma");
        product.setCategory("Meyve");

        Product product2 = new Product();
        product2.setName("Kiraz");
        product2.setCategory("Meyve");

        Product product3 = new Product();
        product3.setName("Java Programlama");
        product3.setCategory("Kitap");




        session.save(product);//Insert
        session.save(product2);//Insert
        session.save(product3);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
