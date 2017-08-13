package com.company.hibernate.workshop.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PRODUCT6")
public class Product6 {

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

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "PRODUCT_CATEGORY_RELATION_6",
            joinColumns = @JoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "CATEGORY_ID", referencedColumnName = "ID"))
    private Set<Category6> categories = new HashSet<Category6>();


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

    public Set<Category6> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category6> categories) {
        this.categories = categories;
    }
}
