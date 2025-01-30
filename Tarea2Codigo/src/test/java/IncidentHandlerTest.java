
import deber.codigo.CustomerService;
import deber.codigo.Incident;
import deber.codigo.Manager;
import java.io.ByteArrayOutputStream;
import deber.codigo.IncidentHandler;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thomas Burgos
 */
public class IncidentHandlerTest {
    private Manager manager;
    private CustomerService customerService;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    void setUp() {
        manager = new Manager();
        customerService = new CustomerService();
        customerService.setNext(manager); // Configuración de la cadena de responsabilidad
        
        // Redirigir salida para verificar prints
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testCustomerServiceHandlesLowIncident() {
        Incident lowIncident = new Incident("Login issue", "low");
        customerService.handle(lowIncident);
        
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Customer Service handling incident: Login issue"));
    }

    @Test
    void testManagerHandlesHighIncident() {
        Incident highIncident = new Incident("Server down", "high");
        customerService.handle(highIncident); // Pasará al Manager por la cadena de responsabilidad
        
        String output = outputStream.toString().trim();
        assertTrue(output.contains("Manager handling incident: Server down"));
    }

    @Test
    void testNoHandlerForUnknownLevel() {
        Incident unknownIncident = new Incident("Strange error", "medium");
        customerService.handle(unknownIncident); // No debería haber salida
        
        String output = outputStream.toString().trim();
        assertEquals("", output);
    }
}
