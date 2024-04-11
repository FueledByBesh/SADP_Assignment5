package applications.ex3.model;

public abstract class Furniture {

    protected String type;
    private String style;
    private String material;
    private float price;

    public Furniture(String style, String material, float price) {
        this.style = style;
        this.material = material;
        this.price = price;
    }

    public String getInfo(){
        return "Furniture type: "+type+"\n"+
                "Style: "+style+"\n"+
                "Material: "+material+"\n"+
                "Price: "+price+"$\n";
    }
}
