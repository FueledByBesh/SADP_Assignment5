package applications.ex1.system;

import applications.ex1.models.Archer;
import applications.ex1.models.Character;

public class ArcherFactory extends CharacterFactory{

    public ArcherFactory(String charName) {
        super(charName);
    }

    @Override
    public Character createCharacter() {
        return new Archer(this.charName);
    }
}
