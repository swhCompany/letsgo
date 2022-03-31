package com.swh.letsgo.controller;

import com.swh.letsgo.model.dto.OpenAPIDTO;
import com.swh.letsgo.service.OpenAPIService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/letsgo/search")
public class OpenAPIController {
    private final OpenAPIService openAPIService;

    public OpenAPIController(OpenAPIService openAPIService){
        this.openAPIService = openAPIService;
    }

    @PostMapping
    public String callOpenAPI(@RequestBody OpenAPIDTO openAPIDTO) {
        String result;
        if(openAPIDTO.getType()==0){
            result = openAPIService.callLibraryOpenAPI(openAPIDTO.getHeaderArea(), openAPIDTO.getHeaderRegion());
        } else if (openAPIDTO.getType()==1) {
            result = openAPIService.callVillageOpenAPI(openAPIDTO.getHeaderArea(), openAPIDTO.getHeaderRegion());
        } else {
            result = openAPIService.callForestOpenAPI(openAPIDTO.getHeaderArea());
        }
        return result;
    }
}
