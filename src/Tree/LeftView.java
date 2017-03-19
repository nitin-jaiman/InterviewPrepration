package Tree;

/**
 * Created by apple on 19/03/17.
 */
public class LeftView {

    int max=-1;


    public void printLeftView(Node node,int level){

        if(node==null){return;}

        if(max<level){

            System.out.println("Data "+node.getStringValue());
            max=level;
        }

        printLeftView(node.getLeft(),level+1);
        printLeftView(node.getRight(),level+1);

    }


    public static void main(String args[]){


        Node n1=new Node("10");
        Node n2=new Node("8");
        Node n3=new Node("2");
        Node n4=new Node("3");
        Node n5=new Node("5");
        Node n6=new Node("6");

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);

        new LeftView().printLeftView(n1,0);

    }



}
