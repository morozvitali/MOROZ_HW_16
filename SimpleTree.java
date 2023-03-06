public class SimpleTree {
    private Node root;

    public SimpleTree(Node node) {
        this.root = root;
    }

    public void traverseTree (Node node) {
        System.out.println(node.getValue());
        for (Node child : node.getChildren()) {
            traverseTree(child);
        }
    }

////////////////////--MAIN--/////////////////////////
    public static void main(String[] args) {
        //Створення узлів
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        //Додавання вузлів лр дерева
        node1.addChild(node2);
        node1.addChild(node3);
        //
        SimpleTree tree = new SimpleTree(node1);
        //Виведення значень вузлів
        tree.traverseTree(tree.root);
        }
    }
