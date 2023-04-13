import java.util.Objects;

public class GriffendorStudents extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;


    public GriffendorStudents(String name, int magicPower, int teleportPower, int bravery, int nobility, int honor) {
        super(name, magicPower, teleportPower);
        this.bravery = bravery;
        this.honor = honor;
        this.nobility = nobility;
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
        return "Griffendor specs: " +
                " nobility = " + nobility +
                ", honor = " + honor +
                ", bravery = " + bravery;
    }

    @Override
    public int getTotalPoints() {
        return bravery + honor + nobility + super.getTotalPoints();
    }

    public void printComparison(GriffendorStudents student) {
        System.out.print("В Гриффендоре: ");
        if (this.getTotalPoints() > student.getTotalPoints()) {
            System.out.println(this.getName() + " сильнее, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " слабее, чем " + student.getName());
        }
        System.out.println(this.getTotalPoints() + " vs. " + student.getTotalPoints());
    }
}
