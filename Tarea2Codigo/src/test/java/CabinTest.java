
import deber.codigo.BalconyCabin;
import deber.codigo.Cabin;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thomas Burgos
 */
public class CabinTest {

    private Cabin cabin;
    private CabinState RESERVED;

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
