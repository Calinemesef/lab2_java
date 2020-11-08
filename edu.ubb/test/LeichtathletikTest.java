import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeichtathletikTest {
    private Hochsprung h;
    private Hindernislauf hi;
    private Leichtathletik l;
    @BeforeEach
    void setUp() {
        h = new Hochsprung();
        hi = new Hindernislauf();
        l = new Leichtathletik();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void kalkuliereZeit() {
        assertEquals(h.kalkuliereZeit(), 20);
        assertEquals(hi.kalkuliereZeit(), 30);
        assertEquals(l.kalkuliereZeit(),0);
    }
}