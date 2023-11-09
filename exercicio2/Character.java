import java.lang.Math;

/**
 * @author Tiago Silva
 * @version 1.0
 */
abstract class Character{
    /**
     * the character's name
     */
    protected String name;
    /**
     * the character's lvl of xp
     */
    protected int experience;
    /**
     * the character's strength, intelligence and agility perks
     */
    protected double strength, intelligence, agility;

    /**
     * Constructor of the Character's class
     * @param name character's name
     * @param strength character's strength
     * @param intelligence character's intelligence
     * @param agility character's agility
     */
    public Character(String name, double strength, double intelligence, double agility){
        this.name = name;
        this.experience = (int)(Math.random() * 25) + 1;
        this.strength = strength;
        this.intelligence = intelligence;
        this.agility = agility;
    }


    /**
     * Gets the Character's name
     * @return a String, the Character's name
     */
    public String getName(){return name;}

    /**
     * Gets the level of experience
     * @return an integer, the lvl of xp
     */
    public int getExperience(){return experience;}

    /**
     * Gets the strength of a character
     * @return strength of a character
     */
    public double getStrength(){return strength;}

    /**
     * Gets the intelligence of a character
     * @return intelligence of a character
     */
    public double getIntelligence(){return intelligence;}

    /**
     * Gets the intelligence of a character
     * @return agility of a character
     */
    public double getAgility(){return agility;}

    /**
     * Sets the name of a character
     * @param name The name of the character
     */
    public void setName(String name){this.name = name;}

    /**
     * Sets the strength of a character
     * @param strength The strength of a character
     */
    public void setStrength(double strength){this.strength = strength;}

    /**
     * Sets the intelligence of a character
     * @param intelligence The intelligence of a character
     */
    public void setIntelligence(double intelligence){this.intelligence = intelligence;}

    /**
     * Sets the agility of a character
     * @param agility The agility of a character
     */
    public void setAgility(double agility){this.agility = agility;}

    
    /**
     * used to print the stats before and after the level up
     * @param state String that shows is the stats are before or after the level up
     */
    protected void printStats(String state){
        System.out.println("-------- " + state + " -------");
        System.out.println("|Name: " + name);
        System.out.println("|Experience: " + experience);
        System.out.println("|Strength: " + strength);
        System.out.println("|Agility: " + agility);
        System.out.println("|Intelligence: " + intelligence);
        System.out.println("------------------------------------");

    }

    /**
     * Method used in subclasses to level up each one of them with different rules
     */
    protected abstract void levelUp();

    /** 
     * method to check if a mercenary has an arch, a warrior has armour and a mage "sementes de abóbora"
     * @return boolean
     */
    protected abstract boolean hasAtribute();


    /**
     * Prints the character
     * @return a String with the formatted print
     */
    @Override
    public String toString(){
        return "The character " + name + " has a level of experience of " + experience;
    }

}