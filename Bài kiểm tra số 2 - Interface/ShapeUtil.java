import java.util.List;

public class ShapeUtil {
    /**
     * Returns info all shapes of list.
     * 
     * @param shapes list of shapes
     * @return info all shapes of list
     */
    public static String printInfo(List<GeometricObject> shapes) {
        String result = "";
        result += "Circle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result += shape.getInfo() + "\n";
            }
        }
        result += "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                result += shape.getInfo() + "\n";
            }
        }
        return result;
    }
}
