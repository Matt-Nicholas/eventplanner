import org.junit.*;
import static org.junit.Assert.*;


public class EventTest{

    @Test
    public void setTotalCost_calculatesTotalCost_100(){
      Event testEvent = new Event();
      int expectedOutput = 100;
      expectedOutput.add(1);
      assertEquals(expectedOutput, testEvent.setTotalCost(1));
    }
}
