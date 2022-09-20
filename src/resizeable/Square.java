package resizeable;

public class Square extends Shape{
    private double side = 0;
    @Override
    public void resize(double percent){
        this.side *= (percent/200);
    }
    public  Square(){}
    public  Square(double side){
        this.side = side;
    }
    public Square(double side, String color, boolean filled){
        setShape(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString(){
        return "Square{" +
                "side=" + side +
                '}'
                + " , which is a subclass of"
                + super.toString();
    }
}
