public class Backpack {
    protected String herb;
    protected String seed;

    public Backpack(String herb, String seed){
        this.herb = herb;
        this.seed = seed;
    }

    void setHerb(String herb){this.herb = herb;}
    void setSeed(String seed){this.seed = seed;}
    String getHerb(){return this.herb;}
    String getSeed(){return this.seed;}
}
