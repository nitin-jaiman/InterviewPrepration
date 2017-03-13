package Tree;

/**
 * Created by apple on 08/02/17.
 */

/**
 * http://www.geeksforgeeks.org/write-a-c-program-to-get-count-of-leaf-nodes-in-a-binary-tree/
 *
 */
public class CountLeafNode {



    public int leafCount(Node node){

        if(node==null){return 0;}

        else if(node.getLeft()==null&&node.getRight()==null){
            return 1;
        }else{

            return leafCount(node.getLeft())+leafCount(node.getRight());

        }
    }




    public static void main(String args[]){

        Node n1=new Node("50");
        Node n2=new Node("7");
        Node n3=new Node("2");
        Node n4=new Node("3");
        Node n5=new Node("5");
        Node n6=new Node("1");
        Node n7=new Node("30");

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);
        n3.setRight(n7);




        CountLeafNode countLeafNode=new CountLeafNode();
        System.out.println(countLeafNode.leafCount(n1));

    }


}
