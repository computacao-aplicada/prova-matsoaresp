import static org.junit.Assert.assertFalse;
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

    @Test
    void deveRejeitarEntradasInvalidas() {
        assertFalse(Validador.validarCPF(null));
        assertFalse(Validador.validarCPF(""));
        assertFalse(Validador.validarCPF("529.982.247-2X"));
        assertFalse(Validador.validarCPF("00000000000"));
    }

    @Test
    void deveRejeitarDVIncorreto() {
        assertFalse(Validador.validarCPF("935.411.347-8"));
        assertFalse(Validador.validarCPF("935.411.347-800"));
    }


    @Test
    void deveValidarDVS() {
        assertTrue(Validador.validarCPF("123.456.789-09"));
        assertFalse(Validador.validarCPF("123.456.789-08"));
    }


}