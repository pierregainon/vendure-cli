import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ListProductCommandTest {
    @Test
    public void testExecuteReturnsProducts() {
        ListProductCommand command = new ListProductCommand();
        String result = command.execute();

        // On s'attend à ce que le résultat ne soit pas vide
        assertNotNull(result);
        // On vérifie qu'il contient un mot clé, par exemple "Product"
        assertTrue(result.contains("Product"));
    }
}