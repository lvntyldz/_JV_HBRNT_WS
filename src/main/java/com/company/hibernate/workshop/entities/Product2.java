package com.company.hibernate.workshop.entities;

import javax.persistence.*;

@Entity
@SecondaryTable(name="PRODUCT_CATEGORY2")
public class Product2 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    private int count;

    @Column(table = "PRODUCT_CATEGORY2")
    private String category;

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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", category='" + category + '\'' +
                '}';
    }
}
