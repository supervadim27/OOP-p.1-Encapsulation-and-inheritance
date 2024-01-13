
public class Main {
    public static void main(String[] args) {
        HogwartsReport hogwarts = new HogwartsReport();
        Griffindor potter = new Griffindor("Harry", "Potter", 99, 59, 77, 88, 92);
        Griffindor hermiona = new Griffindor("Hermiona", "Granger", 75, 78, 60, 55, 85);
        Griffindor ron = new Griffindor("Ron", "Weasly", 40, 65, 70, 75, 45);
        hogwarts.compareAnyStudents(hermiona, potter);
        hogwarts.compareGriffindorStudents(hermiona,ron);
        System.out.println(hermiona);
    }
}