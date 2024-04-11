package applications.ex4.system;

import applications.ex4.model.Archer;
import applications.ex4.model.Bow;
import applications.ex4.model.Character;
import applications.ex4.model.Weapon;

public class ArcherBowFactory extends CharacterFactory {

    public ArcherBowFactory(String characterName) {
        super(characterName);
    }

    @Override
    public Character createCharacter() {
        return new Archer(this.characterName,95,40);
    }

    @Override
    public Weapon createWeapon() {
        return new Bow(60,100,40);
    }
}
