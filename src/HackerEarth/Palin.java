package HackerEarth;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;


class Palin {
    public static void main(String args[] ) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);

        //Scanner
      //  Scanner s = new Scanner(System.in);
       // int N = s.nextInt();




        for (int i = 0; i < N; i++) {


            String s[]=br.readLine().split(" ");
            int st=Integer.parseInt(s[0].substring(0,2));
            int en=Integer.parseInt(s[1].substring(0,2));

            int count=0;



            int sc=Integer.parseInt(s[0].substring(2,4));

            if((st>=0&&en<6)||(st>=10&&en<16)||(st>=20&&st<=23)){

                String rev="";

                if(st<6){

                    rev=st+"0";

                }else{

                    StringBuffer stringBuffer=new StringBuffer(""+st);
                    rev = stringBuffer.reverse().toString();

                }

                if(Integer.parseInt(rev)<=sc) {


                    count++;

                }
            }


            for(int j=st+1;j<en;j++){

                if((j>=0&&j<6)||(j>=10&&j<16)||(j>=20&&j<=23)){

                    count++;
                }

            }

            int bc=Integer.parseInt(s[1].substring(2,4));

            if((en>=0&&en<6)||(en>=10&&en<16)||(en>=20&&en<=23)){

                String rev="";

                if(en<6){

                    rev=en+"0";

                }else{

                    StringBuffer stringBuffer=new StringBuffer(""+en);
                   rev = stringBuffer.reverse().toString();

                }

                if(Integer.parseInt(rev)<=bc) {


                    count++;

                }
            }

            System.out.println(count);

        }


    }
}
