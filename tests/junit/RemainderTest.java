package junit;

import junit.framework.TestCase;
import pass.Remainder;

public class RemainderTest extends TestCase {
    private Remainder remainder;

    protected void setUp() throws Exception{
        super.setUp();
        remainder = new Remainder();
    }

    protected void tearDown() throws Exception{
        super.tearDown();
    }

    public void testDivide() {
        this.assertEquals(remainder.remainder(5, 2), 1);
        this.assertEquals(remainder.remainder(5, 5), 0);
        this.assertEquals(remainder.remainder(15, 4), 3);
    }
}
