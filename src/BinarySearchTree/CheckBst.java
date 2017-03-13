package BinarySearchTree;

import Tree.ChildrenSumProperty;
import Tree.Node;
import Tree.TreeTraversal;

/**
 * Created by apple on 08/02/17.
 */
public class CheckBst {

    /**
     * http://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
     * Time Complexity: O(n)
     * Auxiliary Space : O(1) if Function Call Stack size is not considered, otherwise O(n)
     * @param node
     * @return
     */
    public boolean checkBst(Node node){





        if(node.getLeft()!=null&&node.getRight()!=null){

            if(checkBst(node.getLeft())&&checkBst(node.getRight())&&Integer.parseInt(node.getStringValue())>Integer.parseInt(node.getLeft().getStringValue())&&Integer.parseInt(node.getStringValue())<=Integer.parseInt(node.getRight().getStringValue())){


                return true;

            }else{

                return false;
            }

        }else if(node.getLeft()==null&&node.getRight()==null){

            return true;
        }

        else if(node.getRight()==null){

          return   checkBst(node.getLeft())&&Integer.parseInt(node.getLeft().getStringValue())<Integer.parseInt(node.getStringValue());

        } else{

          return   checkBst(node.getRight())&&Integer.parseInt(node.getRight().getStringValue())>=Integer.parseInt(node.getStringValue());

        }




    }


    /**
     * Method 3 using utility method
     *There is one more easy method which is do in order traversal and check wheather elements are sorted or not
     * @param node
     * @return
     */
    public Boolean checkBst2(Node node){


        return checkBst2Util(node,Integer.MIN_VALUE,Integer.MAX_VALUE);

    }

    public boolean checkBst2Util(Node node, Integer min,Integer max){


        if(node==null){return true;}

        int nodeData=Integer.parseInt(node.getStringValue());

        if(nodeData<min||nodeData>max){

            return false;

        }

      return   checkBst2Util(node.getLeft(),min,Integer.parseInt(node.getStringValue())-1)
              &&
              checkBst2Util(node.getRight(),Integer.parseInt(node.getStringValue())+1,max);



    }



    public static void main(String args[]){

        Node n1=new Node("4");
        Node n2=new Node("2");
        Node n3=new Node("5");
        Node n4=new Node("1");
        Node n5=new Node("3");
        n1.setLeft(n2);
        n1.setRight(n3);

        n2.setLeft(n4);
        n2.setRight(n5);


        System.out.println(new CheckBst().checkBst2(n1));
    }


}
