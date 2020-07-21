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
        this(name, species);
        this.age = age;
    }

    public Cat() {
        
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
        return "Cat {" +
                "name ='" + name + '\'' +
                ", species ='" + species + '\'' +
                ", age =" + age +
                '}';
    }
}
