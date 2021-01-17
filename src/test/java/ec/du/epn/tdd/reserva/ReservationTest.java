package ec.du.epn.tdd.reserva;

import org.junit.*;

import static org.junit.Assert.*;

public class ReservationTest {
    Reservation r;

    @BeforeClass
    public static void setUpClass() {
        System.out.println("setUpClass()");
    }


    @Before
    public void setUp() {
        System.out.println("setUp()");
        r = new Reservation();
    }

    @Test
    public void disponibility_reservation_ok(){
        System.out.println("Test 1");
        assertEquals(1, r.reser("2021-10-2","10:00",2));
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }


}