package lesson8;

public class Main {
    public static void main(String[] args) {

    Something something = new Something();
    FinalTest finalTest = new FinalTest("name", "surname", 100);
    Table table = new Table();
    Chair chair = new Chair();
    Cupboard cupboard = new Cupboard();
    House house = new House();
    chair.setColor("black");
        house.setChair(chair);
        System.out.println(chair.getColor());
        System.out.println(house.getChair(chair));
        house.setTable(table);
        table.setColor("blue");
        System.out.println(house.getTable());
        table.setWidth(1.23);
        System.out.println(house.getTable());





    }

}

