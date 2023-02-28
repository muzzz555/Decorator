interface Shape {
    String info();
}

class ColourDecorator implements Shape {

	private String colour;
	private Shape shape;		// bind shape

	public ColourDecorator(Shape shape, String colour) {
		this.shape = shape;
		this.colour = colour;
	}

	@Override
	public String info() {
		return shape.info() +" has the colour " + colour;
	}
}

class TransparencyDecorator implements Shape {

	private int transparency;
	private Shape shape;		// bind shape

	public TransparencyDecorator(Shape shape, int transparency) {
		this.shape = shape;
		this.transparency = transparency;
	}

	@Override
	public String info() {
		return shape.info() +" has " + transparency + "% transparency";
	}

}

class Circle implements Shape {

    private float radius;

    public Circle (float radius) {
        this.radius = radius;
    }

    void resize (float factor) {
        radius *= factor;
    }

    @Override
    public String info() {
        return "A circle of radius " + radius;
    }
    
}

class Square implements Shape {

    private float side;

    public Square (float side) {
        this.side = side;
    }

    @Override
    public String info() {
        return "A square with side " + side;
    }
    
}

class Decorator {
    public static void main(String[] args) {
        Circle circle = new Circle(10); //radius
				System.out.println(circle.info());
				circle.resize(2);
				System.out.println(circle.info());

				ColourDecorator redCircle = new ColourDecorator(circle, "red");
				System.out.println(redCircle.info());

				TransparencyDecorator transparentSquare = new TransparencyDecorator(new Square(20), 50);
				System.out.println(transparentSquare.info());

				ColourDecorator newSquare = new ColourDecorator(transparentSquare, "blue");
				System.out.println(newSquare.info());

				// redCircle.resize(4);   
				// Problem in Decorator because redCircle is new object not have old object ability

    }
}