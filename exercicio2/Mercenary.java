enum longRangeGun{ //types of long range guns
    STONE,
    BOW,
    PISTOL
}

class Mercenary extends Character{
    private longRangeGun gun; //Each Mercenary has only one type of gun
    private int ammo;

    public Mercenary(String name, longRangeGun gun, int ammo){
        super(name, 4, 4, 10);
        this.gun = gun;
        this.ammo = ammo;
    }
    public longRangeGun getLongRangeGun(){return this.gun;}    
    public int getAmmo(){return this.ammo;}
    public void setLongRangeGun(longRangeGun gun){this.gun = gun;}
    public void setAmmo(int ammo){this.ammo = ammo;}

    protected boolean hasAtribute(){return gun.equals(longRangeGun.BOW);}

    public void levelUp(){
        printStats("Before levelling up");
        System.out.println();   //used to format the output
        this.strength *= 1.08;
        this.agility *= 1.2;
        this.inteligence *= 1.08;
        this.experience++;
        printStats("After levelling up");
    }
    
}
