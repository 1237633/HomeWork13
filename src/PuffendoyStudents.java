import java.util.Objects;

public class PuffendoyStudents extends Hogwarts{

    private int loyalty;
    private int industriousness;
    private int honesty;

    private static PuffendoyStudents[] students = new PuffendoyStudents[3];
    public static int counter = 0;

    public PuffendoyStudents(String name, int magicPower, int teleportPower, int loyalty, int industriousness, int honesty) {
        super(name, magicPower, teleportPower);
        this.loyalty = loyalty;
        this.industriousness = industriousness;
        this.honesty = honesty;
        students[counter] = this;
        counter++;
    }

    public static void printAll(){
        for (PuffendoyStudents student: students) {
            System.out.println(student);
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PuffendoyStudents puffendoyStudents = (PuffendoyStudents) o;
        return getLoyalty() == puffendoyStudents.getLoyalty() && getIndustriousness() == puffendoyStudents.getIndustriousness() && getHonesty() == puffendoyStudents.getHonesty();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLoyalty(), getIndustriousness(), getHonesty());
    }

    @Override
    public String toString() {
        return "Puffendoy student: " + getName() + ", magic powa: " + getMagicPower() + " teleport power: " + getTeleportPower() +
                " loyalty= " + loyalty +
                ", industriousness= " + industriousness +
                ", honesty= " + honesty +
                '}';
    }

    @Override
    public int getTotalPoints() {
        return loyalty + industriousness + honesty + getMagicPower() + getTeleportPower();
    }

    public static PuffendoyStudents bestOfFaculty() {
        PuffendoyStudents best = students[0];
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i + 1] != null && students[i].getTotalPoints() < students[i + 1].getTotalPoints()) {
                best = students[i + 1];
            }
        }
        return best;
    }

}
