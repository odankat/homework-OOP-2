public abstract class Transport extends Vehicle {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
    }

    protected Transport() {
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
