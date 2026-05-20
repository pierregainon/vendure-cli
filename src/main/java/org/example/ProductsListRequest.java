package org.example;

public class ProductsListRequest implements GraphQLRequest {
    @Override
    public String getQuery() {
        return "{\"query\": \"query { products { items { id name } } }\"}";
    }
}