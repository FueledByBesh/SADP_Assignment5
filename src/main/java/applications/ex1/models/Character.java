package applications.ex1.models;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private String name;
    private CharAppearance appearance;
    private final List<CharAbility> abilities = new ArrayList<>();
    private final List<Equipment> equipments = new ArrayList<>();
    private CharAttributes attributes;

    public Character(String name){
        this.name = name;
    }

    public void setAppearance(CharAppearance appearance) {
        this.appearance = appearance;
    }

    public void addAbility(CharAbility ability){
        this.abilities.add(ability);
    }

    public void addEquipment(Equipment equipment){
        this.equipments.add(equipment);
    }

    public void setAttributes(CharAttributes attributes) {
        this.attributes = attributes;
    }

    public String aboutCharacter(){
        return "Character name: "+name+"\n"+
                attributes.getAttributes();
    }
}
