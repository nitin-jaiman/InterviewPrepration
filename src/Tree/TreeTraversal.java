package Tree;

import java.util.*;

/**
 * Created by apple on 14/01/17.
 *
 * http://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
 *
 */
public class TreeTraversal implements Cloneable {

    TreeMap<Integer,LinkedList<Node>> hm=new TreeMap<>();



    private void preOrder(Node root){


        if(root==null){

            return;

        }

        System.out.print(root.getStringValue()+" , ");

        preOrder(root.getLeft());
        preOrder(root.getRight());

    }
    public void inOrder(Node root){


        if(root==null){

            return;

        }


        inOrder(root.getLeft());

        System.out.print(root.getStringValue()+" , ");

        inOrder(root.getRight());

    }
    private void postOrder(Node root){


        if(root==null){

            return;

        }


        postOrder(root.getLeft());
        postOrder(root.getRight());


        System.out.println(root.getStringValue());

    }

    private int size(Node n){

        if(n==null){

            return 0;
        }

        return size(n.getLeft())+size(n.getRight())+1;

    }

    private int depth(Node n){

        if(n==null){

            return 0;
        }

        return Math.max(depth(n.getLeft()),depth(n.getRight()))+1;

    }

    public void levelOrderTraversal(Node n){

        Queue<Node> queue=new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){

            Node currentNode=queue.poll();
            System.out.println(currentNode.getStringValue());

            if(currentNode.getLeft()!=null)
            queue.add(currentNode.getLeft());


            if(currentNode.getRight()!=null)
            queue.add(currentNode.getRight());

        }



    }

    private void verticalTraversal(Node n){

        HashMap<Integer,LinkedList<Node>> hm=new HashMap<>();

        Queue<Node> queue=new LinkedList<>();
        queue.add(n);
        Integer currentLevel=0;
        while(!queue.isEmpty()){

            Node currentNode=queue.poll();
           // System.out.println(currentNode.getStringValue());

            if(hm.containsKey(currentLevel)){

              LinkedList<Node> ll=  hm.get(currentLevel);
                ll.add(currentNode);
                hm.put(currentLevel,ll);

            }else{

                LinkedList<Node> ll=  new LinkedList<Node>();
                ll.add(currentNode);
                hm.put(currentLevel,ll);


            }

            if(currentNode.getLeft()!=null) {
                queue.add(currentNode.getLeft());

            }
            if(currentNode.getRight()!=null)
                queue.add(currentNode.getRight());

        }

        System.out.println(hm);


    }


    public void verticalTrav(Node node,int current){



        if(node==null){
            return;

        }

        verticalTrav(node.getLeft(),current-1);
        verticalTrav(node.getRight(),current+1);
        if(hm.containsKey(current)){

            LinkedList<Node> ll=  hm.get(current);
            ll.add(node);
            hm.put(current,ll);

        }else{

            LinkedList<Node> ll=  new LinkedList<Node>();
            ll.add(node);
            hm.put(current,ll);


        }



    }

    /**
     * time complexity O(n) - post order traversal
     * space complexity - method stack O(n)
     * http://www.geeksforgeeks.org/write-a-c-program-to-delete-a-tree/
     * @param node
     */
    private void deleteTree(Node node){

        if(node==null)return;

        deleteTree(node.getLeft());
        deleteTree(node.getRight());
        System.out.println("Node deleted "+node.getStringValue());
        node=null;



    }



    public static void main(String args[]){

        Node n1=new Node("10");
        Node n2=new Node("8");
        Node n3=new Node("2");
        Node n4=new Node("3");
        Node n5=new Node("5");
        Node n6=new Node("2");

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);

      TreeTraversal t= new TreeTraversal();
        t.verticalTrav(n1,0);

        //t.hm.so

        System.out.println(t.hm);

    }


    public TreeTraversal cloneObject() throws CloneNotSupportedException {

        return (TreeTraversal) clone();

    }


}
