package org.example.module3.lesson10;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

// POST: https://gorest.co.in/public/v2/users?page=1&per_page=10&....

public class URIBuilder {
    private String url;
    private String resource;

    private final List<QueryParameter> queries = new ArrayList<>();


    private URIBuilder() {
    }

    public static URIBuilder builder() {
        return new URIBuilder();
    }

    public URIBuilder withURL(String url) {
        this.url = url;

        return this;
    }

    public URIBuilder withResource(String resource) {
        this.resource = resource;

        return this;
    }

    public URIBuilder withQueryParameter(QueryParameter queryParameter) {
        this.queries.add(queryParameter);

        return this;
    }

    public URI build() {
        String link = new StringBuilder()
                .append(url)
                .append(resource)
                .append(queries())
                .toString();

        System.out.println("link: " + link);
        return URI.create(link);
    }

    private String queries() {
        if (queries.isEmpty()) {
            return "";
        }
        StringBuilder builder = new StringBuilder("?");

        queries.forEach(item -> builder.append(item.query() + "&"));

        return builder.toString();
    }


}
