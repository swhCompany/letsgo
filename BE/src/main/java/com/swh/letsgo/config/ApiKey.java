package com.swh.letsgo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApiKey {
    @Value("${api-key}")
    private String ApiKey;

    public String getApiKey() {
        return ApiKey;
    }

    public void setApiKey(String apiKey) {
        ApiKey = apiKey;
    }

    @Override
    public String toString() {
        return "ApiKey [ApiKey=" + ApiKey + "]";
    }

}
