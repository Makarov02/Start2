import org.junit.Test;
import start.FrameForWorker;

import static org.junit.Assert.assertEquals;

public class FrameForWorkerTest1 {
    @Test
    public void calculationsLoad() {
        assertEquals(100,new FrameForWorker().calculationsLoad(10000,15000,"Xerox Phaser 3020BI"),0.001);
    }
}
