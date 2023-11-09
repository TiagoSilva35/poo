/**
 * @author Tiago Silva
 * @version 1.0
 */
class Backpack {
    /**
     * The backpack's herb
     */
    protected String herb;

    /**
     * The backpack's seed
     */
    protected String seed;

    /**
     * Constructor of the Backpack's class
     * @param herb a string that represents a herb
     * @param seed a string that represents a seed
     */
    public Backpack(String herb, String seed){
        this.herb = herb;
        this.seed = seed;
    }

    /**
     * Sets a herb to the backpack
     * @param herb A string that represents a herb
     */
    void setHerb(String herb){this.herb = herb;}

    /**
     * Sets a seed to the backpack
     * @param seed A string that represents a seed
     */
    void setSeed(String seed){this.seed = seed;}

    /**
     * Gets the herb from the backpack
     * @return a String representing a herb
     */
    String getHerb(){return this.herb;}

    /**
     * Gets the seed from the backpack
     * @return a String that representing a seed
     */
    String getSeed(){return this.seed;}
}
