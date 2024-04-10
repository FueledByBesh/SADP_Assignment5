package applications.ex1.system;

import applications.ex1.models.*;
import applications.ex1.models.Character;

public class CharacterCreator {

    private Character character;

    public CharacterCreator(CharacterFactory factory){
        character = factory.createCharacter();
    }

    public CharacterCreator setAppearance(CharAppearance appearance){
        character.setAppearance(appearance);
        return this;
    }

    public CharacterCreator addAbility(CharAbility ability){
        character.addAbility(ability);
        return this;
    }

    public CharacterCreator addEquipment(Equipment equipment){
        character.addEquipment(equipment);
        return this;
    }

    public CharacterCreator setAttributes(CharAttributes attributes){
        character.setAttributes(attributes);
        return this;
    }

    public Character create(){
        return character;
    }

}
