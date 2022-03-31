package com.swh.letsgo.service;

public interface OpenAPIService {
    String callLibraryOpenAPI(String headerArea, String headerRegion);
    String callVillageOpenAPI(String headerArea, String headerRegion);
    String callForestOpenAPI(String headerArea);
}
