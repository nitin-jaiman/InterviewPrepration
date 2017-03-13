package Queue;

import Tree.Node;
import Tree.TreeTraversal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * http://www.geeksforgeeks.org/given-linked-list-representation-of-complete-tree-convert-it-to-linked-representation/
 * Time complexity of the above solution is O(n) where n is the number of nodes.
 * Created by apple on 12/02/17.
 */
public class ConstructBinaryTreeFromLinkedList {

    LinkedList<Integer> linkedList=new LinkedList<>();
    int currentIndex=0;


    public void makeCompleteBinaryTree(){

        Node node=getCurrentFromLinkedList();
        Queue<Node> queue=new LinkedList<>();
        if(node!=null) {
            queue.add(node);
        }
        while(!queue.isEmpty()){

            Node n=queue.poll();
            Node fetchedNodeLeft=getCurrentFromLinkedList();
            Node fetchedNodeRight=getCurrentFromLinkedList();
            if(fetchedNodeLeft!=null){
                n.setLeft(fetchedNodeLeft);
                queue.add(n.getLeft());}

            if(fetchedNodeRight!=null) {
                n.setRight(fetchedNodeRight);
                queue.add(n.getRight());
            }
        }

        new TreeTraversal().levelOrderTraversal(node);


    }




    public Node getCurrentFromLinkedList(){

        if(currentIndex<linkedList.size()) {
            Integer temp = linkedList.get(currentIndex);
            currentIndex++;
            return new Node(temp + "");
        }else{

            return null;
        }


    }


    public static void main(String args[]){


        ConstructBinaryTreeFromLinkedList c=new ConstructBinaryTreeFromLinkedList();
        c.linkedList.add(10);
        c.linkedList.add(12);
        c.linkedList.add(15);
        c.linkedList.add(25);
        c.linkedList.add(30);
        c.linkedList.add(36);


        c.makeCompleteBinaryTree();


    }




}
