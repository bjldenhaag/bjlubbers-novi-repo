public class Room {
    // veld
    private String name;

    // constructor
    public Room() { }

    public Room(String name) {
        this.name = name;
    }

    // method / getter
    public String getName() {
        return this.name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
