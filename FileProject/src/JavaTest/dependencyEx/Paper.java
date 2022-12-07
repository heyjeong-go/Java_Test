package JavaTest.dependencyEx;

public class Paper {

    private Pen pen;

    public Paper() {
        pen = new Pen();
    }

    public void draw() {
        pen.draw();
    }
}
