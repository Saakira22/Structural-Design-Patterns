// Concrete flyweight class
public class TreeType implements Tree {
    private String type;

    public TreeType(String type) {
        this.type = type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Tree of type " + type + " at position (" + x + ", " + y + ")");
    }
}
