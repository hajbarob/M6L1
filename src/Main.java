import figures.Dot;
import figures.RightTriangle;
import figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Dot dot1 = new Dot();
        Dot dot2 = new Dot(2, 0);
        Dot dot3 = new Dot(0, 2);

        Triangle triangle = new Triangle(dot1, dot2, dot3);

        Triangle triangle2 = new Triangle(dot1, 4, 3);

        RightTriangle rightTriangle1 = new RightTriangle(dot1, 3);

        System.out.println(triangle);
    }
}