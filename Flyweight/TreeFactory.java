import java.util.HashMap;
import java.util.Map;

// Flyweight factory class
 public class TreeFactory {
    private static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String type) {
        TreeType treeType = treeTypes.get(type);

        if (treeType == null) {
            treeType = new TreeType(type);
            treeTypes.put(type, treeType);
        }

        return treeType;
    }
}
