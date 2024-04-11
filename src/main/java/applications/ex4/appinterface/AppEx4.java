package applications.ex4.appinterface;

import applications.ex4.model.Character;
import applications.ex4.system.*;

public class AppEx4 {
    public static void main(String[] args) {

        CharacterCreator characterCreator;

        String character1_name = "Nurbol";
        String character2_name = "Sultan";
        String character3_name = "Roman";

        CharacterFactory factory1 = new WariorSwordFactory(character1_name);
        CharacterFactory factory2 = new MageStickFactory(character2_name);
        CharacterFactory factory3 = new ArcherBowFactory(character3_name);

        characterCreator = new CharacterCreator(factory1);
        Character character1 = characterCreator.createCharacter();

        characterCreator.setFactory(factory2);
        Character character2 = characterCreator.createCharacter();

        characterCreator.setFactory(factory3);
        Character character3 = characterCreator.createCharacter();

        System.out.println(character1.getInfo());
        System.out.println(character1.aboutWeapon());

        System.out.println(character2.getInfo());
        System.out.println(character2.aboutWeapon());

        System.out.println(character3.getInfo());
        System.out.println(character3.aboutWeapon());
    }
}
