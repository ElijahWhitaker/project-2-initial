package com.csc205.project2;

public class Cylinder extends Project2 {

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }
    public Cylinder(double v, double v1) {
        super();
        this.radius = v1;
        this.height = v;
    }
    public double getHeight() {
        return height; }
    public double getRadius() {
        return radius;
    }
    public void setHeight(double height) {

        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double surfaceArea() {
        return 2.0 * Math.PI * radius * height + 2.0 * Math.PI * Math.pow(radius, 2);
    }

    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append ("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void FourDimensionalShape() {

    }
}
