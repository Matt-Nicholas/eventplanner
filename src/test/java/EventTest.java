import org.junit.*;
import static org.junit.Assert.*;


public class EventTest{


    @Test
    public void setNumberOfGuests_setsNumberOfGuestsAttendingTheEvent_100(){
      Event testEvent = new Event();
      int expectedOutput = 100;
      assertEquals(expectedOutput, testEvent.setNumberOfGuests(100));
    }
    @Test
    public void setDrinks_returnsBoolTrueIfDrinksAreSelected_true(){
      Event testEvent = new Event();
      boolean expectedOutput = true;
      assertEquals(expectedOutput, testEvent.setDrinks('y'));
    }
    @Test
    public void setEntertainment_returnsBoolTrueIfEntertainmentAreSelected_true(){
      Event testEvent = new Event();
      boolean expectedOutput = true;
      assertEquals(expectedOutput, testEvent.setEntertainment('y'));
    }
    @Test
    public void setFood_returnsBoolTrueIfFoodAreSelected_true(){
      Event testEvent = new Event();
      boolean expectedOutput = true;
      assertEquals(expectedOutput, testEvent.setFood('y'));
    }

    @Test
    public void getTotalCost_returnsTotalCost_100(){
      Event testEvent = new Event();
      int expectedOutput = 3000;
      testEvent.setNumberOfGuests(100);
      testEvent.setDrinks('y');
      testEvent.setEntertainment('y');
      testEvent.setFood('y');
      testEvent.setTotalCost();
      assertEquals(expectedOutput, testEvent.getTotalCost());
    }
}
