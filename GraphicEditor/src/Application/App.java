package Application;
import Interfaces.IShape;
import Models.*;

/**
 *
 * @author Raihan Ibrahim
 */
public class App {

    public static void main(String[] args) {
        IShape shape1 = new Circle();
        IShape shape2 = new Rectangle();
        IShape shape3 = new Square();
        IShape shape4 = new Triangle();
        GraphicEditor editor = new GraphicEditor();
        
        System.out.println("Shape 1 (Circle)");
        editor.DrawShape(shape1);
        
        System.out.println("Shape 2 (Rectangle)");
        editor.DrawShape(shape2);
        
        System.out.println("Shape 3 (Square)");
        editor.DrawShape(shape3);
        
        System.out.println("Shape 4 (Triangle)");
        editor.DrawShape(shape4);
    }
    
}
