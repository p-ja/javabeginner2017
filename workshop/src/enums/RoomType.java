package enums;

public enum RoomType {
    BEDROOM,
    BATHROOM,
    KITCHEN,

    LABORATORY(3d),
    LOUNGE(5d);

    private final double area;

    RoomType() {
        this.area = 1.0d;
    }

    private RoomType(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }
}
