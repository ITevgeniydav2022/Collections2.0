package transport;

import java.util.Objects;

public class Sponsor {

    private final String name;
    private final int supportAmount;

    public Sponsor(String name, int supportAmount) {
        this.name = name;
        this.supportAmount = supportAmount;
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void toSponsorRace() {
        System.out.printf("Спонсор \"%s\" проспонсировал заезд на %d%n", name, supportAmount);
    }

    @Override
    public String toString() {
        return name +
                ", сумма поддержки: " + supportAmount + " руб.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor sponsor = (Sponsor) o;
        return supportAmount == sponsor.supportAmount
                && Objects.equals(name, sponsor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportAmount);
    }
}
