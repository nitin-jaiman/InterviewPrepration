package LinkedList;

/**
 * Created by apple on 26/02/17.
 */
public class ReverseLinkedListByK {


    public Node reverseByK(Node head,int k){


        int count=0;
        Node current=head;
        Node next=null;
        Node prev=null;

        while(count<k&&current!=null){

            next=current.getNextNode();
            current.setNextNode(prev);
            prev=current;
            current=next;

        }

        if(next!=null)
        head.setNextNode(reverseByK(next,3));

        return current;

    }

    public static void main(String args[]){





    }

}
