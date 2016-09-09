public class Event{
  private int mTotalCost;
  private int mNumberOfGuests;
  private boolean mFood;
  private int mFoodType;
  private boolean mDrinks;
  private boolean mEntertainment;

  public Event(){
    mTotalCost = 500;
  }
  public int getTotalCost(){
    return mTotalCost;
  }
  public void setNumberOfGuests(int num){
    mNumberOfGuests = num;
  }
  public void setFood(char food){
    mFood = food =='y';
  }
  public boolean getFood(){
    return mFood;
  }
  public void setFoodType(int choice){
    if(choice == 1){
      mFoodType = 5;
    }else{
      mFoodType = 15;
    }
  }
  public void setDrinks(char drinks){
    mDrinks = drinks == 'y';
  }
  public void setEntertainment(char entertainment){
    mEntertainment = entertainment == 'y';
  }
  public void setTotalCost(){
    int total = 0;
    if(mDrinks){
      total += (10 * mNumberOfGuests);
    }
    if(mFood){
      total += (mFoodType * mNumberOfGuests);
    }
    if(mEntertainment){
      total += 1000;
    }
    mTotalCost += total;
  }
}
