import java.util.ArrayList;
import java.util.Scanner;

public class Pow {

    public static void levelUp(ArrayList<Character> lista){
        for (Character character : lista) {
            character.levelUp();
            System.out.println();
        }
    }

    public static void printAll(ArrayList<Character> lista){
        System.out.println("All characters: ");
        for (Character character : lista) {
            System.out.println(character);
        }
    }
    public static void printAboveLvl10(ArrayList<Character> lista){
        System.out.println("Characters above lvl 10: ");
        for (Character character : lista) {
            if (character.experience > 10){
                System.out.println(character);
            }
        }
    }
    public static void printAllWithRestrictions(ArrayList<Character> lista){
        for (Character character : lista) {
            if (character.hasAtribute()){
                System.out.println(character);
            }
        }
    }
    
    /** 
     * @return ArrayList<Character>
     */
    public static ArrayList<Character> fill(){
        ArrayList <Character> lista = new ArrayList<Character>();
        lista.add(new Warrior("leviathan", true, shortRangeGun.AXE));
        lista.add(new Warrior("sanguine_warrior", true, shortRangeGun.SWORD));
        lista.add(new Warrior("blood_liadrin", true, shortRangeGun.KNIFE));
        lista.add(new Warrior("light_blade", false, shortRangeGun.SWORD));
        lista.add(new Warrior("buckthorn_servant", true, shortRangeGun.AXE));
        lista.add(new Mage("stout_defender", new Backpack("folhas de macieira", "sementes de abóbora")));
        lista.add(new Mage("the_curator", new Backpack("folhas de carvalho", "sementes de romã")));
        lista.add(new Mage("tontochronos", new Backpack("folhas de pinheiro", "sementes de maça")));
        lista.add(new Mage("buckthorn_defender", new Backpack("folhas de acácia", "sementes de girassol")));
        lista.add(new Mage("light_liadrin", new Backpack("folhas de eucalipto", "sementes de pepino")));
        lista.add(new Mercenary("sanguine_curator",longRangeGun.BOW, 45));
        lista.add(new Mercenary("tontodefender", longRangeGun.PISTOL, 32));
        lista.add(new Mercenary("the_leviathan", longRangeGun.STONE, 23));
        lista.add(new Mercenary("light_defender", longRangeGun.PISTOL, 78));
        lista.add(new Mercenary("blood_light", longRangeGun.STONE, 4));
        return lista;
    
    }
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<Character> lista =  fill();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        do{
            System.out.println("1.Print all Characters\n2.Print characters above lvl 10\n3.Print with restrictions\n4.Level up all characters\n5.exit");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    printAll(lista);
                    break;
                case 2:
                    printAboveLvl10(lista);
                    break;
                case 3:
                    printAllWithRestrictions(lista);
                    break;
                case 4:
                    levelUp(lista);
                    break;
                default:
                    if (n != 5) System.out.println("Invalid number try again!");
                    break;
            }
        }while (n != 5);
        
        sc.close();
    }
}
