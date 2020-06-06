class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area(){
        return this.height*this.base/2;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here
    @Override
    public double area(){
        return this.radius*this.radius*Math.PI;
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area(){
        return this.side*this.side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here
    @Override
    public double area(){
        return this.height*this.width;
    }
}