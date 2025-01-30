
import deber.codigo.CustomerService;
import deber.codigo.Incident;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
public class CustomerServiceTest {

    private CustomerService customerService;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        customerService = new CustomerService();
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testHandleLowIncident() {
        Incident incident = new Incident("Login issue", "low");
        customerService.handle(incident);
        assertTrue(outputStream.toString().trim().contains("Customer Service handling incident: Login issue"));
    }

    @Test
    void testHandleUnknownIncident() {
        Incident incident = new Incident("Database issue", "unknown");
        customerService.handle(incident);
        assertEquals("", outputStream.toString().trim());
    }
}
