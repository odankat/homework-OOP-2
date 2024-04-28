public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        System.out.println("Меняем покрышки грузовика " + getWheelsCount());
        System.out.println("Проверяем двигатель грузовика");
        System.out.println("Проверяем прицеп грузовика");
    }
}