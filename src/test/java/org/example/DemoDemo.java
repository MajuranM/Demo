package org.example;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DemoDemo {

    public static void main(String[] args) {
        // Define the base URL
        String a = "https://postman-echo.com";

        // Define the endpoint
        String endpoint = "/post";

        // Define query parameters
        String queryParams = "?foo1=abc&foo2=gre";

        // Construct the complete URL
        String url = a + endpoint + queryParams;

        // Trigger the GET request
        Response response = RestAssured.get(url);

        // Validate the response status code is 200 OK
        int statusCode = response.getStatusCode();
        if (statusCode == 200) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed - " + statusCode);
        }
        // Print the response status code
        System.out.println("Status Code: " + response.getStatusCode());

        // Print the response body
        System.out.println("Body:");
        System.out.println(response.getBody().asString());

    }
}