package com.company.hibernate.workshop.ws6;

import com.company.hibernate.workshop.entities.Category6;
import com.company.hibernate.workshop.entities.Product6;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;
import java.util.HashSet;

public class Run6 {

    public static void main(String[] args) {

//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Category6 category61 = new Category6();
        category61.setName("Yemek Tarifi Kitapları");

        Category6 category62 = new Category6();
        category62.setName("Yazılım Kitapları");

        Category6 category63 = new Category6();
        category63.setName("Teknoloji Kitapları");


        HashSet<Category6> categories6 = new HashSet<Category6>();
        categories6.add(category62);
        categories6.add(category63);

        Product6 product = new Product6();
        product.setName("Java Kitabı");
        product.setCreateDate(new Date());
        product.setCategories(categories6);


        HashSet<Category6> categories62 = new HashSet<Category6>();
        categories62.add(category61);

        Product6 product2 = new Product6();
        product2.setName("Ellerime Sağlık");
        product2.setCreateDate(new Date());
        product2.setCategories(categories62);

        session.save(product);//Insert
        session.save(product2);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------


    }
}
