package BinarySearchTree;

import Tree.Node;

/**
 * Created by apple on 02/04/17.
 */
public class PrintBSTKeysInRange {


    public void printKeys(Node root, int start, int end){

        if(root==null){return;}

        if(root.getIntValue()>start){

            printKeys(root.getLeft(),start,end);
        }
        if(start<=root.getIntValue()&&end>=root.getIntValue()){
            System.out.println(root.getIntValue());
        }
        if(root.getIntValue()<end){

            printKeys(root.getRight(),start,end);

        }


    }

    public static void main(String args[]){

        Node n0=new Node(25);
        Node n1=new Node(20);
        Node n2=new Node(8);
        Node n3=new Node(22);
        Node n4=new Node(4);
        Node n5=new Node(12);
        Node n6=new Node(10);
        //Node n7=new Node(14);

        n0.setLeft(n1);
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n5.setLeft(n6);
        // n5.setRight(n7);

       PrintBSTKeysInRange p=new PrintBSTKeysInRange();

        p.printKeys(n0,21,26);

    }



}
