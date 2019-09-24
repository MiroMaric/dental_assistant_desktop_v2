package com.mikomaric.dentalassistant.communication;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mikomaric.dentalassistant.communication.exception.MyNotAuthorizedException;
import java.io.IOException;
import java.util.Base64;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class Communication {

    private static Communication instance;
    private final WebTarget restHost;
    private String username;
    private String password;

    private Communication() {
        Client client = ClientBuilder.newClient();
        restHost = client.target("https://dentalassistant.herokuapp.com/rest/");
//        restHost = client.target("http://localhost:8080/DentalAssistant-RESTfulWebService/rest/");
        this.username = "pera";
        this.password = "pera";
    }

    public static Communication getInstance(){
        if (instance == null) {
            instance = new Communication();
        }
        return instance;
    }

    public JsonNode get(String resoursePath) throws MyNotAuthorizedException,IOException {
        WebTarget resourseTarget = restHost.path(resoursePath);
        System.out.println(resourseTarget.getUri().getPath());
        Response response = buildRequest(resourseTarget).get(Response.class);
        handleResponseStatus(response.getStatus());
        String jsonResponse = response.readEntity(String.class);
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
        String authorizationValue = "Basic" + " " +
                Base64.getEncoder().encodeToString((this.username+":"+this.password).getBytes());
        System.out.println("=======");
        System.out.println(authorizationValue);
        return resourseTarget.request(MediaType.APPLICATION_JSON).
                header("Authorization", authorizationValue).
                header("content-type", MediaType.APPLICATION_JSON);
    }

    private JsonNode getData(String jsonResponse) throws IOException {
        return new ObjectMapper().readTree(jsonResponse).get("data");
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private void handleResponseStatus(int statusCode)throws MyNotAuthorizedException{
        switch(statusCode){
            case 401:
                throw new MyNotAuthorizedException();
        }
    }

}
