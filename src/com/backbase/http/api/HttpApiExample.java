package com.backbase.http.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpApiExample {

    public static void main(String args[]) throws IOException, InterruptedException {

        String uri = "https://www.postman-echo.com/get?uname=jyoti&pwd=12131";

        HttpRequest req = HttpRequest.newBuilder()
            //HttpRequest: This class encapsulates HTTP request's URI, headers and body.
            // This builder helps us to prepare HttpRequest object.
            // The instance of this builder is create by invoking HttpRequest.newBuilder().
            .uri(URI.create(uri))
            .GET().version(Version.HTTP_2)
            .build();

        HttpClient client = HttpClient.newBuilder() //This class is used to send HTTP requests and to receive their responses.
            .build();
        HttpResponse<String> resp = client.send(req, BodyHandlers.ofString());
             System.out.println(resp.statusCode());
             System.out.println(resp.body());

        //HttpResponse : The instance of this class is returned as a result of sending an HttpRequest.
        // For example HttpResponse.BodyHandler<T> is used to read the response body.
        // It implements various useful handlers, such as handling the response body as a String, or streaming the response body to a file.

    }
}