package applications.ex4.model;

public class Weapon {

    private String type;
    private int damage;
    private int speed;
    private int range;

    public Weapon(String type, int damage, int speed, int range) {
        this.type = type;
        this.damage = damage;
        this.speed = speed;
        this.range = range;
    }

    public String getInfo() {
        return "Weapon type: "+type+"\n"+
                "Damage: "+damage+"\n"+
                "Speed: "+speed+"\n"+
                "Range: "+range+"\n";
    }
}
