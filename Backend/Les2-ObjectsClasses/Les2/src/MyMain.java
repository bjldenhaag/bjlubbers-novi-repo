import java.util.ArrayList;
import java.util.Arrays;

public class MyMain {

    public static void main(String[] args) {

        Room r = new Room("Bedroom");
        System.out.println(r.getName());

        House h = new House("Dorpstraat 12");
        h.addRoom(r);
        h.addRoom(new Room("Kitchen"));

        Room r2 = new Room();
        r2.setName("Attic");
        h.addRoom(r2);

        System.out.println(h);

//        String[] colours = { "Red", "Green", "Blue" };
//        ArrayList<String> l = new ArrayList<>(Arrays.asList(colours));
//
//        System.out.println(l);
    }
}
