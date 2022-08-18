class Car {
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return this.modelYear + "년식, 차종 : " + this.modelName + ", 색깔 : " + this.color + ", 최대속도 : " + this.maxSpeed;
    }
}

public class Java100_variable_HelloJava {
    public static void main(String[] args) {
        Car myCar = new Car("폭스바겐", 2020, "회색", 200); // 생성자 호출
        System.out.println(myCar.getModel());
    }
}