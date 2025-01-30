
import deber.codigo.BalconyCabinFactory;
import deber.codigo.Cabin;
import deber.codigo.CabinFactory;
import deber.codigo.FamilyCabinFactory;
import deber.codigo.InteriorCabinFactory;
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
class CabinFactoryTest {
    private CabinFactory balconyFactory;
    private CabinFactory familyFactory;
    private CabinFactory interiorFactory;

    @BeforeEach
    void setUp() {
        balconyFactory = new BalconyCabinFactory();
        familyFactory = new FamilyCabinFactory();
        interiorFactory = new InteriorCabinFactory();
    }

    @Test
    void testBalconyCabinCreation() {
        Cabin cabin = balconyFactory.createCabin();
        assertEquals("Balcony", cabin.getType());
    }

    @Test
    void testFamilyCabinCreation() {
        Cabin cabin = familyFactory.createCabin();
        assertEquals("Family", cabin.getType());
    }

    @Test
    void testInteriorCabinCreation() {
        Cabin cabin = interiorFactory.createCabin();
        assertEquals("Interior", cabin.getType());
    }
}
