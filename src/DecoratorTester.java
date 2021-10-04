public class DecoratorTester {

    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        System.out.println("***********************************");

        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();

        Shape blueSquare = new BlueShapeDecorator(new Square());
        blueSquare.draw();
    }
}
