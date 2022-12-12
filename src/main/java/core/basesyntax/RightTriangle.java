package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * this.firstLeg * this.secondLeg;
    }

    @Override
    public String draw() {
        return "Figure: right triangle, "
                + "area: " + getArea() + " sq.units, "
                + "first leg: " + getFirstLeg() + " units, "
                + "second leg: " + getSecondLeg() + " units, "
                + "color: " + getColor();
    }
}
