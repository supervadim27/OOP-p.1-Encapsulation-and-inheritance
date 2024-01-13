public class HogwartsReport {
    public void compareAnyStudents (Hogwarts first, Hogwarts second) {
        if (first.getMagicPower() > second.getMagicPower()) {
            System.out.println(first.getName()+" "+first.getSurname()+" is stronger than "+second.getName()+" "+second.getSurname());
        } else if (first.getMagicPower() == second.getMagicPower()) {
            System.out.println(first.getName()+" "+first.getSurname()+" is equal in power to "+second.getName()+" "+second.getSurname());
        } else {
            System.out.println(second.getName()+" "+second.getSurname()+" is stronger than "+first.getName()+" "+first.getSurname());
        }
        if (first.getTeleportation() > second.getTeleportation()) {
            System.out.println(first.getName() + " " + first.getSurname() + " goes further than  " +second.getName()+" "+second.getSurname());
        } else if (first.getTeleportation() == second.getTeleportation()) {
            System.out.println(first.getName()+" "+first.getSurname()+ " goes as far as " +second.getName()+" "+second.getSurname());
        } else {
            System.out.println(second.getName()+" "+second.getSurname()+ " goes further than " +first.getName()+" "+first.getSurname());
        }
    }

    public void compareSlytherinStudents(Slytherin first, Slytherin second) {
        int firstSum = first.getTrickinherent() + first.getDetermination()
                + first.getAmbition() + first.getResourcefulness() + first.getThirstForPower();
        int secondSum = second.getTrickinherent() + second.getDetermination()
                + second.getAmbition() + second.getResourcefulness() + second.getThirstForPower();

        if (firstSum > secondSum) {
            System.out.println(first.getName()+" "+first.getSurname()+ " is better Slytherin than " + second.getName()+" "+second.getSurname());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName()+" "+second.getSurname()+ " is better Slytherin than " + first.getName()+" "+first.getSurname());
        } else {
            System.out.println(first.getName()+" "+first.getSurname()+ " and " + second.getName()+" "+second.getSurname()+ " are equals as Slytherins");
        }
    }

    public void compareGriffindorStudents(Griffindor first, Griffindor second) {
        int firstSum = first.getBravery() + first.getHonor()
                + first.getNobility();
        int secondSum = second.getBravery() + second.getHonor()
                + second.getNobility();

        if (firstSum > secondSum) {
            System.out.println(first.getName()+" "+first.getSurname()+" is a better Griffindor than "+second.getName()+" "+second.getSurname());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName()+" "+second.getSurname()+" is better Griffindor than "+first.getName()+" "+first.getSurname());
        } else {
            System.out.println(first.getName()+" "+first.getSurname()+" and "+second.getName()+" "+second.getSurname()+" are equals as Griffindors");
        }
    }

    public void comparePuffinduyStudents(Puffinduy first, Puffinduy second) {
        int firstSum = first.getHardworking()
                + first.getHonest() + first.getLoyal();
        int secondSum = second.getHardworking()
                + second.getHonest() + second.getLoyal();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Puffinduy than " + second.getName() + " " + second.getSurname());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " " + second.getSurname() + " is better Puffinduy than " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println(first.getName() + " " + first.getSurname() + " and " + second.getName() + " " + second.getSurname() + " are equals as Puffinduy");
        }
    }

    public void compareKogtevranStudents(Kogtevran first, Kogtevran second) {

        int firstSum = first.getSmart() + first.getWise()
                + first.getWitty() + first.getCreativity();

        int secondSum = second.getSmart() + second.getWise()
                + second.getWitty() + second.getCreativity();

        if (firstSum > secondSum) {
            System.out.println(first.getName() + " " + first.getSurname() + " is a better Kogtevran than " + second.getName()+ " "+ second.getSurname());
        } else if (secondSum > firstSum) {
            System.out.println(second.getName() + " " + second.getSurname() + " is better Kogtevran than " + first.getName() + " " + first.getSurname());
        } else {
            System.out.println(first.getName() + " " + first.getSurname() + " and " + second.getName() + " " + second.getSurname() + " are equals as Kogtevran");
        }
    }
}

