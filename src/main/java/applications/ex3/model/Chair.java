package applications.ex3.model;

public class Chair extends Furniture{
    public Chair(String style, String material, float price) {
        super(style, material, price);
        this.type = "Chair";
    }
}
