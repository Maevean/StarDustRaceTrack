import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        System.out.println("\t\t Main Menu \n");
        System.out.println("\t\t Type and Enter 1 to start or any other button to quit \n");
        Scanner scan = new Scanner(System.in);
        int startQuit = scan.nextInt();
            if (startQuit == 1){ //get this figured out
                System.out.println("\t\t\t\t----------------------------");
                System.out.println("\t\t\t\t|        Welcome To        |");
                System.out.println("\t\t\t\t|  *Star Dust Race Track*  |");
                System.out.println("\t\t\t\t----------------------------");
            }
            else {
                System.exit(0);
            }
        //****Do an intro on  how to play****
        System.out.println("What is your name?\n");
        Scanner input2 = new Scanner(System.in);
        String usrName = input2.nextLine();
        System.out.println("\tHello and welcome " + usrName + "!");
         try{
             //causing a break between posts
            Thread.sleep(600);
         } catch (InterruptedException e){
             
         }
        Enterance enterance = new Enterance("Enterance");
        enterance.PeopleInRoom();
        enterance.EInfo();
        System.out.println("They wave and say hi " + usrName + "!");
        System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        try{
             //causing a break between posts
            Thread.sleep(5000);
         } catch (InterruptedException e){
             
         }
        
         
        
        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        System.out.println("\n\n Feeling slightly hungry you head to the Eatery to grab a bite to eat");
        Eatery eatery = new Eatery("Eatery");
        eatery.LockStatus();
        System.out.println("You take out a key and unlock the door");
        eatery.UnlockDoor();
        eatery.PeopleInRoom();
        eatery.EatInfo();
        Scanner inp = new Scanner(System.in);
            int eats = inp.nextInt();
            
            if (eats == 1){       
                System.out.println("You grab a hot dog and smother it with your favorite toppings");
            }
            else if(eats ==2){
                System.out.println("You grab a burger and smother it with your favorite toppings");
            }
            else if (eats==3){
                System.out.println("You grab 2 slices of pizza and covered with your favorite toppings");
            }
            else if (eats==4){
                System.out.println("You grab a couple tacos and pile up your favorite toppings");
            }
            else{
                System.out.println("Not really wanting to eat anything particular, you just grab a random food.");
            }
        System.out.println("You sit down and eat and people start floodiing in to grab a bite before the race begins.");
        System.out.println("\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
        
        System.out.println("\n\n You walk from the main room down the hall to a door");
        System.out.println("a sign to the left of it says Garage. You try the handle.");
        Garage garage = new Garage("Garage");
        garage.UnlockDoor();
        garage.PeopleInRoom();
        garage.GInfo();
        
        
        System.out.println("You see some familiar faces.");
        System.out.println("Hey " + usrName + "!");
        System.out.println("What's up " + usrName + "?");
        System.out.println("Nice to see ya, " + usrName + "!");
        
        
        
    }
}