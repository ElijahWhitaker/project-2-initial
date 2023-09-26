package com.csc205.project2;

public class Rectangularprism extends Project2 {
    private double length;
    private double width;
    private double height;

    public Rectangularprism() {
        super();
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
    }
    public Rectangularprism(double v, double v1, double v2) {
        super();
        this.length = v1;
        this.width = v2;
        this.height = v;
    }
    public double getHeight() {
        return height; }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double surfaceArea() {
        return 2.0 * (width * length + height * length + height * width);
    }

    public double volume() {
        return width * height * length;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangular prism {");
        sb.append ("height=").append(height);
        sb.append(", length=").append(length);
        sb.append (", width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void FourDimensionalShape() {
        
    }
}
