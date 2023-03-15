package figures;

public class RightTriangle extends Triangle {

    public RightTriangle(Dot dot1, Dot dot2, Dot dot3) {
        // todo whrite validation to check if triangle is right
        // if () {
        //  set dots
        // }
        super(dot1, dot2, dot3);
    }

    public RightTriangle(Dot dot1, int xShift, int yShift) {
        super(dot1, xShift, yShift);
    }

    public RightTriangle(Dot dot1, int twoAxisShift) {
        this(dot1, twoAxisShift, twoAxisShift);
        //super(dot1, twoAxisShift, twoAxisShift);
    }
}
