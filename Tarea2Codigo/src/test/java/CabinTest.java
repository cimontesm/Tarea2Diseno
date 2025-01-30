
import static deber.codigo.CabinState.RESERVED;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CMONTES
 */
public class CabinTest {

    private Cabin cabin;
//    private CabinState RESERVED;

    @BeforeEach
    void setUp() {
        cabin = new BalconyCabin(); // Usamos una implementación concreta
    }

    @Test
    void testSetType() {
        cabin.setType("Balcony");
        assertEquals("Balcony", cabin.getType());
    }

    @Test
    void testSetState() {
        cabin.setState(RESERVED);
        assertEquals(RESERVED, cabin.getState());
    }

}
