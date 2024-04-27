public class Car extends Transport {
    private String modelName;
    private int wheelsCount;
    public Car(String modelName, int wheelsCount) {
        this.wheelsCount = wheelsCount;
        this.modelName = modelName;
    }

    public void update() {
        System.out.println("Меняем покрышки " + getWheelsCount());
        System.out.println("Проверяем двигатель");
    }


    public String getModelName()  {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
}
