public class Main {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.txt");

        // Create directories
        Directory root = new Directory("Root");
        Directory folder1 = new Directory("Folder1");
        Directory folder2 = new Directory("Folder2");

        // Add files to directories
        root.addComponent(file1);
        root.addComponent(folder1);
        folder1.addComponent(file2);
        folder1.addComponent(folder2);
        folder2.addComponent(file3);

        // Display the file system structure
        root.display();
    }
}
