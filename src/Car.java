public class Car extends Transport {
    private String modelName;
    private int wheelsCount;
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void update() {
        System.out.println("Меняем покрышки " + getWheelsCount());
        System.out.println("Проверяем двигатель");
    }
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }
}
