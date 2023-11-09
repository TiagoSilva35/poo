/**
 * Available long ranged guns
 */
enum longRangeGun{ //types of long range guns
    STONE,
    BOW,
    PISTOL
}

/**
 * @author Tiago Silva
 * @version 1.0
 */
class Mercenary extends Character{
    /**
     * the Mercenary's gun
     */
    private longRangeGun gun;
    /**
     * The gun's ammo
     */
    private int ammo;

    /**
     * Constructor of the Mercenary's class
     * @param name the Mercenary's name
     * @param gun the Mercenary's gun
     * @param ammo the gun's ammo
     */
    public Mercenary(String name, longRangeGun gun, int ammo){
        super(name, 4, 4, 10);
        this.gun = gun;
        this.ammo = ammo;
    }

    /**
     * Gets the Mercenary's gun
     * @return gun The Mercenary's gun
     */
    public longRangeGun getLongRangeGun(){return this.gun;}

    /**
     * Gets the gun's ammo
     * @return ammo the amount of ammo the gun has
     */
    public int getAmmo(){return this.ammo;}

    /**
     * Sets a gun for a Mercenary
     * @param gun the Mercenary's gun
     */
    public void setLongRangeGun(longRangeGun gun){this.gun = gun;}

    /**
     * Sets ammo for the Mercenary's weapon
     * @param ammo the amount of ammo
     */
    public void setAmmo(int ammo){this.ammo = ammo;}

    /**
     * Checks if the Mercenary has a bow
     * @return a boolean, true if the gun is a bow otherwise false
     */
    @Override
    protected boolean hasAtribute(){return gun.equals(longRangeGun.BOW);}

    /**
     * It levels up the Mercenary
     */
    @Override
    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.08;
        this.agility *= 1.2;
        this.intelligence *= 1.08;
        this.experience++;
        printStats("After levelling up");
    }
    
}
