import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console cnsl = System.console();
    Event newEvent = new Event();

    System.out.println("-----------------------------------------------");
    System.out.println("** Welcome to Matt's event planning service! **");
    System.out.println("-----------------------------------------------");
    System.out.println("How many people will be attending this event?");
    newEvent.setNumberOfGuests(Integer.parseInt(cnsl.readLine()));
    System.out.println("Would you like us to supply the food?\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setFood(cnsl.readLine().charAt(0));
    if(newEvent.getFood()){
      System.out.println("Choose one of the following food options:\nEnter (1) for a basic snack bar ($5 per person):\nEnter (2) for a 4 course meal ($15 per person):");
      newEvent.setFoodType(Integer.parseInt(cnsl.readLine()));
    }
    System.out.println("Would you like to take advatage of our full bar? The cost is $10 per person.\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setDrinks(cnsl.readLine().charAt(0));
    System.out.println("Would you like us to supply the Entertainment? We have an excellent house band and the cost is $1000 for the night.\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setEntertainment(cnsl.readLine().charAt(0));
    newEvent.setTotalCost();
    System.out.println("----------------------------------------");
    System.out.println("Great we'll get that all set up for you!\nYour total is: $" + newEvent.getTotalCost());
    System.out.println("----------------------------------------");
  }
}
