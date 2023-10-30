class Mage extends Character {
    protected Backpack backpack; //A backpack has one type of herb and one type of seed

    public Mage(String name, Backpack backpack){ 
        super(name, 2, 9, 4);
        this.backpack = backpack;
    }
    
    
    /** 
     * @param levelUp(
     * @return String
     */
    //We may want to get just an item and not the whole backpack
    String getHerb(){return this.backpack.getHerb();}
    String getSeed(){return this.backpack.getSeed();}
    void setHerb(String herb){this.backpack.herb = herb;}
    void setSeed(String seed){this.backpack.seed = seed;}

    protected boolean hasAtribute(){return backpack.seed.equals("sementes de abóbora");}


    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.05;
        this.agility *= 1.1;
        this.inteligence *= 1.2;
        this.experience++;
        printStats("After levelling up");
    }
}
