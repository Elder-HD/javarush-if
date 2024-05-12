package org.example.module3.lesson10;

import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

public class Example1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://foo.com/"))
                .timeout(Duration.ofMinutes(2))
                .header("Content-Type", "application/json")
                .header("Content-Type2", "application/xml")
                .POST(HttpRequest.BodyPublishers.ofFile(Paths.get("file.json")))
                .build();

        HttpRequest.Builder builder = HttpRequest.newBuilder();
        builder.uri(URI.create("https://foo.com/"));
        builder.timeout(Duration.ofMinutes(2));
        builder.header("Content-Type", "application/json");
        builder.POST(HttpRequest.BodyPublishers.ofFile(Paths.get("file.json")));
        HttpRequest request2 = builder.build();


        HttpClient client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .followRedirects(HttpClient.Redirect.NORMAL)
                .connectTimeout(Duration.ofSeconds(20))
                .proxy(ProxySelector.of(new InetSocketAddress("proxy.example.com", 80)))
                .authenticator(Authenticator.getDefault())
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.statusCode());
        System.out.println(response.body());
    }
}
