public abstract class ShapeDecorator extends Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape ds) {
        this.decoratedShape = ds;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
