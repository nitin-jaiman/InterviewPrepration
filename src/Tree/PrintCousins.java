package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by apple on 25/02/17.
 */
public class PrintCousins {


    public static void main(String args[]){

    Node n1=new Node("1");
    Node n2=new Node("2");
    Node n3=new Node("3");
    Node n4=new Node("4");
    Node n5=new Node("5");
    Node n6=new Node("6");
    Node n7=new Node("7");

        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);
        n3.setRight(n7);

        PrintCousins p=new PrintCousins();
        p.printCousins(n1,2);


    }

    public void printCousins(Node n,int data){


        Queue<Node> queue=new LinkedList<>();
        n.setLevel(1);
        queue.add(n);
        int parentLevel=0;

        while(!queue.isEmpty()){

            Node node=queue.poll();
            Node nLeft=node.getLeft();
            Node nRight=node.getRight();
            if(nLeft!=null)
            nLeft.setLevel(node.getLevel()+1);
            if(nRight!=null)
            nRight.setLevel(node.getLevel()+1);

            if(nLeft!=null&&nRight!=null&&!nLeft.getStringValue().equals(data+"")&&!nRight.getStringValue().equals(data+"")){


                if(nLeft!=null)
                queue.add(nLeft);
                if(nRight!=null)
                queue.add(nRight);


            }else{


                if(nLeft!=null) {

                 parentLevel = nLeft.getLevel();

                }

                else if(nRight!=null){

                    parentLevel=nRight.getLevel();
                }

            }


            if(node.getLevel()==parentLevel){

                System.out.println(node.getStringValue());

            }

        }


    }


}
