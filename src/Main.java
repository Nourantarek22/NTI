import java.util.HashMap; //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();
        hotel.addRoom(new StandardRoom("101", 200));   // Create Standard Room
        hotel.addRoom(new DeluxeRoom("102", 300));     // Create Deluxe Room
        hotel.addRoom(new SuiteRoom("103", 500));      // Create Suite Room

        hotel.bookroom("101", new SpaService());       // Add Spa service to Standard Room
        hotel.bookroom("102", new DiningService());    // Add Dining service to Deluxe Room
        hotel.bookroom("103", new GymService());       // Add Gym service to Suite Room



//        // Display booking details
//        hotel.displayBookingDetails("101");
//        hotel.displayBookingDetails("102");
//        hotel.displayBookingDetails("103");


    }
}