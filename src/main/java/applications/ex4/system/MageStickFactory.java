package applications.ex4.system;

import applications.ex4.model.Character;
import applications.ex4.model.Mage;
import applications.ex4.model.Stick;
import applications.ex4.model.Weapon;

public class MageStickFactory extends CharacterFactory {

    public MageStickFactory(String characterName) {
        super(characterName);
    }

    @Override
    public Character createCharacter() {
        return new Mage(this.characterName,40,100);
    }

    @Override
    public Weapon createWeapon() {
        return new Stick(55,65,70);
    }
}
