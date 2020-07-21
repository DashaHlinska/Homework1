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
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public Dog() {

    }
}
