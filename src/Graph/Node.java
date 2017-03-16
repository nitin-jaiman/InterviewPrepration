package Graph;

import java.util.ArrayList;

/**
 * Created by apple on 16/03/17.
 */
public class Node {

    private int data;
    private ArrayList<Node> aList=new ArrayList<Node>();

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ArrayList<Node> getaList() {
        return aList;
    }

    public void setaList(ArrayList<Node> aList) {
        this.aList = aList;
    }
}
