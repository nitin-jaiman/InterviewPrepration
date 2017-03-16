package Graph;

import java.util.*;

/**
 * Created by apple on 16/03/17.
 */
public class BFS {


    public void traverseBFS(Node n){

        HashSet<Node> hs=new HashSet<>();
        Queue<Node> queue=new LinkedList<>();

        queue.add(n);
        hs.add(n);


        while(!queue.isEmpty()){

            Node c=queue.poll();

            System.out.println(c.getData());
            for(Node nn:c.getaList()){

                if(!hs.contains(nn)){

                    hs.add(nn);
                    queue.add(nn);
                }

            }


        }


    }

    public static void main(String args[]){

        Node n0=new Node();
        Node n1=new Node();
        Node n2=new Node();
        Node n3=new Node();
        Node n4=new Node();

        n0.getaList().add(n1);
        n0.getaList().add(n4);

        n0.setData(0);

        n1.setData(1);
        n1.getaList().add(n0);
        n1.getaList().add(n3);
        n1.getaList().add(n2);

        n2.setData(2);
        n2.getaList().add(n1);
        n2.getaList().add(n3);

        n3.setData(3);
        n3.getaList().add(n1);
        n3.getaList().add(n2);
        n3.getaList().add(n4);

        n4.setData(4);
        n4.getaList().add(n0);
        n4.getaList().add(n3);



        BFS bFS=new BFS();
        bFS.traverseBFS(n0);

    }


}
