package Graph;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

/**
 * Created by apple on 16/03/17.
 */
public class CycleDetectionDirected {



    public boolean checkCycle(Set<Node> white){


        Set<Node> grey=new HashSet<Node>();
        Set<Node> black=new HashSet<Node>();

        while(white.size()>0) {

            Node node = white.iterator().next();
           if((DFS(node, white, grey, black))){return true;};

        }

        return false;

    }

    public boolean DFS(Node node,Set<Node> white,Set<Node> grey,Set<Node> black){

        moveVertex(node,white,grey);

        for(Node n:node.getaList()){


            if(black.contains(n)){continue;}

            if(grey.contains(n)){
                System.out.println(n.getData());

                return true;}
            else if(DFS(n,white,grey,black)){
                System.out.println(n.getData());

                return true;
            }


        }

        moveVertex(node,grey,black);
        return false;

    }


    private void moveVertex(Node n,Set<Node> source, Set<Node> destination ){

        source.remove(n);
        destination.add(n);


    }




    public static void main(String args[]){

        Node n5=new Node();
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();
        Node n6=new Node();

        n5.getaList().add(n6);

        n5.setData(5);
        n6.setData(6);

        n1.setData(1);
        n1.getaList().add(n3);
        n1.getaList().add(n2);

        n2.setData(2);
        n2.getaList().add(n3);

        n3.setData(3);
        n3.getaList().add(n5);

        n4.setData(4);
        n4.getaList().add(n1);
        n4.getaList().add(n5);

        n6.getaList().add(n4);



        Set<Node> white=new HashSet<Node>();
        white.add(n1);
        white.add(n2);
        white.add(n3);
        white.add(n4);
        white.add(n5);
        white.add(n6);


        CycleDetectionDirected cycleDetectionDirected=new CycleDetectionDirected();
        System.out.println(cycleDetectionDirected.checkCycle(white));


    }

}
