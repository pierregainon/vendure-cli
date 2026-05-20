package org.example;

public class SingleProductRequest implements GraphQLRequest {
    private final String id;

    public SingleProductRequest(String id) {
        this.id = id;
    }

    @Override
    public String getQuery() {
        return "{\"query\": \"query { product(id: \\\"" + id + "\\\") { id name slug } }\"}";
    }
}