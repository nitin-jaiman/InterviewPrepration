package String;

/**
 * Created by apple on 17/03/17.
 */
public class LengthEncoding {


    private String getEncodedString(String s){

        if(s.length()==0){return "";}

        int count=1;
        char prev=s.charAt(0);
        String newString="";
        for(int i=1;i<s.length();i++){

            if(prev==s.charAt(i)){

                count++;
             prev=s.charAt(i);
            }
            else{

                newString=newString+count+prev;
                count=1;
                prev=s.charAt(i);
            }
        }

        newString=newString+count+prev;


        return newString;

    }


    public static void main(String args[]){

        LengthEncoding lengthEncoding=new LengthEncoding();
        System.out.println(lengthEncoding.getEncodedString("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"));


    }

}
