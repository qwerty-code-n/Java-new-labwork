package com.company;

public class Point2d {

    private double xCoord;
    private double yCoord;

    public Point2d(double x, double y) {
        xCoord = x;
        yCoord = y;
    }

    public Point2d() {
        xCoord = 0;
        yCoord = 0;
    }

    public double getX() {
        return  xCoord;
    }

    public double getY() {
        return yCoord;
    }
}
