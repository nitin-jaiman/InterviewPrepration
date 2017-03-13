package Tree;

/**
 * Created by apple on 07/02/17.
 */
public class MirrorTree {


    /**
     * http://www.geeksforgeeks.org/write-an-efficient-c-function-to-convert-a-tree-into-its-mirror-tree/
     * This program is similar to traversal of tree space and time complexities will be same as Tree traversal
     * @param node
     */
    public void mirror(Node node){

        if(node==null||(node.getLeft()==null&&node.getRight()==null)){

            return;

        }

        Node temp;
        temp=node.getLeft();
        node.setLeft(node.getRight());
        node.setRight(temp);
        mirror(node.getLeft());
        mirror(node.getRight());

    }

}
