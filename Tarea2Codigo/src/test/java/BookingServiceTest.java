/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thomas Burgos
 */
import deber.codigo.BasicBooking;
import deber.codigo.BeverageService;
import deber.codigo.BookingService;
import deber.codigo.InRoomService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class BookingServiceTest {
    private BookingService basicBooking;
    private BookingService beverageService;
    private BookingService inRoomService;

    @BeforeEach
    void setUp() {
        basicBooking = new BasicBooking();
        beverageService = new BeverageService(basicBooking);
        inRoomService = new InRoomService(basicBooking);
    }

    @Test
    void testBasicBookingCost() {
        assertEquals(100.0, basicBooking.calculateCost());
        
    }
    
    @Test
    void testBeverageServiceCost() {
        assertEquals(120.0, beverageService.calculateCost());
    }
    
    @Test
    void testInRoomServiceCost() {
        assertEquals(130.0, inRoomService.calculateCost());
    }
}