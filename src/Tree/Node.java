package Tree;

/**
 * Created by apple on 11/01/17.
 */
public class Node {



    /**
     * int value of the node
     */
    private int intValue;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    private int level;

    public int getLeftSize() {
        return leftSize;
    }

    public void setLeftSize(int leftSize) {
        this.leftSize = leftSize;
    }

    private int leftSize;


    /**
     * String value of the node
     */
    private String stringValue;


    /**
     * Left Connected Node
     */
    private Node left;

    /**
     * Right Connected Node
     */
    private Node right;

    public Node(int intValue) {
        this.intValue = intValue;
    }

    public Node(String stringValue) {
        this.stringValue = stringValue;
    }

    public Node(int intValue, String stringValue) {
        this.intValue = intValue;
        this.stringValue = stringValue;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return this.getStringValue();
    }
}
