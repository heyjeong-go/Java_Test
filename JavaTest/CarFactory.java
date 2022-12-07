package JavaTest;

public class CarFactory {

    private static CarFactory instance = new CarFactory();
    private static int carNumber = 10000;

    // private CarFactory() { // 싱글턴일땐 private로 선언~
    // };

    CarFactory() { // 싱글턴일땐 private로 선언~
    };

    public static CarFactory getInstance() {

        if (null == instance) {
            instance = new CarFactory();
        }

        return instance;
    }

    public Car createCar() {
        carNumber++;
        return new Car(carNumber);
    }
}
