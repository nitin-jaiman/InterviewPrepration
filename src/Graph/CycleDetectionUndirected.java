package Graph;

/**
 * Created by apple on 17/03/17.
 */
public class CycleDetectionUndirected extends DisJointSet {

    /**
     * If at any point parent of two vertices having an edge b/w them is same there is a cycle
     * in main method get all nodes
     * get all edges and use union between those nodes having edges.
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public boolean union(Long p1,Long p2){


        Node parent1=findSet(p1);
        Node parent2=findSet(p2);

        if(parent1==parent2){return true;}

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

        return false;

    }

}
