package com.company;

public class Main {

    public static double computeArea(Point3d a, Point3d b, Point3d c) throws Exception {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            throw new Exception("Равны");
        }

        double a1 = a.distanceTo(b);
        double b1 = b.distanceTo(c);
        double c1 = c.distanceTo(a);
        double P = (a1 + b1 + c1) / 2;

        return Math.round(Math.sqrt(P * (P - a1) * (P - b1) * (P - c1)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Point3d a = new Point3d();
        Point3d b = new Point3d(1, 4, 8);
        Point3d c = new Point3d(2, 9, 0);

        try {
            System.out.println(computeArea(a, b, c));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

