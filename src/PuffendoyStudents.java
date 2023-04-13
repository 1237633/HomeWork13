import java.util.Objects;

public class PuffendoyStudents extends Hogwarts {

    private int loyalty;
    private int industriousness;
    private int honesty;


    public PuffendoyStudents(String name, int magicPower, int teleportPower, int loyalty, int industriousness, int honesty) {
        super(name, magicPower, teleportPower);
        this.loyalty = loyalty;
        this.industriousness = industriousness;
        this.honesty = honesty;
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
        return "Puffendoy specs: " +
                " loyalty= " + loyalty +
                ", industriousness= " + industriousness +
                ", honesty= " + honesty;
    }

    @Override
    public int getTotalPoints() {
        return loyalty + industriousness + honesty + super.getTotalPoints();
    }

    public void printComparison(PuffendoyStudents student) {
        System.out.print("В Пуффендуе: ");
        if (this.getTotalPoints() > student.getTotalPoints()) {
            System.out.println(this.getName() + " сильнее, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " слабее, чем " + student.getName());
        }
        System.out.println(this.getTotalPoints() + " vs. " + student.getTotalPoints());
    }

}
