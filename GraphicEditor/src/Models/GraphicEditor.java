package Models;
import Interfaces.IShape;

/**
 *
 * @author Raihan Ibrahim
 */
public class GraphicEditor {
    public void DrawShape(IShape shape)
    {
        System.out.println(shape.drow());
    }
}
