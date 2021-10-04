public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape ds) {
        super(ds);
    }

    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("border color: red");
    }
}
