package com.swh.letsgo.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;

@Entity
public class Banner {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String placeName;
    private String placeAddr;
    private String placeTel;
    private String placeClosedate;

    @Column(nullable = false)
    @ColumnDefault("0")
    private int count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceAddr() {
        return placeAddr;
    }

    public void setPlaceAddr(String placeAddr) {
        this.placeAddr = placeAddr;
    }

    public String getPlaceTel() {
        return placeTel;
    }

    public void setPlaceTel(String placeTel) {
        this.placeTel = placeTel;
    }

    public String getPlaceClosedate() {
        return placeClosedate;
    }

    public void setPlaceClosedate(String placeClosedate) {
        this.placeClosedate = placeClosedate;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Banner [count=" + count + ", id=" + id + ", placeAddr=" + placeAddr + ", placeClosedate="
                + placeClosedate + ", placeName=" + placeName + ", placeTel=" + placeTel + "]";
    }

    
}
