public class Car extends Update {
    private String modelName;
    private int wheelsCount;
    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
       this.wheelsCount = wheelsCount;
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
