import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> children;

    public Node (int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }
    public void addChild (Node node) {
        this.children.add(node);
    }
    public int getValue () {
        return this.value;
    }
    public List <Node> getChildren() {
        return this.children;
    }
}

