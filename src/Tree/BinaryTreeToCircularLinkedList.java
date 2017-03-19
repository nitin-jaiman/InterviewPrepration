package Tree;

/**
 * Created by apple on 19/03/17.
 */
public class BinaryTreeToCircularLinkedList {



    public Node concatinate(Node a,Node b){

        if(a==null){return b;}
        if(b==null){return a;}

        Node aEnd=a.getLeft();
        Node bEnd=b.getLeft();

        aEnd.setRight(b);
        b.setLeft(aEnd);
        bEnd.setRight(a);
        a.setLeft(bEnd);

        return a;
    }

    public Node toLinkedList(Node root){

        if(root==null){return root;}

       Node l= toLinkedList(root.getLeft());
       Node r= toLinkedList(root.getRight());

        root.setLeft(root);
        root.setRight(root);


       root= concatinate(l,root);
       root= concatinate(root,r);

        return root;
    }


    public static void main(String args[]){



    }



}
