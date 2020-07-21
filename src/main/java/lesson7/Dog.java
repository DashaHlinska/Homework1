package lesson7;

public class Dog {
    String name;
    String species;
    int age;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, String species) {
        this.name = name;
        this.species = species;
    }


    public Dog(String name, String species, int age) {
        this(name, species);
        this.age = age;
    }

    public Dog() {

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

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog {" +
                "name ='" + name + '\'' +
                ", species ='" + species + '\'' +
                ", age =" + age +
                '}';
    }
}
