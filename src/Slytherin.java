public class Slytherin extends Hogwarts {
    private int trickinherent;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;
    public Slytherin(String name, String surname, int magicPower, int teleportation, int trickinherent, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name,surname,magicPower,teleportation);
        this.trickinherent = trickinherent;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public int getTrickinherent() {
        return trickinherent;
    }
    public void setTrickinherent(int trickinherent) {
        this.trickinherent = trickinherent;
    }
    public int getDetermination() {
        return determination;
    }
    public void setDetermination(int determination) {
        this.determination = determination;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getThirstForPower() {
        return thirstForPower;
    }
    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    @Override
    public String toString() {
        return super.toString()+" trickinherent=" + trickinherent +" determination=" + determination +" ambition=" + ambition +" resourcefulness=" + resourcefulness +" thirst for power=" + thirstForPower;
    }
}
