package SwiggyInterview2;

import java.util.ArrayList;


public class DriverClass {

    public static void main(String args[]){


        ArrayList<DataHolder> dataHolders = makeData();


        Algorithm algorithm=new Algorithm(10d); //speed in m/s

        algorithm.processPoints(dataHolders);


        for(DataHolder d:dataHolders){

            System.out.println(d.getInstruction());

        }




    }

    private static ArrayList<DataHolder> makeData() {
        DataHolder d1=new DataHolder();
        d1.setTimeStamp(1L);
        d1.setLat(12.9290566);
        d1.setLng(77.6093888);

        DataHolder d2=new DataHolder();

        d2.setTimeStamp(2L);
        d2.setLat(12.9307966);
        d2.setLng(77.6097112);


        DataHolder d3=new DataHolder();

        d3.setTimeStamp(3L);
        d3.setLat(12.9323478);
        d3.setLng(77.6099591);

        DataHolder d4=new DataHolder();

        d4.setTimeStamp(4L);
        d4.setLat(12.9330876);
        d4.setLng(77.6096137);

        DataHolder d5=new DataHolder();

        d5.setTimeStamp(4L);
        d5.setLat(12.9342438);
        d5.setLng(77.6099052);
        DataHolder d6=new DataHolder();

        d6.setTimeStamp(4L);
        d6.setLat(12.933803);
        d6.setLng(77.6107407);


        DataHolder d7=new DataHolder();

        d7.setTimeStamp(4L);
        d7.setLat(12.933467);
        d7.setLng(77.6110988);

        DataHolder d8=new DataHolder();

        d8.setTimeStamp(4L);
        d8.setLat(12.9331106);
        d8.setLng(77.6119492);

        DataHolder d9=new DataHolder();

        d9.setTimeStamp(4L);
        d9.setLat(12.9329426);
        d9.setLng(77.6121282);

        DataHolder d10=new DataHolder();

        d10.setTimeStamp(4L);
        d10.setLat(12.9319725);
        d10.setLng(77.6130682);

        DataHolder d11=new DataHolder();

        d11.setTimeStamp(4L);
        d11.setLat(12.9327301);
        d11.setLng(77.6141424);

        DataHolder d12=new DataHolder();

        d12.setTimeStamp(4L);
        d12.setLat(12.933067);
        d12.setLng(77.6147242);


        DataHolder d13=new DataHolder();

        d13.setTimeStamp(4L);
        d13.setLat(12.9328776);
        d13.setLng(77.6144557);


        DataHolder d14=new DataHolder();

        d14.setTimeStamp(4L);
        d14.setLat(12.9328776);
        d14.setLng(77.6144557);


        DataHolder d15=new DataHolder();

        d15.setTimeStamp(4L);
        d15.setLat(12.9328776);
        d15.setLng(77.6144557);


        ArrayList<DataHolder> dataHolders=new ArrayList<>();
        dataHolders.add(d1);
        dataHolders.add(d2);
        dataHolders.add(d3);
        dataHolders.add(d4);
        dataHolders.add(d5);
        dataHolders.add(d6);
        dataHolders.add(d7);
        dataHolders.add(d8);
        dataHolders.add(d9);
        dataHolders.add(d10);
        dataHolders.add(d11);
        dataHolders.add(d12);
        return dataHolders;
    }

}
