package applications.ex4.system;

import applications.ex4.model.Character;
import applications.ex4.model.Weapon;

public class CharacterCreator {

    private CharacterFactory factory;

    public CharacterCreator(CharacterFactory factory){
        this.factory =factory;
    }

    public void setFactory(CharacterFactory factory){
        this.factory = factory;
    }

    public Character createCharacter(){
        Character character = factory.createCharacter();
        Weapon weapon = factory.createWeapon();
        character.setWeapon(weapon);
        return character;
    }

}
