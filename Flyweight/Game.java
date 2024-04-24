public class Game {
    public static void main(String[] args) {
        
        Tree oakTree = TreeFactory.getTreeType("oak");
        Tree pineTree = TreeFactory.getTreeType("pine");

        oakTree.display(10, 20);
        pineTree.display(30, 40);
        oakTree.display(50, 60);
        pineTree.display(70, 80);
    }
}
