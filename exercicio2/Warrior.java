class Warrior extends Character{
    private boolean hasArmour;
    private String ShortRangegun;

    public Warrior(String name, int strength, int inteligence, int agility, boolean hasArmour, String gun){
        super(name, strength, inteligence, agility);
        this.hasArmour = hasArmour;
        this.ShortRangegun = gun;
    }
    public String getGun(){return this.ShortRangegun;}    
    public boolean getArmour(){return this.hasArmour;}
    public void setArmour(boolean armour){hasArmour = armour;}
    public void setGun(String gun){this.ShortRangegun = gun;}
    
}
