/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
class Rectangle extends Shape {

    Point topLeft;
    double length;
    double width;

    public Rectangle(double x, double y, double length, double width) {

        super("Rectangle");
        topLeft = new Point(x, y);
        this.length = length;
        this.width = width;

    }

    public void setLength(double l) {
        l = length;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double w) {
        w = width;
    }

    public double getWidth() {
        return width;
    }

    public void setTopLeft(Point t) {
        t = topLeft;

    }

    public Point getTopLeft() {

        return topLeft;
    }

    public double getArea() {
        return width * length;

    }

    public String toString() {
        return "topLeft= " + topLeft + "; Length= " + length + "; Width= " + width ;
    }

}
