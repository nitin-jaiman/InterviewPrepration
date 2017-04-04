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


    /**
     * O(h)
     * @param node
     * @param k
     */
    public int kElement(Node node,int k){

        if(k==node.getLeftSize()+1){return node.getIntValue();}

        if(k>node.getLeftSize()+1){

           return kElement(node.getRight(),(k-(1+node.getLeftSize())));

        }else{

            return kElement(node.getLeft(),k);
        }


    }


    public static void main(String args[]){

        Node n1=new Node(20);
        Node n2=new Node(8);
        Node n3=new Node(22);
        Node n4=new Node(4);
        Node n5=new Node(12);
        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n1.setLeftSize(3);
        n2.setLeftSize(1);
        n3.setLeftSize(0);
        n4.setLeftSize(0);
        n5.setLeftSize(0);


        System.out.println(new KthElementInBst().kElement(n1,1));
    }





}
