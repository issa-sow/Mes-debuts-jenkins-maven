import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculeTest {
    static Calcule c = null;

    @BeforeAll
    static void init() {
        c = new Calcule();
    }

    @Test
    void sommeDeuxNombre() {
        Assertions.assertEquals(15, c.sommeDeuxNombre(5, 5));
    }

    @Test
    void mutltiplicationDeuxNombre() {
        Assertions.assertEquals(25, c.mutltiplicationDeuxNombre(5, 5));
    }
}