package JavaTest;

interface Animal {
    public abstract void cry();
}

interface Pet {
    public abstract void play();
}

class Cat implements Animal, Pet {
    public void cry() {
        System.out.println("냐옹냐옹");
    }

    public void play() {
        System.out.println("쥐 잡기 놀이하자");
    }
}

class Dog implements Animal, Pet {
    public void cry() {
        System.out.println("멍멍!");
    }

    public void play() {
        System.out.println("산책가자");
    }
}

public class Java100_variable_HelloJava {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.cry();
        c.play();
        d.cry();
        d.play();
    }
}