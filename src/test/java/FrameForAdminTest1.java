import org.junit.Test;
import start.FrameForAdmin;

import static org.junit.Assert.assertEquals;

public class FrameForAdminTest1 {
    @Test
    public void numberForButton1() {
        assertEquals(1800,new FrameForAdmin().numberForButton(1,1));
    }
}
