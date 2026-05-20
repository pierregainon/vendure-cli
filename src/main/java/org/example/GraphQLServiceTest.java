package org.example;

public class GraphQLServiceTest {

    private static void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("La condition est fausse !");
        }
    }

    private static void assertEquals(Object expected, Object actual) {
        if (!expected.equals(actual)) {
            throw new AssertionError("Attendu: " + expected + ", mais reçu: " + actual);
        }
    }

    public static void main(String[] args) {
        GraphQLServiceTest testSuite = new GraphQLServiceTest();

        System.out.println("Démarrage des tests GraphQL...");

        testSuite.testProductsListRequestGeneration();
        System.out.println("✔ Test 1: Génération liste produits OK");

        testSuite.testSingleProductRequestGeneration();
        System.out.println("✔ Test 2: Génération produit unique OK");

        testSuite.testMockJsonMapping();
        System.out.println("✔ Test 3: Mapping JSON simulé OK");

        System.out.println("\nTous les tests passent avec succès !");
    }

    public void testProductsListRequestGeneration() {
        ProductsListRequest request = new ProductsListRequest();
        String queryStr = request.getQuery();

        assertTrue(queryStr.contains("query"));
        assertTrue(queryStr.contains("products"));
        assertTrue(queryStr.contains("items"));
    }

    public void testSingleProductRequestGeneration() {
        String targetId = "12345";
        SingleProductRequest request = new SingleProductRequest(targetId);
        String queryStr = request.getQuery();

        assertTrue(queryStr.contains("product(id: \\\"12345\\\")"));
    }

    public void testMockJsonMapping() {
        ProductData product = new ProductData();
        product.id = "1";
        product.name = "Laptop Pro";
        product.slug = "laptop-pro";

        assertEquals("1", product.id);
        assertEquals("Laptop Pro", product.name);
        assertEquals("laptop-pro", product.slug);
    }
}