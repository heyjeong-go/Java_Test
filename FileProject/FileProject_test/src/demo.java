public class demo {

    private String name;
    private String age;

    private static demo instance;

    public static demo getInstance() {

        if (null == instance) {
            instance = new demo();
        }

        return instance;
    }

    public String getName() {

        return this.name;
    }

    public String getAge() {

        return this.age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(String age) {

        this.age = age;
    }
}
