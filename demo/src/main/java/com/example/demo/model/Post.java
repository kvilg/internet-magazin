package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String name,car,text;


    public Post(){

    }

    public Post(String name,String car,String text){
        this.name = name;
        this.car = car;
        this.text = text;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    public String getText() {
        return text;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setText(String text) {
        this.text = text;
    }
}
