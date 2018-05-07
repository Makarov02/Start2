


import static org.junit.Assert.assertEquals;
import start.FrameForAdminPassword;

public class FrameForAdminPasswordMaxTest {

    @org.junit.Test
    public void passwordTrue() {
        assertEquals(true,new FrameForAdminPassword().password("max"));
    }
    @org.junit.Test
    public void passwordFalse() {
        assertEquals(false,new FrameForAdminPassword().password("ewqrtt"));
    }
}