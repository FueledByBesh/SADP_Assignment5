package applications.ex1.system;

import applications.ex1.models.Character;

public abstract class CharacterFactory {

    protected String charName;

    public CharacterFactory(String charName){
        this.charName = charName;
    }

    public abstract Character createCharacter();
}
