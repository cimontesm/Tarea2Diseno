
import deber.codigo.Itinerary;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
class ItineraryTest {
    private Itinerary itinerary;

    @BeforeEach
    void setUp() {
        itinerary = new Itinerary();
    }

    @Test
    void testModifyItinerary() {
        List<Date> newDates = Arrays.asList(new Date(), new Date());
        List<String> newDestinations = Arrays.asList("Bahamas", "Hawaii");
        assertTrue(itinerary.modifyItinerary(newDates, newDestinations));
    }
}