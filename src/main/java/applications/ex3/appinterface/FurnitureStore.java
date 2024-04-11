package applications.ex3.appinterface;


import applications.ex3.model.Furniture;
import applications.ex3.system.*;

import java.util.Scanner;

public class FurnitureStore {

    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int furnitureType;

        Furniture furniture;

        System.out.println("Choose furniture type: ");
        System.out.println("1. Chair");
        System.out.println("2. Sofa");
        System.out.println("3. Table");
        System.out.println("4. Exit");

        System.out.print("Enter choice -> ");

        int choice1 = choicer(4);
        if(choice1 == 4)
            return;
        furnitureType = choice1;

        System.out.println();
        System.out.println("Choose available furniture styles and materials: ");
        System.out.println("1. Modern style with material wood");
        System.out.println("2. Industrial style with material glass");
        System.out.println("3. Traditional style with material metal");
        System.out.println("4. Exit");

        System.out.print("Enter choice -> ");

        int choice2 = choicer(4);
        if(choice2 == 4)
            return;

        FurnitureCreator creator;

        switch (choice2){
            case 1 -> {
                FurnitureFactory factory = new ModernWoodFactory();
                creator = new FurnitureCreator(factory);
            }
            case 2 -> {
                FurnitureFactory factory = new IndustrialGlassFactory();
                creator = new FurnitureCreator(factory);
            }
            default -> {
                FurnitureFactory factory = new TraditionalMetalFactory();
                creator = new FurnitureCreator(factory);
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(". ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();

        furniture = switch (furnitureType) {
            case 1 -> creator.createChair();
            case 2 -> creator.createSofa();
            default -> creator.createTable();
        };

        System.out.println(furniture.getInfo());

    }

    private static int choicer(int max){

        while (true) {
            String choice = input.next();
            int num = itsNumber(choice);
            if(num<0 || num>max){
                System.out.print("Please enter valid number -> ");
                continue;
            }

            return num;
        }
    }

    private static int itsNumber(String choice){
        int num;
        try {
            num = Integer.parseInt(choice);
        }catch (NumberFormatException e){
            num = -1;
        }
        return num;
    }
}
