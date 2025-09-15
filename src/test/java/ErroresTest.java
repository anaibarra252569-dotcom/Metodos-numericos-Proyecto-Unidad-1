/*
 * Metodos Numericos 
 * Ana Lila Ibarra Gamez 
 * 12 de septiembre del 2025
 */

import com.mycompany.proyectoerrores.CalculadoraErrores;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author allmi
 */
public class ErroresTest {
    
    
    @Test
    public void testErrorAbsoluto() {
        CalculadoraErrores calc = new CalculadoraErrores();
        double resultado = calc.calcularErrorAbsoluto(10, 8);
        assertEquals(2, resultado, 0.0001);
    }

    @Test
    public void testErrorRelativo() {
        CalculadoraErrores calc = new CalculadoraErrores();
        double resultado = calc.calcularErrorRelativo(10, 8);
        assertEquals(0.2, resultado, 0.0001);
    }

    @Test
    public void testErrorRelativoConCero() {
        CalculadoraErrores calc = new CalculadoraErrores();
        assertThrows(ArithmeticException.class, () -> {
            calc.calcularErrorRelativo(0, 5);
        });
    }
}
