public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Griffindor(String name, String surname, int magicPower, int teleportation,int nobility, int honor, int bravery) {
        super(name, surname, magicPower, teleportation);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public String toString() {
        return getName()+" "+getSurname()+": magicPower="+getMagicPower()+" teleportation="+getTeleportation()+" nobility="+nobility+" honor="+honor+" bravery="+bravery;
    }

}
