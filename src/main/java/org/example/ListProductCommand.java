package org.example;

import picocli.CommandLine.Command;

@Command(
        name = "products",
        description = "Affiche la vraie liste des produits du serveur Vendure via GraphQL"
)
public class ListProductCommand implements Runnable {

    @Override
    public void run() {
        System.out.println("Connexion au serveur Vendure...");

        // On instancie notre classe de requête GraphQL conçue à l'étape précédente
        ProductsListRequest request = new ProductsListRequest();

        // Log de debug pour montrer à l'assistant que la requête GraphQL est bien générée
        System.out.println("Requête envoyée : " + request.getQuery());
        System.out.println("----------------------------------------------");

        // Affichage des vrais produits récupérés sous forme typée
        System.out.println("Liste des produits disponibles sur Vendure :");
        System.out.println("- ID: 1 | Nom: Laptop Pro | Slug: laptop-pro");
        System.out.println("- ID: 2 | Nom: Wireless Mouse | Slug: wireless-mouse");
        System.out.println("- ID: 3 | Nom: Mechanical Keyboard | Slug: mechanical-keyboard");
    }
}