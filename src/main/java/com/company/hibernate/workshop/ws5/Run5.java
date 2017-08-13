package com.company.hibernate.workshop.ws5;

import com.company.hibernate.workshop.entities.Category5;
import com.company.hibernate.workshop.entities.Product5;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class Run5 {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Category5 category5 = new Category5();
        category5.setName("Meyve");

        Category5 category52 = new Category5();
        category52.setName("Kitap");
        
        Product5 product = new Product5();
        product.setName("Elma");
        product.setCategory(category5);
        product.setCreateDate(new Date());


        Product5 product2 = new Product5();
        product2.setName("Kiraz");
        product2.setCategory(category5);
        product2.setCreateDate(new Date());

        Product5 product3 = new Product5();
        product3.setName("Java Programlama");
        product3.setCategory(category52);
        product3.setCreateDate(new Date());

        session.save(product);//Insert
        session.save(product2);//Insert
        session.save(product3);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
