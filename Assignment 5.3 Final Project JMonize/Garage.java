public class Garage extends Rooms{
    
    public Garage(String therooms){
        super ("Garage", 20);
    }
    
    public void GInfo(){
    System.out.println(" You enter the garage room.");
    System.out.println("You see many different fancy race cars in many different colors");
    System.out.println("A lot of different people are hanging around getting pictures taken");
    System.out.println("or preparing for the race.");
    System.out.println(" The race is about to begin! You head out with the crowd to find your seat");
    System.out.println("People take their seats throughout the stadium");
    System.out.println("they are dressed in the colors matching their favorite race team,");
    System.out.println("they scream and shout noisily, the noises only drowned out");
    System.out.println("when the cars lapped near your seat.");
    
    try{
             //causing a break between posts
            Thread.sleep(5000);
         } catch (InterruptedException e){
             
         }
    }
}