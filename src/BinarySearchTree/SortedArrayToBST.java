package BinarySearchTree;

import Tree.Node;
import Tree.TreeTraversal;

/**
 * Created by apple on 11/02/17.
 */
public class SortedArrayToBST {


    int arr[]=new int[]{1,2,3,4,5,6};

    /**
     * http://www.geeksforgeeks.org/sorted-array-to-balanced-bst/
     * just pick the middle element and make node of it get its left and right node recursively in same fashion
     * @param st
     * @param en
     * @return
     */
    public Node sortedArrayToBST(int st,int en){

        if (en < st) {
            return null;
        }



        if(st==en){

            Node n=new Node(""+arr[st]);
            return n;

        }



        int mIndex=(st+en)/2;

        Node n=new Node(""+arr[mIndex]);

        n.setRight(sortedArrayToBST(mIndex+1,en));
        n.setLeft(sortedArrayToBST(st,mIndex-1));

        return n;
    }

    public static void main(String args[]){




        Node root=new SortedArrayToBST().sortedArrayToBST(0,5);
        new TreeTraversal().inOrder(root);
    }


}
