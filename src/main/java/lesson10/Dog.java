package lesson10;

abstract class Dog extends Animal{
    private String color;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog() {
    }

    public Dog(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Dog(String name, int age, String color, int weight) {
        super(name, age);
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void animalVoice() {
        System.out.println("The dogs are barking");
    }

    public void characterType(){
        System.out.println("The dogs are friendly to people");
    }

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "color='" + color + '\'' +
//                ", weight=" + weight +
//                '}';
//    }
}
