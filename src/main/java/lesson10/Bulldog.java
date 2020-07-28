package lesson10;

final public class Bulldog extends Dog {
    private String type;
    private int growth;

    public Bulldog() {
    }

    public Bulldog(String type, int growth) {
        this.type = type;
        this.growth = growth;
    }

    public Bulldog(String color, int weight, String type, int growth) {
        super(color, weight);
        this.type = type;
        this.growth = growth;
    }

    public Bulldog(String name, int age, String color, int weight, String type, int growth) {
        super(name, age, color, weight);
        this.type = type;
        this.growth = growth;
    }

    @Override
    public void animalVoice() {
        System.out.println("They are making roar");
    }

    @Override
    public void characterType() {
        System.out.println("They are heavy to educate");
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
        return "Bulldog{" +
                "type='" + type + '\'' +
                ", growth=" + growth +
                '}';
    }
}
