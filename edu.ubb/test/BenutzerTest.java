import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    private Hochsprung h1;
    private Hindernislauf hl1;

    private Basketball b1;
    private Fussball f1;

    private Benutzer ben1, ben2;

    private Mannschaftssport m1;
    private Leichtathletik l1;

    @BeforeEach
    void setUp() {
        System.out.println("Run @Before");
        b1 = new Basketball();
        f1 = new Fussball();

        h1 = new Hochsprung();
        hl1 = new Hindernislauf();

        List<Sport> sports = List.of(b1, h1, hl1);
        List<Sport> sports2 = List.of(b1,f1);
        ben1 = new Benutzer("Test", "Test", sports);
        ben2 = new Benutzer("Test", "Test", sports2);

        m1=new Mannschaftssport();
        l1=new Leichtathletik();

    }

    @AfterEach
    void tearDown() {
        System.out.println("Run @After");
    }

    @Test
    void TestGetSet() {
        System.out.println("Run @Test GetSet");
        String vname = "Calin";
        String name = "Nemes";
        String vname2 = "Bogdan";
        String name2 = "Mozacu";
        List<Sport> s = List.of(b1, h1, hl1);
        List<Sport> s2 = List.of(b1, f1, hl1);
        ben1.setVorname(vname);
        ben2.setVorname(vname2);
        ben1.setName(name);
        ben2.setName(name2);
        ben1.setSport(s);
        ben2.setSport(s2);
        assertEquals(vname, ben1.getVorname());
        assertEquals(vname2, ben2.getVorname());
        assertEquals(name2, ben2.getName());
        assertEquals(name, ben1.getName());
        assertEquals(s, ben1.getSport());
        assertEquals(s2, ben2.getSport());
    }


    @Test
    void kalkuliereZeit() {
        assertNotEquals(ben1.kalkuliereZeit(), 55, 0.0);
        assertEquals(105, ben1.kalkuliereZeit());
        assertEquals(120, ben2.kalkuliereZeit());
    }

    @Test
    void kalkuliereDurchschnittszeit() {
        assertEquals(ben1.kalkuliereDurchschnittszeit(), 35);
        assertEquals(ben2.kalkuliereDurchschnittszeit(), 60);
    }

    @Test
    void testKalkuliereZeit() {
        assertEquals(ben1.kalkuliereZeit(b1), 55);
        assertEquals(ben2.kalkuliereZeit(b1), 55);
        assertEquals(ben2.kalkuliereZeit(f1), 65);
        assertEquals(ben1.kalkuliereZeit(m1), 55);
        assertEquals(ben2.kalkuliereZeit(m1), 120);
        assertEquals(ben2.kalkuliereZeit(l1), 0);
        assertEquals(ben1.kalkuliereZeit(l1), 50);

    }
}