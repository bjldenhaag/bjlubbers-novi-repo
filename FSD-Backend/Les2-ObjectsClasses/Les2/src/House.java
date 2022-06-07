import java.util.ArrayList;
import java.util.List;

public class House {
    // veld
    private String address;
    private ArrayList<Room> rooms = new ArrayList<>();

    // constructor
    public House(String address) {
        this.address = address;
    }

    public void addRoom(Room r) {
        rooms.add(r);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return rooms.toString();
    }
}
