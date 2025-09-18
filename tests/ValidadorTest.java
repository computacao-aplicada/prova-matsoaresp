import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class ValidadorTest {

    Validador validador = new Validador();

    @Test
    void deveValidarCPFValido() {
        assertTrue(Validador.validarCPF("529.982.247-25"));
        assertTrue(Validador.validarCPF("52998224725"));
    }
}
