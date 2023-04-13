import java.util.Objects;

public class RavenclawStudents extends Hogwarts {
    private int wisdom;
    private int wit;
    private int creativity;


    public RavenclawStudents(String name, int magicPower, int teleportPower, int wisdom, int wit, int creativity) {
        super(name, magicPower, teleportPower);
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;

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
        return "Ravenclaw specs: " +
                " wisdom= " + wisdom +
                ", wit= " + wit +
                ", creativity= " + creativity;
    }

    @Override
    public int getTotalPoints() {
        return wisdom + wit + creativity + super.getTotalPoints();
    }

    public void printComparison(RavenclawStudents student) {
        System.out.print("В Когтеварне: ");
        if (this.getTotalPoints() > student.getTotalPoints()) {
            System.out.println(this.getName() + " сильнее, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " слабее, чем " + student.getName());
        }
        System.out.println(this.getTotalPoints() + " vs. " + student.getTotalPoints());
    }

}
