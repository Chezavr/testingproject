package com;

import engine.FileManager;
import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import engine.Engine;
import objects.Instrument;
import objects.Token;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnirestException, IOException {
        Engine engine = new Engine("http://192.168.0.182", "admin", "admin");
        Token token = engine.getToken();
        Instrument[] instruments = new Gson().fromJson(engine.sendGet("instruments", token.getAccessToken()), Instrument[].class);
        ArrayList<Instrument> instrumentList = new ArrayList<>(Arrays.asList(instruments));
        FileManager.createReport(instrumentList);
    }
}