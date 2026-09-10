import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AddTest {

    @Test
    void testAdd() {
        Add add = new Add();

        assertEquals(5, add.add(2, 3));
    }
}
