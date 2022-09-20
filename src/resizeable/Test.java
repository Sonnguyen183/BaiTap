package resizeable;

public class Test{
    public static void main(String[] args) {
        Shape [] shape = new Shape[10];
        for (int i = 0; i < shape.length; i++){
        shape[i] = getRandomShape();
        }
        Shape.printShape(shape);
        for (Shape e : shape){
            e.resize(Math.random()*100);
        }
        System.out.println("\n");
        Shape.printShape(shape);
    }
    static Shape getRandomShape() {
        int random = (int) (Math.round(Math.random() * 2));
    switch (random){
        case 0:
            return new Square(10);
        case 1:
            return new Rectangle(10, 20);
        default:
            return new Circle(10);
    }
    }
    }

