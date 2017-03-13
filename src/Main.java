import Tree.Node;

public class Main {




    private void traverse(Node root){


        if(root==null){

            return;

        }

        System.out.println(root.getStringValue());

        traverse(root.getLeft());
        traverse(root.getRight());







    }




    public static void main(String[] args) {


        Node n1=new Node("A");
        Node n2=new Node("B");
        Node n3=new Node("C");
        Node n4=new Node("D");
        Node n5=new Node("E");
        Node n6=new Node("F");

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);


        Main m=new Main();
        m.traverse(n1);




        //System.out.println("Hello World!");


    }
}
