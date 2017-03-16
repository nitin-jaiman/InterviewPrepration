package Matrix;

/**
 * Created by apple on 16/03/17.
 */
public class ABooleanMatrixQuestion{


    public boolean[][] getMatrix(boolean v[][]){

        boolean c = false,r = false;

        for(int i=0;i<v.length;i++){

            if(v[i][0]){r=true; break;}

        }
        for(int i=0;i<v[i].length;i++){

            if(v[0][i]){c=true; break;}

        }

        for(int i=1;i<v.length;i++){

            for(int j=1;j<v[i].length;j++){

                if(v[i][j]){v[0][j]=true;v[i][0]=true;}

            }

        }

        for(int i=1;i<v.length;i++){

            if(v[i][0]){

                for(int j=1;j<v[i].length;j++){

                    v[i][j]=true;

                }


            }

        }
        for(int i=1;i<v[0].length;i++){

            if(v[0][i]){

                for(int j=1;j<v.length;j++){

                    v[j][i]=true;

                }


            }

        }


        if(r) {
            for (int i = 0; i < v.length; i++) {

                v[i][0] = true;


            }
        }
        if(c) {
            for (int i = 0; i < v[0].length; i++) {

                v[0][i]=true;


            }
        }

        return v;
    }



    public static void main(String args[]){

        ABooleanMatrixQuestion a=new ABooleanMatrixQuestion();
        boolean v[][]=a.getMatrix(new boolean[][]{{true,false,false,true},{false,false,true,false},{false,false,false,false}});

        for(int i=0;i<v.length;i++){


            for(int j=0;j<v[i].length;j++){

                System.out.print(v[i][j]+" ");

            }

            System.out.println();

        }



    }

}
