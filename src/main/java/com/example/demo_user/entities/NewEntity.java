package com.example.demo_user.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Data
@Entity
@Table(name = "new", schema = "quanlywebthoitrang", catalog = "")
public class NewEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "title", nullable = false, length = 255)
    private String title;
    @Basic
    @Column(name = "comtent", nullable = true, length = 255)
    private String comtent;
    @Basic
    @Column(name = "shortdescription", nullable = true, length = 255)
    private String shortdescription;
    @Basic
    @Column(name = "categorycode", nullable = true, length = 255)
    private String categorycode;
    @Basic
    @Column(name = "thumbnall", nullable = true, length = 255)
    private String thumbnall;

    public static void setCategory(CategoryEntity categoryEntity) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getComtent() {
        return comtent;
    }

    public void setComtent(String comtent) {
        this.comtent = comtent;
    }

    public String getShortdescription() {
        return shortdescription;
    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getCategorycode() {
        return categorycode;
    }

    public void setCategorycode(String categorycode) {
        this.categorycode = categorycode;
    }

    public String getThumbnall() {
        return thumbnall;
    }

    public void setThumbnall(String thumbnall) {
        this.thumbnall = thumbnall;
    }

    public String getShortDescription() {
        return shortdescription;
    }

    public String getCategoryCode() {
        return categorycode;
    }
}
