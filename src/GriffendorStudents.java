import java.util.Objects;

public class GriffendorStudents extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;
    private static GriffendorStudents[] students = new GriffendorStudents[3];
    private static int counter = 0;


    public GriffendorStudents(String name, int magicPower, int teleportPower, int bravery, int nobility, int honor) {
        super(name, magicPower, teleportPower);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
        students[counter] = this;
        counter++;
    }


    public static void printAll() {
        for (Hogwarts student : students) {
            System.out.println(student);
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GriffendorStudents that = (GriffendorStudents) o;
        return getNobility() == that.getNobility() && getHonor() == that.getHonor() && getBravery() == that.getBravery();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNobility(), getHonor(), getBravery());
    }

    @Override
    public String toString() {
        return "Griffendor student: " + getName() + ", magic powa: " + getMagicPower() + " teleport power: " + getTeleportPower() +
                " nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }

    @Override
    public int getTotalPoints() {
        return bravery + honor + nobility + getMagicPower() + getTeleportPower();
    }



   public static GriffendorStudents bestOfFaculty() {  //
        GriffendorStudents best = students[0];
       for (int i = 0; i < students.length - 1; i++) {
           if (students[i + 1] != null && students[i].getTotalPoints() < students[i + 1].getTotalPoints()) {
               best = students[i + 1];
           }
       }
        return best;
    }
}
