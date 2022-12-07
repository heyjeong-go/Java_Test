public class write {

    private static write instance = new write();

    public static write getInstance() {

        if (null == instance) {
            instance = new write();
        }

        return instance;
    }

    public void setInfo() {

        demo tmp = demo.getInstance();

        tmp.setName("lalala");
        tmp.setAge("20");
    }

}
