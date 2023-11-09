/**
 * Available short ranged guns
 */
enum shortRangeGun{ //types of short range guns
    KNIFE,
    AXE,
    SWORD
}

/**
 * @author Tiago Silva
 * @version 1.0
 */
class Warrior extends Character{
    /**
     * the warrior's armour
     */
    private boolean hasArmour;
    /**
     * the warrior's gun
     */
    private shortRangeGun gun;

    /**
     * Constructor of the Warrior class
     * @param name the character's name
     * @param hasArmour a boolean that represents the warrior's armour
     * @param gun the warrior's gun
     */
    public Warrior(String name, boolean hasArmour, shortRangeGun gun){
        super(name, 10, 3, 5);
        this.hasArmour = hasArmour;
        this.gun = gun;
    }

    /**
     * Gets the warrior's gun
     * @return shortRangeGun
     */
    public shortRangeGun getGun(){return this.gun;}

    /**
     * Gets the warrior's armour
     * @return armour
     */
    public boolean getArmour(){return this.hasArmour;}

    /**
     * Sets the warrior's armour
     * @param armour the warrior's armour
     */
    public void setArmour(boolean armour){hasArmour = armour;}

    /**
     * Sets the gun for the warrior
     * @param gun the warrior's gun
     */
    public void setGun(shortRangeGun gun){this.gun = gun;}

    /**
     * Because this is the warrior's class it returns the warrior's armour (if it exists or not)
     * @return hasArmour the warrior's armour
     */
    @Override
    protected boolean hasAtribute(){return hasArmour;}

    /**
     * It levels up the warrior
     */
    @Override
    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.2;
        this.agility *= 1.1;
        this.intelligence *= 1.05;
        this.experience++;
        printStats("After levelling up");
    }
    
}
