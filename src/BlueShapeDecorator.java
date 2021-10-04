public class BlueShapeDecorator extends ShapeDecorator {

    public BlueShapeDecorator(Shape ds) {
        super(ds);
    }

    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    private void setBlueBorder(Shape decoratedShape) {
        System.out.println("border color: blue");
    }
}
