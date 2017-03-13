package Tree;

/**
 * Created by apple on 07/02/17.
 */
public class ConvertToChildrenSumProperty {


    /**
     * http://www.geeksforgeeks.org/convert-an-arbitrary-binary-tree-to-a-tree-that-holds-children-sum-property/
     * Time Complexity: O(n^2), Worst case complexity is for a skewed tree such that nodes are in decreasing order from root to leaf.
     * main things to note is when diff<0 and increment function
     * @param node
     */
    public static void makeChicldrenSumProperty(Node node){


        if(node==null||(node.getLeft()==null&&node.getRight()==null)){
            return ;

        }else{

            makeChicldrenSumProperty(node.getLeft());
            makeChicldrenSumProperty(node.getRight());

            if(node.getRight()==null){


                    node.setStringValue(getInt(node.getStringValue())+getInt(node.getLeft().getStringValue())-getInt(node.getStringValue())+"");

                return;
            }

            if(node.getLeft()==null){

                node.setStringValue(getInt(node.getStringValue())+getInt(node.getRight().getStringValue())-getInt(node.getStringValue())+"");


                return;
            }


            int diff=getInt(node.getRight().getStringValue())+getInt(node.getLeft().getStringValue())-getInt(node.getStringValue());

            if(diff>0){

                node.setStringValue(getInt(node.getStringValue())+diff+"");


            }else{

                increment(node, diff);


            }





        }


    }

    private static void increment(Node node, int diff) {
        if(node.getLeft()!=null){

            node.getLeft().setStringValue(getInt(node.getLeft().getStringValue())+Math.abs(diff)+"");
            increment(node.getLeft(),Math.abs(diff));

        }
        else if(node.getRight()!=null){

            node.getRight().setStringValue(getInt(node.getRight().getStringValue())+Math.abs(diff)+"");
            increment(node.getRight(),Math.abs(diff));

        }
    }

    private static int getInt(String s){


        return Integer.parseInt(s);
    }

    public static void main(String args[]){

        Node n1=new Node("50");
        Node n2=new Node("7");
        Node n3=new Node("2");
        Node n4=new Node("3");
        Node n5=new Node("5");
        Node n6=new Node("1");
        Node n7=new Node("30");

        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);

        n3.setLeft(n6);
        n3.setRight(n7);

        System.out.println(new ChildrenSumProperty().checkChicldrenSumProperty(n1));
        new TreeTraversal().levelOrderTraversal(n1);
        makeChicldrenSumProperty(n1);
        System.out.println(new ChildrenSumProperty().checkChicldrenSumProperty(n1));
        new TreeTraversal().levelOrderTraversal(n1);

    }


}
