public class Hogwarts {
    private String name;
    private String surname;
    private int magicPower;
    private int teleportation;

    public Hogwarts(String name, String surname, int magicPower, int teleportation) {
        this.magicPower = magicPower;
        this.teleportation = teleportation;
        this.name = name;
        this.surname = surname;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTeleportation() {
        return teleportation;
    }
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public void setTeleportation(int teleportation) {
        this.teleportation = teleportation;
    }
}
