package applications.ex4.model;

public class Character {

    private String name;
    private String type;
    private Weapon weapon;
    private int health;
    private int mana;

    public Character(String type,String name, int health, int mana) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.mana = mana;
    }

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public String getInfo(){
        return "Character type: "+type+"\n"+
                "Character name: "+name+"\n"+
                "Health: "+health+"\n"+
                "Mana: "+mana+"\n";
    }

    public String aboutWeapon(){
        return "Owner name: "+name+"\n"+
                "Owner type: "+type+"\n"+
                weapon.getInfo();
    }
}
