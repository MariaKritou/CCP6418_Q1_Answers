
// checking all imports might be helpful

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
public class LineTest {

    Line line;

    @Before
    public void createCalc(){
        line = new Line();
    }

    @org.junit.Test
    public void testLinePoint1() {

        assertEquals("wrong result",6, line.linePoint(2,2,2));
    }

    @org.junit.Test
    public void testLinePoint2() {

        assertEquals("wrong result",0, line.linePoint(0,0,0));
        assertEquals("wrong result",0, line.linePoint(0,2,2));
        assertEquals("wrong result",0, line.linePoint(2,2,0));

    }



    @Test
    public void testCalculate1() {

        int[] arr = {1, 2};
        int[] arrs = {2, 3};

        line.calculate(1, arr, 1);
        assertArrayEquals(arrs, arr);

    }

    @Test
    public void testCalculate2() {

        int[] arr = {0, 0};
        int[] arrs = {1, 1};

        line.calculate(1, arr, 1);
        assertArrayEquals(arrs, arr);

    }

}