enum shortRangeGun{ //types of short range guns
    KNIFE,
    AXE,
    SWORD
}

class Warrior extends Character{
    private boolean hasArmour;  //it either has armour or not
    private shortRangeGun gun;  //Each warrior has only one gun

    public Warrior(String name, boolean hasArmour, shortRangeGun gun){
        super(name, 10, 3, 5);
        this.hasArmour = hasArmour;
        this.gun = gun;
    }
    public shortRangeGun getGun(){return this.gun;}    
    public boolean getArmour(){return this.hasArmour;}
    public void setArmour(boolean armour){hasArmour = armour;}
    public void setGun(shortRangeGun gun){this.gun = gun;}

    protected boolean hasAtribute(){return hasArmour;}

    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.2;
        this.agility *= 1.1;
        this.inteligence *= 1.05;
        this.experience++;
        printStats("After levelling up");
    }
    
}
