package Graph;

import java.util.HashSet;
import java.util.Stack;

/**
 * Created by apple on 16/03/17.
 */
public class DFS {



    public void traverseDFS(Node n){

        HashSet<Node> hs=new HashSet<>();
        Stack<Node> stack=new Stack<>();

        stack.add(n);
        hs.add(n);


        while(!stack.isEmpty()){

            Node c=stack.pop();
            System.out.println(c.getData());

            for(Node nn:c.getaList()){

                if(!hs.contains(nn)){
                    stack.add(nn);
                    hs.add(nn);

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



        DFS dFS=new DFS();
        dFS.traverseDFS(n0);

    }

}
