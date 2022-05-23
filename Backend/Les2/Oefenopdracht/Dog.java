public class Dog {
    private String name;
    private final String species;
    private int age;
    private final Gender sex;

    public Dog(String name, String species, int age, Gender sex) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getSex() {
        return sex;
    }
}
