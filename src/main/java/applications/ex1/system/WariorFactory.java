package applications.ex1.system;

import applications.ex1.models.Character;
import applications.ex1.models.Warior;

public class WariorFactory extends CharacterFactory{

    public WariorFactory(String charName) {
        super(charName);
    }

    @Override
    public Character createCharacter() {
        return new Warior(this.charName);
    }
}
