package lesson10;

final public class Beagle extends Dog {
    private String type;
    private int growth;

    public Beagle() {
    }

    public Beagle(String type, int growth) {
        this.type = type;
        this.growth = growth;
    }

    public Beagle(String color, int weight, String type, int growth) {
        super(color, weight);
        this.type = type;
        this.growth = growth;
    }

    public Beagle(String name, int age, String color, int weight, String type, int growth) {
        super(name, age, color, weight);
        this.type = type;
        this.growth = growth;
    }

    @Override
    public void animalVoice() {
        System.out.println("They are making yowl");
    }

    @Override
    public void characterType() {
        System.out.println("They are easy to educate");
    }
    public void destination () {
        System.out.println("hunting breed");
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

//    @Override
//    public String toString() {
//        return "Beagle{" +
//                "type='" + type + '\'' +
//                ", growth=" + growth +
//                '}';
//    }
}
