package resizeable;

public class Rectangle  extends Shape{
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle(){
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        setShape(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return 2 * (width + this.length);
    }

    @Override
    public void resize(double percent){
        this.length *= (percent/200);
        this.width *= (percent/200);
    }

    @Override
    public String toString(){
        return "Rectangle{"+
                "width=" + width+
                ",length=" + length +
                '}'
                + ", which is a subclass of"
                +super.toString();
    }
}
