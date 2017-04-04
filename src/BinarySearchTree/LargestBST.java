package BinarySearchTree;

import Tree.Node;

/**
 * Created by apple on 04/04/17.
 */
public class LargestBST {



    public MinMax isBst(Node root){


        if(root==null){return new MinMax();}

        MinMax left=isBst(root.getLeft());
        MinMax right=isBst(root.getRight());

        MinMax minMax=new MinMax();

        if(left.isBST&&right.isBST&&right.min>root.getIntValue()&&left.max<root.getIntValue()){

            minMax.size=1+left.size+right.size;
            minMax.isBST=true;
            if(root.getLeft()==null){

                minMax.min=root.getIntValue();

            }else{

                minMax.min=left.max;
            }

            if(root.getRight()==null){

                minMax.max=root.getIntValue();

            }else{

                minMax.max=right.min;

            }

        }else{

            minMax.isBST=false;
            minMax.size=Math.max(left.size,right.size);


        }


        return minMax;

    }


    public static void main(String args[]){
        Node n0=new Node(25);
        Node n1=new Node(6);
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

        LargestBST largestBST=new LargestBST();
        MinMax minMax=largestBST.isBst(n0);

        System.out.println(minMax.size+" max "+minMax.max+" min "+minMax.min);


    }


    class MinMax{

        public int min;
        public int max;
        public int size;
        public boolean isBST;

        public MinMax(){

            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            size=0;
            isBST=true;

        }


    }


}
