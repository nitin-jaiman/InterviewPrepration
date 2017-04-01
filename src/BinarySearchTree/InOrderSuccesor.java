package BinarySearchTree;

import Tree.Node;

/**
 * Created by apple on 01/04/17.
 */
public class InOrderSuccesor {

    //what will come after data in inorder traversal in O(H)
    public int inOrderSuccesor(int data, Node root){

        Node current = search(data,root);
        if(current==null) return -1;
        if(current.getRight()!=null){return min(current.getRight());}

        Node succ=root;
        while(root.getIntValue()!=data){
        if(root.getIntValue()>data){

            succ=root;
            root=root.getLeft();

        }else if(root.getIntValue()<data){

            root=root.getRight();

        }
        }

        return succ.getIntValue();
    }

    public Node search(int data, Node root){

        if(root.getIntValue()>data){

           return search(data,root.getLeft());

        }else if(root.getIntValue()<data){

           return search(data, root.getRight());
        }else{

            return root;
        }


    }

    public int min(Node n){

        if(n.getLeft()==null){return n.getIntValue();}

        return min(n.getLeft());
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

        InOrderSuccesor inOrderSuccesor=new InOrderSuccesor();

        System.out.println(inOrderSuccesor.inOrderSuccesor(12,n0));


    }

}
