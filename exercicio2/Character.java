import java.lang.Math;

//superclass character
class Character{
    protected String name;
    protected int experience;
    protected double strength, inteligence, agility;

    public Character(String name, int strength, int inteligence, int agility){
        this.name = name;
        this.experience = (int)(Math.random() * 25) + 1;
        this.strength = strength;
        this.inteligence = inteligence;
        this.agility = agility;
    }
    
    
    /** 
     * @param state
     * @return String
     */
    //getters and setters
    public String getName(){return name;}
    public int getExperience(){return experience;}
    public double getStrength(){return strength;}
    public double getInteligence(){return inteligence;}
    public double getAgility(){return agility;}
    public void setName(String name){this.name = name;}
    public void setStrength(int strength){this.strength = strength;}
    public void setInteligence(int inteligence){this.inteligence = inteligence;}
    public void setAgility(int agility){this.agility = agility;}

    //auxiliary function to print stats before and after levelling up
    protected void printStats(String state){
        System.out.println("-------- " + state + " -------");
        System.out.println("|Name: " + name);
        System.out.println("|Experience: " + experience);
        System.out.println("|Strength: " + strength);
        System.out.println("|Agility: " + agility);
        System.out.println("|Inteligence: " + inteligence);
        System.out.println("------------------------------------");

    }

    //method to level up a character, each type of character levels up in a diferent way
    protected void levelUp(){
    }

    //method to check if a mercenary has an arch, a warrior has armour and a mage "sementes de abóbora"
    protected boolean hasAtribute(){return false;}
    

    //toString method for every character
    @Override
    public String toString(){
        return "The character " + name + " has a level of experience of " + experience;
    }

}