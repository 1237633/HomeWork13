import java.util.Objects;

public class SlizerinStudents extends Hogwarts{
    private int cunning; //хитрость
    private int decisiveness; //решительнось
    private int ambitious;
    private int resourcefulness; //находчивость
    private int lustForPower;

    private static SlizerinStudents[] students = new SlizerinStudents[3];
    public static int counter = 0;


    public SlizerinStudents(String name, int magicPower, int teleportPower, int cunning, int decisiveness, int ambitious, int resourcefulness, int lustForPower) {
        super(name, magicPower, teleportPower);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambitious = ambitious;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        students[counter] = this;
        counter++;
    }

    public static void printAll(){
        for (SlizerinStudents student: students) {
            System.out.println(student);
            System.out.println();
        }
        System.out.println("-----------------------------------------------");
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
        return "Slizerin student: " + getName() + ", magic powa: " + getMagicPower() + " teleport power: " + getTeleportPower() +
                " cunning= " + cunning +
                ", decisiveness= " + decisiveness +
                ", ambitious= " + ambitious +
                ", resourcefulness= " + resourcefulness +
                ", lustForPower= " + lustForPower +
                '}';
    }

    @Override
    public int getTotalPoints(){
        return cunning + decisiveness + ambitious + lustForPower + resourcefulness + getMagicPower() + getTeleportPower();
    }


    public static SlizerinStudents bestOfFaculty() {
        if(students[0] != null) {
            SlizerinStudents best = students[0];
            for (int i = 0; i < students.length - 1; i++) {
                if (students[i + 1] != null && students[i].getTotalPoints() < students[i + 1].getTotalPoints()) {
                    best = students[i + 1];
                }
            }
            return best;
        }
        return null;
    }
}
