public class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
       super(modelName, wheelsCount);
    }


    public void update() {
        System.out.println("Меняем покрышки " + getWheelsCount());
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public int getWheelsCount() {
        return super.getWheelsCount();
    }
}
