package test1;

public enum MyDerection {
    NOTRH(1),
    EAST(2),
    WEST(3),
    SOUTH(4);

    private int directionCode;

    MyDerection(int i) {
        directionCode = i;
    }

    public int getDirectionCode() {
        return directionCode;
    }

    String getShortname() {
        switch (this) {
            case NOTRH:
                return "n";
            case EAST:
                return "e";
            case WEST:
                return "w";
            case SOUTH:
                return "s";
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return "MyDerection - " + name();
    }
}
