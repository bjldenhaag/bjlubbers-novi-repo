public class Main2 {
    public static void main(String[] args) {
        Rabbit r = new Rabbit();
        r.eatPlants();

        Tiger t = new Tiger();
        t.eatMeat();

        Bear b = new Bear();
        b.eatMeat();
        b.eatPlants();
    }
}
