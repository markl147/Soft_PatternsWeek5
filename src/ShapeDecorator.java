public abstract class ShapeDecorator extends Shape {

    protected Shape decoaratedShape;

    public ShapeDecorator(Shape ds) {
        this.decoaratedShape = ds;
    }

    public void draw() {
        decoaratedShape.draw();
    }
}
