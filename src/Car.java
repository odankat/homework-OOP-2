public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void check() {
        System.out.println("Меняем покрышки машины " + getWheelsCount());
        System.out.println("Проверяем двигатель машины");
    }

}
