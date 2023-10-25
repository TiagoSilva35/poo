class Mercenary extends Character{
    private String longRangeGun;
    private int ammo;

    public Mercenary(String name, int strength, int inteligence, int agility, String longRangeGun, int ammo){
        super(name, strength, inteligence, agility);
        this.longRangeGun = longRangeGun;
        this.ammo = ammo;
    }
    public String getLongRangeGun(){return this.longRangeGun;}    
    public int getAmmo(){return this.ammo;}
    public void setLongRangeGun(String longRangeGun){this.longRangeGun = longRangeGun;}
    public void setAmmo(int ammo){this.ammo = ammo;}
    
}
