public class DogOwner {
    private String name;
    private Gender sex;
    private Dog dog;

    public DogOwner(String name, Gender sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void ageDog() {
        if (this.dog != null) {
            int age = dog.getAge();
            age++;
            dog.setAge(age);
        }
        else
        {
            System.out.println("Has no dog yet!");
        }
    }

    @Override
    public String toString() {
        return this.name + " heeft een " + (dog.getSex() == Gender.Male ? "reu" : "teef") + ", deze is " + dog.getAge() + " jaar oud en van het soort: " +
        dog.getSpecies() + ". De hond heet: " + dog.getName();
    }
}
