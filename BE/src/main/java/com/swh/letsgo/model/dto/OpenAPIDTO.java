package com.swh.letsgo.model.dto;

public class OpenAPIDTO {
    private int type;
    private String headerArea;
    private String headerRegion;

    public OpenAPIDTO(int type, String headerArea, String headerRegion) {
        this.type = type;
        this.headerArea = headerArea;
        this.headerRegion = headerRegion;
    }
    
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getHeaderArea() {
        return headerArea;
    }
    public void setHeaderArea(String headerArea) {
        this.headerArea = headerArea;
    }
    public String getHeaderRegion() {
        return headerRegion;
    }
    public void setHeaderRegion(String headerRegion) {
        this.headerRegion = headerRegion;
    }
    
}
