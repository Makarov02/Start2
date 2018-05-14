import start.FrameForAdminPassword;

        import static org.junit.Assert.assertEquals;


public class FrameForAdminPasswordAnyaTest1 {

    @org.junit.Test
    public void passwordTrue() {
        assertEquals(true,new FrameForAdminPassword().password("anya"));
    }
}


