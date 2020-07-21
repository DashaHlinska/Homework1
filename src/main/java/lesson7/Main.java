package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        Cat firstCat = new Cat("Barsik");
        System.out.println(firstCat.name);

        Cat secondCat = new Cat("Persik", "Persian");
        System.out.println(secondCat.name);
        System.out.println(secondCat.species);

        Cat thirdCat = new Cat("Vasiliy", "american bobtail", 3);
        System.out.println("Third cat: " + thirdCat);

        Dog firstDog = new Dog("Archi");
        System.out.println(firstDog.name);

        Dog secondDog = new Dog("Ike", "bulldog");
        System.out.println(secondDog.name);
        System.out.println(secondDog.species);

        Dog thirdDog = new Dog("Alf","canes", 5);
        System.out.println("Third dog: " + thirdDog);

        thirdDog.setAge(6);
        thirdDog.setName("Ralf");
        System.out.println("Third dog with new owner (name): " + thirdDog.getName());
        System.out.println("Third dog with new owner (age): " + thirdDog.getAge());






    }


}
