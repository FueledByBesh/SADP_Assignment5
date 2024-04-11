package applications.ex4.system;

import applications.ex4.model.Sword;
import applications.ex4.model.Warrior;
import applications.ex4.model.Weapon;
import applications.ex4.model.Character;

public class WariorSwordFactory extends CharacterFactory{

    public WariorSwordFactory(String characterName) {
        super(characterName);
    }

    @Override
    public Character createCharacter() {
        return new Warrior(this.characterName,100,10);
    }

    @Override
    public Weapon createWeapon() {
        return new Sword(100,20,90);
    }
}
