package engine;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import objects.Token;

public class Engine {

    private String serverUrl;
    private String login;
    private String password;

    public Engine(String serverUrl, String login, String password) {
        this.serverUrl = serverUrl + "/proftrading/rest/";
        this.login = login;
        this.password = password;
    }

    public Token getToken() throws UnirestException {
        HttpResponse<String> response = Unirest.post(serverUrl + "auth/token")
                .header("Content-Type", "application/json")
                .header("cache-control", "no-cache")
                .body("{login:" + login + ",password:" + password +"}")
                .asString();
        return new Gson().fromJson(response.getBody(), Token.class);
    }

    public String sendGet(String methodUrl, String token) throws UnirestException {
        serverUrl = serverUrl + methodUrl;
        HttpResponse<String> response = Unirest.get(serverUrl)
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .header("cache-control", "no-cache")
                .asString();
        return response.getBody();
    }
}
