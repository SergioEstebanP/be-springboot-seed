package com.springboot.apirest.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "clients")
public class Client implements Serializable {

    @NotNull(message = "Region couldn't be null")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "region_id") // foreign key to join the columns
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // to avoid some conflicts and noise from data
    private Region region;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotEmpty(message = "Couldn't be empty")
    @Size(min = 4, max = 30)
    @Column(nullable = false)
    private String name;

    @NotEmpty
    @Column(nullable = false)
    private String surname;

    @NotEmpty
    @Email
//    @Column(nullable = false, unique = true)
    @Column(nullable = false)
    private String email;

    @Column(name = "created_at")
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column(name = "nextView")
    @Temporal(TemporalType.DATE)
    private Date nextView;



    private String picture;

    // in order to handle some data after save it in DB
    @PrePersist
    public void prePersist() {
        createdAt = new Date();
    }

    // GETTERS AND SETTERS
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getNextView() {
        return nextView;
    }

    public void setNextView(Date nextView) {
        this.nextView = nextView;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
