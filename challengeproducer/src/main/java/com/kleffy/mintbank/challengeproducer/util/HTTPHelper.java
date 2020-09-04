package com.kleffy.mintbank.challengeproducer.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTPHelper {

    private final static HttpClient HTTP_CLIENT = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public static HttpResponse<String> sendGet(String url) throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create(url))
                .build();
        HttpResponse<String> response = HTTP_CLIENT.send(request, HttpResponse.BodyHandlers.ofString());
        return response;
    }
}
