//Parent class for all rooms
public class Rooms{
    boolean IsRoomLocked = false;
    String theRooms;
    int PeopleInRoom;

    //constructors
    public Rooms(String therooms, int peopleInRoom){
        IsRoomLocked = false;
        theRooms = therooms;
        PeopleInRoom = peopleInRoom;
    }

    //method for unlocking door 
    public void UnlockDoor(){
        System.out.println("The door to " +theRooms+ " is not locked.");
        IsRoomLocked = false;
    }

    public void DoorLocked(){
        System.out.println("You lock the door to the " +theRooms+ ".");
        IsRoomLocked = true;
    }

    //Status of door
    public void LockStatus(){
        if(IsRoomLocked){
            System.out.println("The door is unlocked to the " + theRooms + ".");
        }else{
            System.out.println("The door is locked to the " +theRooms+ ".");
        }
    }

    public void PeopleInRoom(){
        System.out.println("There are currently " +PeopleInRoom+ " people in the " +theRooms+".");
    }
}