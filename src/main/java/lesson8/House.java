package lesson8;

public class House {
    private Table table;
    private Chair chair;
    private Cupboard cupboard;
    public House() {
    }

    public House(Table table, Chair chair, Cupboard cupboard) {
        this.table = table;
        this.chair = chair;
        this.cupboard = cupboard;
    }

    public Table getTable() {
        return table;
    }
    public void setTable(Table table) {
        this.table = table;
    }
    public Chair getChair(Chair chair) {
        return this.chair;
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
    public Cupboard getCupboard() {
        return cupboard;
    }
    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }
}
