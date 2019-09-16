package com.mikomaric.dentalassistant.communication;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

public class Communication {

    private static Communication instance;
    private final WebTarget restHost;

    private Communication() {
        Client client = ClientBuilder.newClient();
//        restHost = client.target("https://dentalassistant.herokuapp.com/rest/");
        restHost = client.target("http://localhost:8080/DentalAssistant-RESTfulWebService/rest/");
    }

    public static Communication getInstance() throws Exception {
        if (instance == null) {
            instance = new Communication();
        }
        return instance;
    }

    public JsonNode get(String resoursePath) throws IOException {
        WebTarget resourseTarget = restHost.path(resoursePath);
        System.out.println(resourseTarget.getUri().getPath());
        String jsonResponse = buildRequest(resourseTarget).get(String.class);
        System.out.println(jsonResponse);
        return getData(jsonResponse);
    }

    public JsonNode post(String resoursePath, Object resource) throws IOException {
        WebTarget resourseTarget = restHost.path(resoursePath);
        String jsonResponse = buildRequest(resourseTarget).post(Entity.json(resource), String.class);
        return getData(jsonResponse);
    }

    public JsonNode put(String resoursePath, Object resource) throws IOException {
        WebTarget resourseTarget = restHost.path(resoursePath);
        String jsonResponse = buildRequest(resourseTarget).put(Entity.json(resource), String.class);
        return getData(jsonResponse);
    }

    public JsonNode delete(String resoursePath) throws IOException {
        WebTarget resourseTarget = restHost.path(resoursePath);
        String jsonResponse = buildRequest(resourseTarget).delete(String.class);
        return getData(jsonResponse);
    }

    private Invocation.Builder buildRequest(WebTarget resourseTarget) {
        return resourseTarget.request(MediaType.APPLICATION_JSON).
                header("Authorization", "Basic bWlrbzptaWtv").
                header("content-type", MediaType.APPLICATION_JSON);
    }

    private JsonNode getData(String jsonResponse) throws IOException {
        return new ObjectMapper().readTree(jsonResponse).get("data");
    }

}
