package com.swh.letsgo.model.dto;

import com.swh.letsgo.model.entity.Banner;

public class BannerDTO {
    private Long id;
    private String placeName;
    private String placeAddr;
    private String placeTel;
    private String placeClosedate;
    private int count;

    public BannerDTO(Banner banner) {
        this.placeName = banner.getPlaceName();
        this.placeAddr = banner.getPlaceAddr();
        this.placeTel = banner.getPlaceTel();
        this.placeClosedate = banner.getPlaceClosedate().toString();
    }

    public BannerDTO(String placeName, String placeAddr, String placeTel, String placeClosedate) {
        this.placeName = placeName;
        this.placeAddr = placeAddr;
        this.placeTel = placeTel;
        this.placeClosedate = placeClosedate;
    }

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
   
}






