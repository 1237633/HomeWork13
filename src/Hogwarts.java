import java.util.Objects;

public abstract class Hogwarts {
    private int magicPower;
    private int teleportPower;

    private String name;

    private static Hogwarts[] students = new Hogwarts[12];
    public static int counter = 0;

    public Hogwarts(String name, int magicPower, int teleportPower) {
        this.magicPower = magicPower;
        this.teleportPower = teleportPower;
        this.name = name;
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

    public int getMagicPower() {
        return magicPower;
    }

    public int getTeleportPower() {
        return teleportPower;
    }

    public String getName() {
        return name;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setTeleportPower(int teleportPower) {
        this.teleportPower = teleportPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return getMagicPower() == hogwarts.getMagicPower() && getTeleportPower() == hogwarts.getTeleportPower() && getName().equals(hogwarts.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMagicPower(), getTeleportPower(), getName());
    }

    @Override
    public String toString() {
        return "Hogwarts student: " + name + ", magic powa: " + magicPower + " teleport power: " + teleportPower;
    }

    public int getTotalPoints() {
        return magicPower + teleportPower;
    }

    public void getBestOfHogwarts() {
        Hogwarts best = students[0];
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i + 1] != null && students[i].getTotalPoints() < students[i + 1].getTotalPoints()) {
                best = students[i + 1];
            }
        }

    }
}
