


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import start.FrameForAdmin;

public class FrameForAdminTest {


    @Test
    public void numberForButton2() {
        assertEquals(3600,new FrameForAdmin().numberForButton(2,2));
    }
}