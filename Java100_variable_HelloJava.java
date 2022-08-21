abstract class Animal {
    abstract void cry();
}

class Cat extends Animal {
    void cry() {
        System.out.println("냐옹냐옹!");
    }
}

class Dog extends Animal {
    void cry() {
        System.out.println("멍멍!");
    }
}

public class Java100_variable_HelloJava {
    public static void main(String[] args) {
        // Animal a = new Animal() // 추상 클래스는 인스턴스 생성 불가능
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        d.cry();
    }
}