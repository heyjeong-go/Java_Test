package JavaTest;

public class CarFactoryTest {

    public static void main(String[] args) {

        // CarFactory factory = CarFactory.getInstance();
        CarFactory factory = new CarFactory();

        // Car mySonata = factory.createCar();
        // Car yourSonata = factory.createCar();

        int num = 0;
        Car mySonata = new Car(num);
        Car yourSonata = new Car(num);

        System.out.println(mySonata.getCarNum());
        System.out.println(yourSonata.getCarNum());
    }
}
