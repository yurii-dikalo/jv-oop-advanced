package core.basesyntax;

public class Square extends Figure {
    private int side;

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: square, "
                + "area: " + getArea() + " sq.units, "
                + "side: " + getSide() + " units, "
                + "color: " + getColor();
    }
}
