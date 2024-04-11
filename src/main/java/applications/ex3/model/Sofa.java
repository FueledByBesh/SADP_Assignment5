package applications.ex3.model;

public class Sofa extends Furniture{
    public Sofa(String style, String material, float price) {
        super(style, material, price);
        this.type = "Sofa";
    }
}
