package com.company.hibernate.workshop.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUCT5")
public class Product5 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNT")
    private int count;

    @Column(name = "CREATE_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createDate;

    @ManyToOne(cascade = CascadeType.ALL)
    public Category5 category;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Category5 getCategory() {
        return category;
    }

    public void setCategory(Category5 category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product5{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", createDate=" + createDate +
                ", category=" + category +
                '}';
    }
}
