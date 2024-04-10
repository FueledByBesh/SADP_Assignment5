package applications.ex1.appinterface;

import applications.ex1.models.*;
import applications.ex1.models.Character;
import applications.ex1.system.ArcherFactory;
import applications.ex1.system.CharacterCreator;
import applications.ex1.system.WariorFactory;


public class CharacterGame {
    public static void main(String[] args) {

        String character1Name = "Olzhas";
        String character2Name = "Arman";

        Equipment equipment1 = new Equipment(EquipmentType.Armor,"Armor");
        Equipment equipment2 = new Equipment(EquipmentType.Weapon,"Katana");
        Equipment equipment3 = new Equipment(EquipmentType.Weapon,"Bow");

        CharAppearance appearance1 = new CharAppearance("skin1");
        CharAppearance appearance2 = new CharAppearance("skin2");

        CharAbility ability1 = new CharAbility("ability1");
        CharAbility ability2 = new CharAbility("ability2");
        CharAbility ability3 = new CharAbility("ability3");

        CharAttributes attributes = new CharAttributes(100,100);

        // Character creating process

        CharacterCreator characterCreator1 = new CharacterCreator(new WariorFactory(character1Name));

        Character character1 = characterCreator1
                .addEquipment(equipment1)
                .addEquipment(equipment2)
                .setAppearance(appearance1)
                .addAbility(ability1)
                .addAbility(ability2)
                .setAttributes(attributes)
                .create();

        CharacterCreator characterCreator2 = new CharacterCreator(new ArcherFactory(character2Name));

        Character character2 = characterCreator2
                .addEquipment(equipment3)
                .setAppearance(appearance2)
                .addAbility(ability1)
                .addAbility(ability3)
                .setAttributes(attributes)
                .create();

        System.out.println(character1.aboutCharacter());
        System.out.println(character2.aboutCharacter());

    }
}
