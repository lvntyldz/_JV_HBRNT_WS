package com.company.hibernate.workshop.entities;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@SecondaryTable(name = "PRODUCT_CATEGORY4", pkJoinColumns = {
        @PrimaryKeyJoinColumn(name = "PRODUCT_ID", referencedColumnName = "ID")
})
@Table(name = "PRODUCT4")
public class Product4 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "COUNT")
    private int count;

    @Column(table = "PRODUCT_CATEGORY4")
    private String category;

    @Column(name = "CREATE_DATE")
    @Temporal(value = TemporalType.DATE)
    private Date createDate;

    @Column(name = "CREATE_DATE2")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createDate2;


    @Column(name="CREATE_TIME")
    @Temporal(value = TemporalType.TIME)
    private Date createTime;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getCreateDate2() {
        return createDate2;
    }

    public void setCreateDate2(Date createDate2) {
        this.createDate2 = createDate2;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Product4{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", category='" + category + '\'' +
                ", createDate=" + createDate +
                ", createDate2=" + createDate2 +
                ", createTime=" + createTime +
                '}';
    }
}
