import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MannschaftssportTest {
    private Basketball b;
    private Fussball f;
    private Mannschaftssport m;

    @BeforeEach
    void setUp() {
        b = new Basketball();
        f = new Fussball();
        m = new Mannschaftssport();

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void kalkuliereZeit() {
        assertEquals(b.kalkuliereZeit(), 55);
        assertEquals(f.kalkuliereZeit(),65);
        assertEquals(m.kalkuliereZeit(),0);
    }
}