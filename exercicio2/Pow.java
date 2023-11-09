import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tiago Silva
 * @version 1.0
 */

/**
 * Class to manage all the game's characters
 */
class Pow {
    /**
     * Method used to level up all the characters
     * @param list List with all the characters used to test the app
     */
    private static void levelUp(ArrayList<Character> list){
        for (Character character : list) {
            character.levelUp();
            System.out.println();
        }
    }
    /**
     * Method used to print all the characters
     * @param list List with all the characters used to test the app
     */
    private static void printAll(ArrayList<Character> list){
        System.out.println("All characters: ");
        for (Character character : list) {
            System.out.println(character);
        }
    }
    /**
     * Method used to print all the characters above lvl 10 of experience
     * @param list List with all the characters used to test the app
     */
    private static void printAboveLvl10(ArrayList<Character> list){
        System.out.println("Characters above lvl 10: ");
        for (Character character : list) {
            if (character.experience > 10){
                System.out.println(character);
            }
        }
    }
    /**
     * Method used to print Warriors with armour, Mercenarys with bows
     * and mages with "sementes de abóbora"
     * @param list List with all the characters used to test the app
     */
    private static void printAllWithRestrictions(ArrayList<Character> list){
        for (Character character : list) {
            if (character.hasAtribute()){
                System.out.println(character);
            }
        }
    }

    /**
     * Method used to fill the character's array
     * @return ArrayList with 15 Characters
     */
    private static ArrayList<Character> fill(){
        ArrayList <Character> list = new ArrayList<Character>();
        list.add(new Warrior("leviathan", true, shortRangeGun.AXE));
        list.add(new Warrior("sanguine_warrior", true, shortRangeGun.SWORD));
        list.add(new Warrior("blood_liadrin", true, shortRangeGun.KNIFE));
        list.add(new Warrior("light_blade", false, shortRangeGun.SWORD));
        list.add(new Warrior("buckthorn_servant", true, shortRangeGun.AXE));
        list.add(new Mage("stout_defender", new Backpack("folhas de macieira", "sementes de abóbora")));
        list.add(new Mage("the_curator", new Backpack("folhas de carvalho", "sementes de romã")));
        list.add(new Mage("tontochronos", new Backpack("folhas de pinheiro", "sementes de maça")));
        list.add(new Mage("buckthorn_defender", new Backpack("folhas de acácia", "sementes de girassol")));
        list.add(new Mage("light_liadrin", new Backpack("folhas de eucalipto", "sementes de pepino")));
        list.add(new Mercenary("sanguine_curator",longRangeGun.BOW, 45));
        list.add(new Mercenary("tontodefender", longRangeGun.PISTOL, 32));
        list.add(new Mercenary("the_leviathan", longRangeGun.STONE, 23));
        list.add(new Mercenary("light_defender", longRangeGun.PISTOL, 78));
        list.add(new Mercenary("blood_light", longRangeGun.STONE, 4));
        return list;
    
    }

    /**
     * Main method. Manages the app.
     * @param args of main method
     */
    public static void main(String[] args) {
        ArrayList<Character> list =  fill();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("1.Print all Characters\n2.Print characters above lvl 10\n3.Print with restrictions\n4.Level up all characters\n5.exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    printAll(list);
                    break;
                case 2:
                    printAboveLvl10(list);
                    break;
                case 3:
                    printAllWithRestrictions(list);
                    break;
                case 4:
                    levelUp(list);
                    break;
                default:
                    if (n != 5) System.out.println("Invalid number try again!");
                    break;
            }
        }while (n != 5);
        
        sc.close();
    }
}
