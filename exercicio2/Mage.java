/**
 * @author Tiago Silva
 * @version 1.0
 */
class Mage extends Character {
    /**
     * The Mage's backpack, one herb and one seed
     */
    protected Backpack backpack;

    /**
     * Constructor of the Mage's class
     * @param name Mage's name
     * @param backpack Mage's backpack
     */
    public Mage(String name, Backpack backpack){ 
        super(name, 2, 9, 4);
        this.backpack = backpack;
    }


    /**
     * Gets the Mage's herb
     * @return The Mage's herb
     */
    String getHerb(){return this.backpack.getHerb();}

    /**
     * Gets the Mage's seed
     * @return The Mage's seed
     */
    String getSeed(){return this.backpack.getSeed();}

    /**
     * Sets a herb for the Mage
     * @param herb the Mage's herb
     */
    void setHerb(String herb){this.backpack.herb = herb;}

    /**
     * Sets a seed for the Mage
     * @param seed the Mage's seed
     */
    void setSeed(String seed){this.backpack.seed = seed;}

    /**
     * Checks if a Mage has the required seed
     * @return if the seed equals "sementes de abóbora"
     */
    @Override
    protected boolean hasAtribute(){return backpack.seed.equals("sementes de abóbora");}

    /**
     * Levels up the Mage
     */
    @Override
    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.05;
        this.agility *= 1.1;
        this.intelligence *= 1.2;
        this.experience++;
        printStats("After levelling up");
    }
}
