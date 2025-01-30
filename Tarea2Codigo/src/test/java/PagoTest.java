
import deber.codigo.Pago;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thomas Burgos
 */
public class PagoTest {
    @Test
    void testProcesarPago() {
        Pago pago = new Pago(1, 200.0);
        assertTrue(pago.procesarPago());
        assertEquals("Confirmado", pago.getEstado());
    }

    @Test
    void testCancelarPago() {
        Pago pago = new Pago(2, 150.0);
        assertTrue(pago.cancelarPago());
        assertEquals("Cancelado", pago.getEstado());
    }
}