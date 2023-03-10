package src.main.java.hillel.hw;

public class Application {
    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree();

        // додати елементи до дерева
        tree.add(10);
        tree.add(5);
        tree.add(20);
        tree.add(8);
        tree.add(3);
        tree.add(30);

        // пройтися по дереву
        System.out.println("Дерево, пройдене в наступному порядку:");
        tree.traverseInOrder(tree.getRoot());
    }
}