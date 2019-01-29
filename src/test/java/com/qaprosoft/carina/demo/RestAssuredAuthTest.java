package com.qaprosoft.carina.demo;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.authentication.PreemptiveBasicAuthScheme;

import org.testng.annotations.Test;

public class RestAssuredAuthTest {
    @Test
    public void auth(){
        RestAssured.baseURI = System.getProperty("https://demo-techtour-app-1.upnetix.tech/api/authentication");
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("valentina.baliyska@upnetix.com");
        authScheme.setPassword("test12fgfdg3@");
        RestAssured.authentication = authScheme;
    }
}
