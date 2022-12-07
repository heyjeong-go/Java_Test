public class read {

    private static read instance = new read();

    public static read getInstance() {

        if (null == instance) {
            instance = new read();
        }

        return instance;
    }

    public void readInfo() {

        demo tmp = demo.getInstance();

        String name = tmp.getName();
        String age = tmp.getAge();

        System.out.println("Name : " + name + " Age : " + age);
    }
}
