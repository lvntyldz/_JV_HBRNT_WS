package com.company.hibernate.workshop.entities;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCT_CATEGORY5")
public class Category5 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
