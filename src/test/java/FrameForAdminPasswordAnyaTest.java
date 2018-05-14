


import static org.junit.Assert.assertEquals;
import start.FrameForAdminPassword;

public class FrameForAdminPasswordAnyaTest {

    @org.junit.Test
    public void passwordFalse() {
        assertEquals(false,new FrameForAdminPassword().password("adsdasd"));
    }
}