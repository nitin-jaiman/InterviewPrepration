package HackerEarth;

/**
 * Created by apple on 19/02/17.
 */
public class GenericTest<T> {

    T obj;

    GenericTest(T t){

        obj=t;

    }

    public T getObj(){



        return this.obj;
    }

    public <T> void printObject(T t){

        System.out.println(t);

    }


    public static void main(String args[]){

        GenericTest<String> g=new GenericTest<>("string it is");

        g.printObject(g.getObj());


    }

}
