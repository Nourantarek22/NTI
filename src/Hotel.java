import java.util.HashMap;
public class Hotel {

    private HashMap<String, Room> rooms;

    public Hotel() {
        this.rooms = new HashMap<>();
    }

    //add newroom to the hotel
    public void addRoom(Room room)
    {
      rooms.put(room.getRoomNumber(),room);
    }
    public Room getRoom(String roomNumber)
    {
            return rooms.get(roomNumber);
    }

    public void bookroom(String roomNumber , Service service){
        Room room = rooms.get(roomNumber);
        if(room!=null){
            if(room.isAvailable()){
                room.addService(service);
                //set room that is not avalible after booking
                room.setAvailable(false);
                System.out.println("Added" +service.GetName() + "service to " + room.getDescription() +"_Room " + roomNumber);
            }
            else{
                System.out.println("Room " + roomNumber + " is not available");
            }
        }else{
            System.out.println("Error: Room" + roomNumber + " doesnot exist");
        }

    }

    public void displayBookingDetails(String roomNumber){
        Room room = rooms.get(roomNumber);
        if(room!=null){
            room.displayBookingDetails();
        }else {
            System.out.println("Error: Room " + roomNumber + " doesnot exist");
        }
    }

    // Make a room available again (checkout)
    public void makeRoomAvailable(String roomNumber) {
        Room room = rooms.get(roomNumber);
        if (room != null) {
            room.setAvailable(true);
            System.out.println("Room " + roomNumber + " is now available.");
        } else {
            System.out.println("Error: Room " + roomNumber + " does not exist!");
        }
    }


}
