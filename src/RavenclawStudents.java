import java.util.Objects;

public class RavenclawStudents extends Hogwarts{
    private int wisdom;
    private int wit;
    private int creativity;

    private static RavenclawStudents[] students = new RavenclawStudents[3];
    public static int counter = 0;

    public RavenclawStudents(String name, int magicPower, int teleportPower, int wisdom, int wit, int creativity) {
        super(name, magicPower, teleportPower);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
        students[counter] = this;
        counter++;
    }

    public static void printAll(){
        for (RavenclawStudents student: students) {
            System.out.println(student);
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RavenclawStudents that = (RavenclawStudents) o;
        return getWisdom() == that.getWisdom() && getWit() == that.getWit() && getCreativity() == that.getCreativity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getWisdom(), getWit(), getCreativity());
    }

    @Override
    public String toString() {
        return "Ravenclaw student: " + getName() + ", magic powa: " + getMagicPower() + " teleport power: " + getTeleportPower() +
                " wisdom= " + wisdom +
                ", wit= " + wit +
                ", creativity= " + creativity +
                '}';
    }

    @Override
    public int getTotalPoints() {
        return wisdom + wit + creativity + getMagicPower() + getTeleportPower();
    }

    public static RavenclawStudents bestOfFaculty() {
        RavenclawStudents best = students[0];
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i + 1] != null && students[i].getTotalPoints() < students[i + 1].getTotalPoints()) {
                best = students[i + 1];
            }
        }
        return best;
    }


}
