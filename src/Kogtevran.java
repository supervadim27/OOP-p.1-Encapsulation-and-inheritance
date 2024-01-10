public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;
    public Kogtevran(String name, String surname, int magicPower, int teleportation, int smart, int wise, int witty, int creativity) {
        super(name,surname,magicPower,teleportation);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }
    public int getSmart() {
        return smart;
    }
    public int getWise() {
        return wise;
    }
    public int getWitty() {
        return witty;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setSmart(int smart) {
        this.smart = smart;
    }
    public void setWise(int wise) {
        this.wise = wise;
    }
    public void setWitty(int witty) {
        this.witty = witty;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public String toString() {
        return getName() + getSurname() + ": magicPower=" + getMagicPower() +
                "teleportation="+getTeleportation()+
                " smart=" + smart +
                " wise=" + wise +
                " witty=" + witty +
                " creativity=" + creativity
                ;
    }
}

