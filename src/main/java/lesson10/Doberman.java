package lesson10;

final public class Doberman extends Dog {
    private String type;
    private int growth;

    public Doberman() {
    }

    public Doberman(String type, int growth) {
        this.type = type;
        this.growth = growth;
    }

    public Doberman(String color, int weight, String type, int growth) {
        super(color, weight);
        this.type = type;
        this.growth = growth;
    }

    public Doberman(String name, int age, String color, int weight, String type, int growth) {
        super(name, age, color, weight);
        this.type = type;
        this.growth = growth;
    }
    @Override
    public void animalVoice() {
        System.out.println("They are making howl");
    }

    @Override
    public void characterType() {
        System.out.println("They are very obedient");
    }
    public void destination () {
        System.out.println("bodyguard dogs");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public String toString() {
        return "Doberman{" +
                "type='" + type + '\'' +
                ", growth=" + growth +
                '}';
    }

}
