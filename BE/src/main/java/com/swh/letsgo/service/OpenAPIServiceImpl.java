package com.swh.letsgo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.swh.letsgo.config.ApiKey;

import org.springframework.stereotype.Service;

@Service
public class OpenAPIServiceImpl implements OpenAPIService{

    private final ApiKey apiKey;

    public OpenAPIServiceImpl(ApiKey apiKey){
        this.apiKey = apiKey;
    }

    @Override
    public String callLibraryOpenAPI(String headerArea, String headerRegion) {
        StringBuffer result = new StringBuffer();
        try {
            StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_lbrry_api");
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")+"="+apiKey.getApiKey());
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8"));
            urlBuilder.append("&type=json");
            urlBuilder.append("&" + URLEncoder.encode("CTPRVN_NM", "UTF-8")+"="+URLEncoder.encode(headerArea, "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("SIGNGU_NM", "UTF-8")+"="+URLEncoder.encode(headerRegion, "UTF-8"));
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line + "\n");
            }
            rd.close();
            conn.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result + "";
    }

    @Override
    public String callVillageOpenAPI(String headerArea, String headerRegion) {
        StringBuffer result = new StringBuffer();
        try {
            StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_frhl_exprn_vilage_api");
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")+"="+apiKey.getApiKey());
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8"));
            urlBuilder.append("&type=json");
            urlBuilder.append("&" + URLEncoder.encode("ctprvnNm", "UTF-8")+"="+URLEncoder.encode(headerArea, "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("signguNm", "UTF-8")+"="+URLEncoder.encode(headerRegion, "UTF-8"));
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line + "\n");
            }
            rd.close();
            conn.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result + "";
    }

    @Override
    public String callForestOpenAPI(String headerArea) {
        StringBuffer result = new StringBuffer();
        try {
            StringBuilder urlBuilder = new StringBuilder("http://api.data.go.kr/openapi/tn_pubr_public_rcrfrst_api");
            urlBuilder.append("?" + URLEncoder.encode("ServiceKey", "UTF-8")+"="+apiKey.getApiKey());
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8"));
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("100", "UTF-8"));
            urlBuilder.append("&type=json");
            urlBuilder.append("&" + URLEncoder.encode("ctprvnNm", "UTF-8")+"="+URLEncoder.encode(headerArea, "UTF-8"));
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            String line;
            while ((line = rd.readLine()) != null) {
                result.append(line + "\n");
            }
            rd.close();
            conn.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
        return result + "";
    }
    
}
