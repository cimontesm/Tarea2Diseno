
import deber.codigo.BalconyCabinFactory;
import deber.codigo.Cabin;
import deber.codigo.CabinFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
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
public class BalconyCabinFactoryTest {

    private CabinFactory cabinFactory;

    @BeforeEach
    void setUp() {
        cabinFactory = new BalconyCabinFactory();
    }

    @Test
    void testCreateCabin() {
        Cabin cabin = cabinFactory.createCabin();
        assertNotNull(cabin);  // Verifica que la cabina no sea nula
        assertEquals("Balcony", cabin.getType());  // Verifica que el tipo de cabina sea "Balcony"
    }
}
