package lib;

public class BREADMath {

    private BREADMath() {}

    public static double lerp(double y1, double y2, double t) {
        return y1 + (t * (y2-y1));
    }

}