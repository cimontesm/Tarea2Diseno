
import deber.codigo.Crucero;
import java.util.Date;
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
public class CruceroTest {

    private Crucero crucero;

    @BeforeEach
    void setUp() {
        crucero = new Crucero();
        crucero.setId(1);
        crucero.setNombre("Ocean Explorer");
        crucero.setDestino("Caribe");
        crucero.setDuracion(7);
        crucero.setFechaSalida(new Date());
    }

    @Test
    void testObtenerDetalles() {
        String detalles = crucero.obtenerDetalles();
        assertTrue(detalles.contains("Ocean Explorer") && detalles.contains("Caribe"));
    }

    @Test
    void testBuscarCrucero() {
        assertTrue(crucero.buscarCrucero().isEmpty());
    }
}
