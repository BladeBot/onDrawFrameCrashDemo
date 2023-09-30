package org.firstinspires.ftc.teamcode;


import org.opencv.core.Scalar;


public class RedProp extends ColorProcessor{

    public static double Min_Area =100;

    public static class Min
    {
        public double h = 50;
        public double s = 100;
        public double v = 20;
    }
    public static class Max
    {
        public double h = 80;
        public double s = 255;
        public double v = 200;
    }
    public static Min Min = new Min();
    public static Max Max = new Max();

    /**
     * Get a scalar containing the maximum Hue, Saturation, and Value of pixels that match
     * our target color.
     *
     * @return a Scalar containing the maximum desired Hue, Saturation, and Value.
     */
    @Override
    public Scalar maxColor() {
        return new Scalar( Max.h, Max.s, Max.v);
    }

    /**
     * Get a scalar containing the minimum Hue, Saturation, and Value of pixels that match
     * our target color.
     *
     * @return a Scalar containing the minimum desired Hue, Saturation, and Value.
     */
    @Override
    public Scalar minColor() {
        return new Scalar( Min.h, Min.s, Min.v);
    }

    /**
     * Get the minimum area that the object we are looking for should take up on the camera.
     *
     * @return The least area our target should take up. Anything smaller than this will be ignored.
     */
    @Override
    public double minArea() {
        return Min_Area;
    }
}
