public class Truck extends Update {
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void update() {
        System.out.println("Меняем покрышки " + getWheelsCount());
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
