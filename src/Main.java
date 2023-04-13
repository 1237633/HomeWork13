import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();

        GriffendorStudents HarryPotter = new GriffendorStudents("Harry Potter", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        GriffendorStudents Hermoina = new GriffendorStudents("Hermiona Granger", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        GriffendorStudents Ron = new GriffendorStudents("Ron Whisley", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);


        SlizerinStudents Drako = new SlizerinStudents("Drako Malfoy", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35,rnd.nextInt(65) + 35,rnd.nextInt(20) + 80,rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);
        SlizerinStudents Graham = new SlizerinStudents("Graham Montegru", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35,rnd.nextInt(65) + 35,rnd.nextInt(20) + 80,rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);
        SlizerinStudents Gregory = new SlizerinStudents("Gregory Goil", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35,rnd.nextInt(65) + 35,rnd.nextInt(20) + 80,rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);


        PuffendoyStudents JustinBieber = new PuffendoyStudents("Justin Finch-Fletchley", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        PuffendoyStudents Zahar = new PuffendoyStudents("Ded Zahar", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        PuffendoyStudents CedricDiggori = new PuffendoyStudents("Cedric Diggori", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);


        RavenclawStudents chinaGuy = new RavenclawStudents("Chinese Name", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        RavenclawStudents PadmaPatil = new RavenclawStudents("Padma Patil", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);
        RavenclawStudents MarkusBelby = new RavenclawStudents("Markus Belby", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50,rnd.nextInt(50) + 50,rnd.nextInt(50) + 50);

        System.out.println();
        GriffendorStudents.printAll();
        SlizerinStudents.printAll();
        PuffendoyStudents.printAll();
        RavenclawStudents.printAll();

        System.out.println(HarryPotter.getTotalPoints());
        System.out.println(Hermoina.getTotalPoints());
        System.out.println(Ron.getTotalPoints());

        System.out.println(GriffendorStudents.bestOfFaculty().getTotalPoints() + " " +  GriffendorStudents.bestOfFaculty());
        System.out.println(Drako.getTotalPoints());
        System.out.println(Graham.getTotalPoints());
        System.out.println(Gregory.getTotalPoints());
        System.out.println(SlizerinStudents.bestOfFaculty().getTotalPoints() + " " +  SlizerinStudents.bestOfFaculty());

        System.out.println(JustinBieber.getTotalPoints());
        System.out.println(Zahar.getTotalPoints());
        System.out.println(CedricDiggori.getTotalPoints());
        System.out.println(PuffendoyStudents.bestOfFaculty().getTotalPoints() + " " +  PuffendoyStudents.bestOfFaculty());

        System.out.println(chinaGuy.getTotalPoints());
        System.out.println(PadmaPatil.getTotalPoints());
        System.out.println(MarkusBelby.getTotalPoints());
        System.out.println(RavenclawStudents.bestOfFaculty().getTotalPoints() + " " +  RavenclawStudents.bestOfFaculty());
    }
}

