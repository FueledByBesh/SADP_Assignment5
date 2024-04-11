package applications.ex4.system;

import applications.ex4.model.Weapon;
import applications.ex4.model.Character;

public abstract class CharacterFactory {

    protected String characterName;

    public CharacterFactory(String characterName){
        this.characterName=characterName;
    }

    public abstract Character createCharacter();
    public abstract Weapon createWeapon();
}
