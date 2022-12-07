import java.util.ArrayList;

public class Project {

    public static void main(String[] args) throws Exception {

        read r = read.getInstance();
        write w = write.getInstance();

        w.setInfo();
        r.readInfo();
    }
}
