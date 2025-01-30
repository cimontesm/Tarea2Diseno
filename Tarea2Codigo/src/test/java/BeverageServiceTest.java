
import deber.codigo.BasicBooking;
import deber.codigo.BeverageService;
import deber.codigo.BookingService;
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
public class BeverageServiceTest {
    private BookingService basicBooking;
    private BookingService beverageService;

    @BeforeEach
    void setUp() {
        basicBooking = new BasicBooking();
        beverageService = new BeverageService(basicBooking);
    }

    @Test
    void testCalculateCost() {
        double cost = beverageService.calculateCost();
        assertEquals(120.0, cost);  // El costo base (100.0) más el costo del servicio de bebida (20.0)
    }

    @Test
    void testGetDescription() {
        String description = beverageService.getDescription();
        assertEquals("Basic Cabin Booking + Beverage Service", description);  // Descripción base + servicio de bebida
    }
}

