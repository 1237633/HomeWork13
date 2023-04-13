import java.util.Objects;

public abstract class Hogwarts {
    private int magicPower;
    private int teleportPower;

    private final String name;


    public Hogwarts(String name, int magicPower, int teleportPower) {
        this.magicPower = magicPower;
        this.teleportPower = teleportPower;
        this.name = name;
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

    public int getTotalPoints() {      // Так и не понял, как заставить Джаву использовать этот метод из класса Hogwarts когда необходимо сравнить двух учеников с разных факультетов только по базовым параметрам. Поэтому завел отдельный метод с точно такой же реализацией.
        return magicPower + teleportPower;
    }

    public int getBasicPowers() {
        return magicPower + teleportPower;
    }


    public void printStudent() {
        System.out.println(this.getName() + " magic: " + this.magicPower + " teleport: " + this.teleportPower + ". " + this);
    }

    public void printComparison(Hogwarts student) {
        System.out.print("В Хогвартсе: ");
        if (this.getBasicPowers() > student.getBasicPowers()) {
            System.out.println(this.getName() + " сильнее, чем " + student.getName());
        } else {
            System.out.println(this.getName() + " слабее, чем " + student.getName());
        }
        System.out.println(this.getBasicPowers() + " vs. " + student.getBasicPowers());
    }


}
