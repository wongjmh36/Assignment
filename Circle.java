 class Circle extends Shape {
    
    Point center;
    double radius;    

    public Circle(double x,double y, double radius) {
        super("Circle");
        center= new Point(x,y);  
        this.radius = radius;
    }

    @Override
    public double getArea() {
       return Math.PI*radius*radius;
    }

    public void setRadius(double r) {       
        r=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point c){
        c=center;
    };
             
    public Point getCenter() {
        return center;
    }

    public String toString() {
        return "Center= "+center+"; Radius= "+radius;
    }

}

