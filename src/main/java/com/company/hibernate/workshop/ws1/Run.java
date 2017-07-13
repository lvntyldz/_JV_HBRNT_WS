package com.company.hibernate.workshop.ws1;

import com.company.hibernate.workshop.entities.Person;
import com.company.hibernate.workshop.util.HibernateUtil;
import org.hibernate.Session;

public class Run {

    public static void main(String[] args) {


//        --------------- hibernate -----------
        Session session = HibernateUtil.getSession().openSession();
        session.beginTransaction();

        Person person = new Person();

        person.setAge(33);
        person.setName("ali");
        person.setLastname("veli");

        session.save(person);//Insert
        session.getTransaction().commit();
//        --------------- hibernate -----------

    }
}
