public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            car.update();

        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());

            truck.update();

        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());

            bicycle.update();

        }
    }
}
