import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public Layer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /** remove all circles. */
    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
                i--;
            }
        }
    }

    /** remove duplicate. */
    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }

    /** return info of shape. */
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Layer of crazy shapes:");
        sb.append("\n");
        for (Shape shape : shapes) {
            sb.append(shape.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
