package org.example;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;

import java.util.concurrent.Callable;

@Command(name = "list", description = "Affiche les produits")
public class ListProductCommand implements Callable<Integer> {

    @Option(names = {"--url"}, description = "URL du serveur")
    private String url;

    @Option(names = {"--format"}, description = "Format : table ou json", defaultValue = "table")
    private String format;

    @Override
    public Integer call() {
        String finalUrl = (url != null) ? url : System.getenv("URL");

        System.out.println("Utilisation de l'URL : " + finalUrl);

        if ("json".equalsIgnoreCase(format)) {
            System.out.println("{ \"products\": [ {\"id\": 1, \"name\": \"Monitor\", \"price\": 150.0} ] }");
        } else {
            System.out.println("ID | Nom     | Prix");
            System.out.println("1  | Monitor | 150.0$");
        }
        return 0;
    }

    public String execute() {
        return "Product 1: Monitor - 150.0$";
    }
}