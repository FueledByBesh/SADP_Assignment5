package applications.ex1.system;

import applications.ex1.models.Character;
import applications.ex1.models.Mage;

public class MageFactory extends CharacterFactory{

    public MageFactory(String charName) {
        super(charName);
    }

    @Override
    public Character createCharacter() {
        return new Mage(this.charName);
    }
}
