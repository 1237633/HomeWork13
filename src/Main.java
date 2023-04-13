import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final Random rnd = new Random();

        GriffendorStudents HarryPotter = new GriffendorStudents("Harry Potter", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        GriffendorStudents Hermoina = new GriffendorStudents("Hermiona Granger", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        GriffendorStudents Ron = new GriffendorStudents("Ron Whisley", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);


        SlizerinStudents Drako = new SlizerinStudents("Drako Malfoy", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);
        SlizerinStudents Graham = new SlizerinStudents("Graham Montegru", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);
        SlizerinStudents Gregory = new SlizerinStudents("Gregory Goil", rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80, rnd.nextInt(65) + 35, rnd.nextInt(20) + 80);


        PuffendoyStudents JustinBieber = new PuffendoyStudents("Justin Finch-Fletchley", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        PuffendoyStudents Zahar = new PuffendoyStudents("Ded Zahar", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        PuffendoyStudents CedricDiggori = new PuffendoyStudents("Cedric Diggori", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);


        RavenclawStudents chinaGuy = new RavenclawStudents("Chinese Name", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        RavenclawStudents PadmaPatil = new RavenclawStudents("Padma Patil", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);
        RavenclawStudents MarkusBelby = new RavenclawStudents("Markus Belby", rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50, rnd.nextInt(50) + 50);

        System.out.println();

        Hermoina.printStudent();
        Drako.printStudent();
        Zahar.printStudent();
        MarkusBelby.printStudent();
        System.out.println();

        HarryPotter.printComparison(Hermoina);
        System.out.println();
        Drako.printComparison(Gregory);
        System.out.println();
        Drako.printComparison(Hermoina);
        System.out.println();
        Hermoina.printComparison(HarryPotter);
        System.out.println();
        MarkusBelby.printComparison(Zahar);

    }
}

