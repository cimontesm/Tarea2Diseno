
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
public class BalconyCabinTest {

    private Cabin balconyCabin;

    @BeforeEach
    void setUp() {
        balconyCabin = new BalconyCabin();
    }

    @Test
    void testSetType() {
        balconyCabin.setType("Balcony");
        assertEquals("Balcony", balconyCabin.getType());  // Verifica que el tipo de cabina se establezca como "Balcony"
    }
}
