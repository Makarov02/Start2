


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import start.FrameForWorker;

public class FrameForWorkerTest {

	@Test
    public void calculationsPaper() {
        assertEquals(2.0,new FrameForWorker().calculationsPaper(500,500),0.001);
    }

    @Test
    public void calculationsCartridge() {
        assertEquals(1,new FrameForWorker().calculationsCartridge(500,1000),0.001);
    }


}