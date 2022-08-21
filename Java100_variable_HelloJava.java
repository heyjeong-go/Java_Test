class Parent {
}

class Child extends Parent {
}

class Brother extends Parent {
}

public class Java100_variable_HelloJava {
    public static void main(String[] args) {
        Parent p = new Parent();
        System.out.println(p instanceof Object); // true
        System.out.println(p instanceof Parent); // true
        System.out.println(p instanceof Child); // false
        System.out.println();

        Parent c = new Child();
        System.out.println(c instanceof Object); // true
        System.out.println(c instanceof Parent); // true
        System.out.println(c instanceof Child); // true
    }
}