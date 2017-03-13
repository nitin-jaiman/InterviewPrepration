package Tree;

/**
 * Created by apple on 07/02/17.
 */

/**
 * http://www.geeksforgeeks.org/check-for-children-sum-property-in-a-binary-tree/
 * Time Complexity: O(n), we are doing a complete traversal of the tree.
 */
public class ChildrenSumProperty {

    public boolean checkChicldrenSumProperty(Node node){


        if(node==null||(node.getLeft()==null&&node.getRight()==null)){
            return true;

        }else{

            if(node.getRight()==null){

               return getInt(node.getLeft().getStringValue())== getInt(node.getStringValue());

            }

            if(node.getLeft()==null){

                return getInt(node.getRight().getStringValue())== getInt(node.getStringValue());


            }

            if(getInt(node.getLeft().getStringValue())+getInt(node.getRight().getStringValue())==getInt(node.getStringValue())){


                return checkChicldrenSumProperty(node.getLeft())&&checkChicldrenSumProperty(node.getRight());
            }else{

                return false;
            }



        }


    }

    private int getInt(String s){


        return Integer.parseInt(s);
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

        System.out.println(new ChildrenSumProperty().checkChicldrenSumProperty(n1));

    }


}
