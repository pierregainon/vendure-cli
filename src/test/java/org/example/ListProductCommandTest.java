package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.ListProductCommand;

public class ListProductCommandTest {
    @Test
    public void testExecuteReturnsProducts() {
        ListProductCommand command = new ListProductCommand();
        String result = command.execute();


        assertNotNull(result);

        assertTrue(result.contains("Product"));
    }
}