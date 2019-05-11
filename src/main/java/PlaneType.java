public enum PlaneType {
    BOING(737),
    AIRBUS(320);

    private final int valueType;

    PlaneType(int valueType) {
        this.valueType = valueType;
    }

    public int getValueType() {
        return valueType;
    }
}
