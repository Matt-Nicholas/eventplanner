import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console cnsl = System.console();
    Event newEvent = new Event();

    printSign();
    System.out.println("How many people will be attending this event?");
    newEvent.setNumberOfGuests(Integer.parseInt(cnsl.readLine()));
    System.out.println("----------------------------------------");
    System.out.println("Would you like us to supply the food?\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setFood(cnsl.readLine().charAt(0));
    if(newEvent.getFood()){
      System.out.println("----------------------------------------");
      System.out.println("Choose one of the following food options:\nEnter (1) for a basic snack bar ($5 per person):\nEnter (2) for a 4 course meal ($15 per person):");
      newEvent.setFoodType(Integer.parseInt(cnsl.readLine()));
    }
    System.out.println("----------------------------------------");
    System.out.println("Would you like to take advatage of our full bar? The cost is $10 per person.\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setDrinks(cnsl.readLine().charAt(0));
    System.out.println("----------------------------------------");
    System.out.println("Would you like us to supply the Entertainment? We have an excellent house band and the cost is $1000 for the night.\nEnter (y) for yes:\nEnter (n) for no:");
    newEvent.setEntertainment(cnsl.readLine().charAt(0));
    newEvent.setTotalCost();
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    System.out.println("Great we'll get that all set up for you!\n\n");
    System.out.println("Number of guests: " + newEvent.getNumberOfGuests());
    System.out.printf("Food: ");
    if (newEvent.getFood()){
      if(newEvent.getFoodType() == 1){
        System.out.println("Snack bar");
      }else{
        System.out.println("Four course meal");
      }
    }else{
      System.out.println("No food");
    }
    System.out.printf("Drinks: ");
    if(newEvent.getDrinks()){
      System.out.println("Full bar");
    }else{
      System.out.println("BYOB");
    }
    System.out.printf("Entertainment: ");
    if(newEvent.getEntertainment()){
      System.out.println("House Band");
    }else{
      System.out.println("none");
    }
    System.out.println(\n"Your total is: $" + newEvent.getTotalCost());
    System.out.println("----------------------------------------");
  }
  public static void printSign(){
    System.out.println("-----------------------------------------------");
    System.out.println("-----------------------------------------------");
    System.out.println("** Welcome to Matt's event planning service! **");
    System.out.println(" --------------------------------------------- ");
    System.out.println("     -------------------------------------     ");
    System.out.println("          ---------------------------          ");
    System.out.println("               -----------------               ");
    System.out.println("                    -------                    ");
    System.out.println("                      ---                      ");
    System.out.println("                       -                       ");
  }
}
