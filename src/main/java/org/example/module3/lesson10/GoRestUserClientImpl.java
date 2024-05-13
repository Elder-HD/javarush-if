package org.example.module3.lesson10;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class GoRestUserClientImpl implements GoRestUserClient {

    private static final String TOKEN = "1cf497f38db5ca3755c4f8576add04a9fc716e09364d6d3654351f261accfeb5";

    private static final String URL = "https://gorest.co.in/";
    private final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_1_1)
            .connectTimeout(Duration.ofMinutes(2))
            .followRedirects(HttpClient.Redirect.NORMAL)
            .build();

    private final Gson gson = new Gson();

    private final BearerToken bearerToken = new BearerToken(TOKEN);

    //GET: https://gorest.co.in/public/v2/users?page=1&per_page=100
    @Override
    public Response<List<User>> findAll(Page page) {
//        URI uri = URI.create(URL + "public/v2/users?" + page.query());

        URI uri = URIBuilder.builder()
                .withURL(URL)
                .withResource("public/v2/users")
                .withQueryParameter(page)
                .withQueryParameter(bearerToken)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String jsonBody = response.body();

            User[] users = gson.fromJson(jsonBody, User[].class);
            List<User> list = Arrays.asList(users);
            return new Response<>(list, statusCode, null);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // POST: https://gorest.co.in/public/v2/users
    @Override
    public Response<User> createNewUser(User user) {

//        URI uri = URI.create(URL + "public/v2/users");

        URI uri = URIBuilder.builder()
                .withURL(URL)
                .withResource("public/v2/users")
                .withQueryParameter(bearerToken)
                .build();

        String requestBody = gson.toJson(user);

        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(uri)
                .header("Content-type", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String body = response.body();
            User responseUser = null;
            try {
                responseUser = gson.fromJson(body, User.class);
            } catch (JsonSyntaxException e) {
                return new Response<>(responseUser, statusCode, body);
            }
            return new Response<>(responseUser, statusCode, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public Response<User> findUserById(Long id) {
        URI uri = URIBuilder.builder()
                .withURL(URL)
                .withResource("public/v2/users/" + id)
                .withQueryParameter(bearerToken)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            int statusCode = response.statusCode();
            String jsonBody = response.body();

            User user = gson.fromJson(jsonBody, User.class);
            return new Response<>(user, statusCode, null);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public Response<User> updateUserDetails(User user) {
        URI uri = URIBuilder.builder()
                .withURL(URL)
                .withResource("public/v2/users/" + user.getId())
                .withQueryParameter(bearerToken)
                .build();

        String requestBody = gson.toJson(user);

        HttpRequest request = HttpRequest.newBuilder()
                .PUT(HttpRequest.BodyPublishers.ofString(requestBody))
                .uri(uri)
                .header("Content-type", "application/json")
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            String body = response.body();
            User responseUser = null;
            try {
                responseUser = gson.fromJson(body, User.class);
            } catch (JsonSyntaxException e) {
                return new Response<>(responseUser, statusCode, body);
            }
            return new Response<>(responseUser, statusCode, null);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Response<Void> deleteById(Long id) {
        URI uri = URIBuilder.builder()
                .withURL(URL)
                .withResource("public/v2/users/" + id)
                .withQueryParameter(bearerToken)
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .DELETE()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = response.statusCode();
            return new Response<>(null, statusCode, null);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
