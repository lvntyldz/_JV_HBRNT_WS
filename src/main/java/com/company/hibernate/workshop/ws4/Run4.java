package com.company.hibernate.workshop.ws4;

import com.company.hibernate.workshop.entities.Product4;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class Run4 {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Product4 product = new Product4();
        product.setName("Elma");
        product.setCategory("Meyve");
        product.setCreateDate(new Date());
        product.setCreateTime(new Date());
        product.setCreateDate2(new Date());

        Product4 product2 = new Product4();
        product2.setName("Kiraz");
        product2.setCategory("Meyve");
        product2.setCreateDate(new Date());
        product2.setCreateTime(new Date());
        product2.setCreateDate2(new Date());

        Product4 product3 = new Product4();
        product3.setName("Java Programlama");
        product3.setCategory("Kitap");
        product3.setCreateDate(new Date());
        product3.setCreateTime(new Date());
        product3.setCreateDate2(new Date());

        session.save(product);//Insert
        session.save(product2);//Insert
        session.save(product3);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
