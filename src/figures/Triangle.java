package figures;

public class Triangle {

    private Dot dot1;
    private Dot dot2;
    private Dot dot3;

    public Triangle(Dot dot1, Dot dot2, Dot dot3) {
        this.dot1 = dot1;
        this.dot2 = dot2;
        this.dot3 = dot3;
    }

    public Triangle(Dot dot1, int xShift, int yShift) {
        this.dot1 = dot1;
        this.dot2 = new Dot(dot1.getX() + xShift, dot1.getY());
        this.dot3 = new Dot(dot1.getX(), dot1.getY() + yShift);
    }

    public Dot getDot1() {
        return dot1;
    }

    public void setDot1(Dot dot1) {
        this.dot1 = dot1;
    }

    public Dot getDot2() {
        return dot2;
    }

    public void setDot2(Dot dot2) {
        this.dot2 = dot2;
    }

    public Dot getDot3() {
        return dot3;
    }

    public void setDot3(Dot dot3) {
        this.dot3 = dot3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "dot1=" + dot1.toString() +
                ", dot2=" + dot2.toString() +
                ", dot3=" + dot3.toString() +
                '}';
    }

}
