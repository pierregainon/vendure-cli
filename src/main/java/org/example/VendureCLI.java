package org.example;

import picocli.CommandLine;

public class VendureCLI {
    public static void main(String[] args) {
        String envUrl = System.getenv("URL");

        CommandLine cmd = new CommandLine(new ListProductCommand());

        int exitCode = cmd.execute(args);
        System.exit(exitCode);
    }
}