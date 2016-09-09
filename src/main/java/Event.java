// import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;

public class Event{
  private int mTotalCost;
  private int mNumberOfGuests;
  private boolean mFood;
  private boolean mDrinks;
  private boolean mEntertainment;

  public Event(){
    mTotalCost = 500;
  }
  public int getTotalCost(){
    return mTotalCost;
  }
  public int setNumberOfGuests(int num){
    mNumberOfGuests = num;
    return mNumberOfGuests;
  }
  public boolean setFood(char food){
    mFood = food =='y';
    return mFood;
  }
  public boolean setDrinks(char drinks){
    mDrinks = drinks == 'y';
    return mDrinks;
  }
  public boolean setEntertainment(char entertainment){
    mEntertainment = entertainment == 'y';
    return mEntertainment;
  }
  public void setTotalCost(){
    int total = 0;
    if(mDrinks == true){
      total += (10 * mNumberOfGuests);
    }
    if(mEntertainment == true){
      total += (15 * mNumberOfGuests);
    }
    mTotalCost += total;
  }
}
