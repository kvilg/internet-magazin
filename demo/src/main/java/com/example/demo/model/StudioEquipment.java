package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudioEquipment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer price;

    private Integer outLine , inLine;

    public StudioEquipment(Integer price, Integer outLine, Integer inLine) {
        this.price = price;
        this.outLine = outLine;
        this.inLine = inLine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getOutLine() {
        return outLine;
    }

    public void setOutLine(Integer outLine) {
        this.outLine = outLine;
    }

    public Integer getInLine() {
        return inLine;
    }

    public void setInLine(Integer inLine) {
        this.inLine = inLine;
    }
}
