package org.example;

import org.junit.jupiter.api.Test;

public class ListProductCommandTest {

    @Test
    public void testExecuteReturnsProducts() {
        ListProductCommand command = new ListProductCommand();
        command.run();
    }
}