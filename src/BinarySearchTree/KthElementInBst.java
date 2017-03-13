package BinarySearchTree;

import Tree.Node;

/**
 * Created by apple on 11/02/17.
 */
public class KthElementInBst {

    int count=0;



    public void kThElement(Node node,int k){


        if(node==null){
            return;
        }

        kThElement(node.getLeft(),k);


            count++;
        if(count==k){


            System.out.println("count "+count+" element "+node.getStringValue());

        }else {

            kThElement(node.getRight(), k);
        }
    }



    public static void main(String args[]){

        Node n1=new Node("20");
        Node n2=new Node("8");
        Node n3=new Node("22");
        Node n4=new Node("4");
        Node n5=new Node("12");
        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);


        new KthElementInBst().kThElement(n1,5);
    }


}
