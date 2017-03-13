package SwiggyInterview2;

public class Series {

    int last;
    int lastToLast;


    public boolean isXPresent(int a, int b, int x) {

        Boolean isPresent = false;

        last = b;
        lastToLast = a;

        if (b > 0 && a > 0 && x < 0) {

            return false;
        } else if (b < 0 && a < 0 && x > 0) {

            return false;
        } else if (a == 0 && b == 0 ) {

            if(x!=0) {
                return false;
            }else{

                return true;
            }
        }
        else {

            while ((last + lastToLast <= x && x > 0) || (last + lastToLast >= x && x < 0)) {

                if(last<0&&lastToLast<0&&x>0){

                    return false;
                }
                if(lastToLast>0&&last>0&&x<0){

                    return false;
                }

                int curr = last + lastToLast;
                System.out.println(curr);
                lastToLast = last;
                last = curr;
                if (curr == x) {
                    isPresent = true;
                    break;
                }


            }

            return isPresent;


        }

    }

    public static void main(String args[]){

        Series series=new Series();
        System.out.println( series.isXPresent(-2,1,8));


    }


}
