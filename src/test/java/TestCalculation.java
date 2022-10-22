import org.junit.Calculation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestCalculation {
    static Calculation cal;

    @BeforeEach
    public void init(){
        cal = new Calculation();
    }

    @Test
    public void addTest1(){
        assertEquals(cal.add(10,20), 30);
    }

    @Test
    public void gtTest1(){
        assertFalse(cal.gt(20, 30));
    }

    @Test
    public void gtTest2(){
        assertTrue(cal.gt(20, 15));
    }

    @Nested
    class AddTest {

        @Test
        void addPos() {
            assertEquals(cal.add(1, 2), 3);
        }

        @Test
        void addNeg(){
            assertEquals(cal.add(-10, -30), -40);
        }

        @Test
        void addPosNeg(){
            assertEquals(cal.add(-100, 300), 200);
        }

    }

    @Test
    void mulTest(){
        assertAll(
                ()->assertEquals(0, cal.mul(0,30)),
                ()->assertEquals(1, cal.mul(1,1)),
                ()->assertEquals(2, cal.mul(1,2))
        );
    }

    @Test
    void divTest(){
        assertThrows(ArithmeticException.class, () -> cal.divide(1,0), "Denominator should not be 0");
    }



}
