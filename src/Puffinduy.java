public class Puffinduy extends Hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;
    public Puffinduy(String name, String surname, int magicPower, int teleportation, int hardworking, int loyal, int honest) {
        super(name,surname,magicPower,teleportation);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public int getHonest() {
        return honest;
    }
    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }
    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }
    public void setHonest(int honest) {
        this.honest = honest;
    }
    @Override
    public String toString() {
        return super.toString()+" hardworking="+hardworking+" loyal="+loyal+" honest="+honest;
    }
}