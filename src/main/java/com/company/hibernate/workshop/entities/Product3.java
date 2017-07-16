package com.company.hibernate.workshop.entities;

import javax.persistence.*;

@Entity
@SecondaryTable(name = "PRODUCT_CATEGORY3", pkJoinColumns = {
        @PrimaryKeyJoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
})
@Table(name = "PRODUCT3")
public class Product3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNT")
    private int count;

    @Column(table = "PRODUCT_CATEGORY3")
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
        return "Product3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", category='" + category + '\'' +
                '}';
    }
}
