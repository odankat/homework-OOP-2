public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Bicycle bicycle = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Truck truck = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        ServiceStation station = new ServiceStation();
        station.check(bicycle);
        station.check(truck2);
        station.check(car2);
        station.check(truck);

    }
}