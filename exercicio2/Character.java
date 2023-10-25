import java.lang.*;
import java.util.Random;

//superclass character
class Character{
    protected String name;
    protected int experience, strength, inteligence, agility;

    public Character(String name, int strength, int inteligence, int agility){
        this.name = name;
        this.experience = (int)Math.random() % 25;
        this.strength = strength;
        this.inteligence = inteligence;
        this.agility = agility;
    }
    //getters and setters
    public String getName(){return name;}
    public int getExperience(){return experience;}
    public int getStrength(){return strength;}
    public int getInteligence(){return inteligence;}
    public int getAgility(){return agility;}
    public void setName(String name){this.name = name;}
    public void setStrength(int strength){this.strength = strength;}
    public void setInteligence(int inteligence){this.inteligence = inteligence;}
    public void setAgility(int agility){this.agility = agility;}

    //auxiliary function to print stats before and after levelling up
    private void printStats(String state){
        System.out.println("-------- " + state + " -------");
        System.out.println("|Nome: " + name + "                |");
        System.out.println("|Experiência: " + experience + "                    |");
        System.out.println("|Força: " + strength + "                         |");
        System.out.println("|Agilidade: " + agility + "                      |");
        System.out.println("|Inteligência: " + inteligence + "                   |");
        System.out.println("------------------------------------");

    }

    //method to level up a character
    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        experience++;
        printStats("After levelling up");


    }
    //toString method for every character
    public String toString(){
        return "The character " + name + " has a level of experience of " + experience;
    }

}
//perguntar se if(this instance of) é uma boa prática ou não