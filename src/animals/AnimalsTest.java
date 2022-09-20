package Animals;

public class AnimalsTest {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animals animals1 : animals){
            System.out.println(animals1.makeSound());
            if (animals1 instanceof Chiken){
                Ediable ediable = (Chiken) animals1;
                System.out.println(ediable.howToEat());
            }
        }
    }
}
