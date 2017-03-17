package Graph;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by apple on 17/03/17.
 */
public class DisJointSet {

    Map<Long,Node> map=new HashMap<>();


    public void makeSet(Long data){


        Node n=new Node();
        n.setData(data);
        n.setParent(n);
        n.setRank(0);
        map.put(data,n);


    }

    public Node findSet(Long data){

        Node n=map.get(data);
        if(n.getParent()==n){return n;}
        Node p=findSet(n.getParent().getData());
        return p;


    }

    public boolean union(Long p1,Long p2){


        Node parent1=findSet(p1);
        Node parent2=findSet(p2);

        if(parent1==parent2){return false;}

        if(parent1.getRank()>=parent2.getRank()){

            if(parent1.getRank()==parent2.getRank()){

                parent1.setRank(parent1.getRank()+1);
                parent2.setParent(parent1);

            }else{

                parent2.setParent(parent1);

            }


        }else{

            parent1.setParent(parent2);

        }

     return true;

    }




    class Node{

        private Long data;
        private int rank;
        private Node parent;

        public Long getData() {
            return data;
        }

        public void setData(Long data) {
            this.data = data;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        @Override
        public String toString() {
            return getData().toString();
        }
    }


    public static void main(String args[]) {
        DisJointSet ds = new DisJointSet();
        ds.makeSet(1L);
        ds.makeSet(2L);
        ds.makeSet(3L);
        ds.makeSet(4L);
        ds.makeSet(5L);
        ds.makeSet(6L);
        ds.makeSet(7L);

        ds.union(1L, 2L);
        ds.union(2L, 3L);
        ds.union(4L, 5L);
        ds.union(6L, 7L);
        ds.union(5L, 6L);
        ds.union(3L, 7L);

        System.out.println(ds.findSet(1L));
        System.out.println(ds.findSet(2L));
        System.out.println(ds.findSet(3L));
        System.out.println(ds.findSet(4L));
        System.out.println(ds.findSet(5L));
        System.out.println(ds.findSet(6L));
        System.out.println(ds.findSet(7L));
    }

}
