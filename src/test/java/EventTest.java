import org.junit.*;
import static org.junit.Assert.*;


public class EventTest{

    Event testEvent = new Event();

    @Test
    public void setNumberOfGuests_setsNumberOfGuestsAttendingTheEvent_100(){
      int expectedOutput = 100;
      testEvent.setNumberOfGuests(100);
      assertEquals(expectedOutput, testEvent.getNumberOfGuests());
    }
    @Test
    public void setDrinks_returnsBoolTrueIfDrinksAreSelected_true(){
      boolean expectedOutput = true;
      testEvent.setDrinks('y');
      assertEquals(expectedOutput, testEvent.getDrinks());
    }
    @Test
    public void setEntertainment_returnsBoolTrueIfEntertainmentAreSelected_true(){
      boolean expectedOutput = true;
      testEvent.setEntertainment('y');
      assertEquals(expectedOutput, testEvent.getEntertainment());
    }
    @Test
    public void setFood_returnsBoolTrueIfFoodAreSelected_true(){
      boolean expectedOutput = true;
      testEvent.setFood('y');
      assertEquals(expectedOutput, testEvent.getFood());
    }
    @Test
    public void setFoodType_returnFoodTypeChosen_1(){
      int expectedOutput = 5;
      testEvent.setFoodType(1);
      assertEquals(expectedOutput, testEvent.getFoodType());
    }
    @Test
    public void setTotalCost_returnsTotalCost_499(){
      int expectedOutput = 499;
      testEvent.setTotalCost();
      assertEquals(expectedOutput, testEvent.getTotalCost());
    }
}
