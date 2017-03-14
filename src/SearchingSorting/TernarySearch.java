package SearchingSorting;

/**
 * Created by apple on 14/03/17.
 */
public class TernarySearch {


    public int getItemIndex(int v[],int l,int r,int x){

        if(l>r){return -1;}


        int mid1=l+(r-l)/3;
        int mid2=r-(r-l)/3;

        if(v[mid1]==x){return mid1;}
        if(v[mid2]==x){return mid2;}


        if(x<v[mid1]){return getItemIndex(v,l,mid1-1,x);}
        else if(x>v[mid2]){return getItemIndex(v,mid2+1,r,x);}
        else{return getItemIndex(v,mid1+1,mid2-1,x);}

    }


    public static void main(String args[]){

        TernarySearch t=new TernarySearch();
        System.out.println( t.getItemIndex(new int[]{1,2,7,14,55,56,70},0,6,7));


    }

}
