import java.util.Objects;

public class SlizerinStudents extends Hogwarts {
    private int cunning; //хитрость
    private int decisiveness; //решительнось
    private int ambitious;
    private int resourcefulness; //находчивость
    private int lustForPower;


    public SlizerinStudents(String name, int magicPower, int teleportPower, int cunning, int decisiveness, int ambitious, int resourcefulness, int lustForPower) {
        super(name, magicPower, teleportPower);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitious = ambitious;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SlizerinStudents that = (SlizerinStudents) o;
        return getCunning() == that.getCunning() && getDecisiveness() == that.getDecisiveness() && getAmbitious() == that.getAmbitious() && getResourcefulness() == that.getResourcefulness() && getLustForPower() == that.getLustForPower();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getCunning(), getDecisiveness(), getAmbitious(), getResourcefulness(), getLustForPower());
    }

    @Override
    public String toString() {
        return "Slizerin specs: " +
                " cunning= " + cunning +
                ", decisiveness= " + decisiveness +
                ", ambitious= " + ambitious +
                ", resourcefulness= " + resourcefulness +
                ", lustForPower= " + lustForPower;
    }

    @Override
    public int getTotalPoints() {
        return cunning + decisiveness + ambitious + lustForPower + resourcefulness + super.getTotalPoints();
    }

    public void printComparison(SlizerinStudents student) {
        System.out.print("В Слизерине: ");
        if (this.getTotalPoints() > student.getTotalPoints()) {
            System.out.println(this.getName() + " сильнее, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " слабее, чем " + student.getName());
        }
        System.out.println(this.getTotalPoints() + " vs. " + student.getTotalPoints());
    }

}
