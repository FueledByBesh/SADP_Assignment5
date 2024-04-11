package applications.ex3.model;

public class Table extends Furniture{
    public Table(String style, String material, float price) {
        super(style, material, price);
        this.type = "Table";
    }
}
