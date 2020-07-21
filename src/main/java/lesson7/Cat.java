package lesson7;

public class Cat {
    String name;
    String species;
    int age;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public Cat(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public Cat() {
        
    }
}
