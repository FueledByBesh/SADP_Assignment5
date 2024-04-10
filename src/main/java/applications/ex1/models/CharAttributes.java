package applications.ex1.models;

public class CharAttributes {

    private int strength;
    private int health;

    /* .......... */

    public CharAttributes(int strength, int health) {
        this.strength = strength;
        this.health = health;
    }

    public String getAttributes(){
        return "Strength: "+strength+"\n"+
                "Health: "+health+"\n";
    }
}
