package applications.ex1.system;

import applications.ex1.models.Character;

public abstract class CharacterBuilder {

    private Character character;

    public CharacterBuilder(CharacterFactory factory){
        character = factory.createCharacter("adsf");
    }

    public Character build(){
        return character;
    }

}
