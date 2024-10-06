import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// Abstract Room class
public abstract class Room {
    private String roomNumber;
    private double baseRate;
    private List<Service> services;
    private boolean isAvailable;

    public Room(String roomNumber, double baseRate) {
        this.roomNumber = roomNumber;
        this.baseRate = baseRate;
        this.services = new ArrayList<>();
        this.isAvailable = true;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    // Add a service to the room
    public void addService(Service service) {
        services.add(service);
    }

    // Remove a service from the room
    public void removeService(Service service) {
        services.remove(service);
    }

    // Get the total cost of the room, including services
    public double getTotalCost() {
        double totalCost = baseRate;
        for (Service service : services) {
            totalCost += service.Getcost();
        }
        return totalCost;
    }

    // Abstract method to get the room description
    public abstract String getDescription();

    public String getRoomNumber() {
        return roomNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // Get booking details
    public void displayBookingDetails() {
        System.out.println("Booking for " + getDescription() + " - Room " + roomNumber);
        System.out.println("Total Cost: $" + getTotalCost());
    }
}