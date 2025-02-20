package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )

    {


        Shape redCircle = new Circle(new Red());
        Shape blueSquare = new Square(new Blue());

        redCircle.draw();
        blueSquare.draw();
    }

}
