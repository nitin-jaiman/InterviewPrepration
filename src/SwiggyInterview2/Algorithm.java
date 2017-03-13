package SwiggyInterview2;

import java.util.ArrayList;

public class Algorithm {


    private static final double ERROR_VALUE = 15; //15 degrees is the default error value


    private Double alterationAngle = 0d; // alteration angle keeps track of frame of reference of angle
    private Long currentTimeStamp = 0L;

    private Double speed;

    public Algorithm(Double speed) {

        this.speed = speed;

    }


    public void processPoints(ArrayList<DataHolder> dataHolders) {


        for (int i = 0; i < dataHolders.size() - 1; i++) {

            DataHolder dataHolderCurent = dataHolders.get(i);
            DataHolder dataHolderNext = dataHolders.get(i + 1);

            Double distance = Haversine.distance(dataHolderCurent.getLat(), dataHolderCurent.getLng(), dataHolderNext.getLat(), dataHolderNext.getLng()) * 1000;
            Double angle = Haversine.bearing(dataHolderCurent.getLat(), dataHolderCurent.getLng(), dataHolderNext.getLat(), dataHolderNext.getLng());


            Double alteredAngle = angle + alterationAngle;
            alteredAngle = handleCornerCase(alteredAngle);

            processAngleAndDistance(dataHolderCurent, distance, alteredAngle);

        }

        DataHolder last = dataHolders.get(dataHolders.size() - 1);
        last.setInstruction(currentTimeStamp + ": Reached Destination"); //for last coordinate


    }


    /**
     * this method handles corner cases for angle
     * @param alteredAngle
     * @return
     */
    private Double handleCornerCase(Double alteredAngle) {

        if (alteredAngle < 0) {

            return 360 + alteredAngle;

        } else if (alteredAngle > 360) {

            return (alteredAngle % 360);

        } else {

            return alteredAngle;

        }


    }


    private void processAngleAndDistance(DataHolder dataHolder, Double distance, Double angle) {

        if (angle >= (360d - ERROR_VALUE) || angle <= (0d + ERROR_VALUE)) {


            dataHolder.setInstruction(currentTimeStamp + ": Go straight for " + distance + " meters");
            setCurrentTimeStamp(distance);


        } else if (angle >= (90d - ERROR_VALUE) && angle <= (90d + ERROR_VALUE)) {


            dataHolder.setInstruction(currentTimeStamp + ": Take a right turn and go straight for " + distance + " meters");
            setCurrentTimeStamp(distance);
            alterationAngle = alterationAngle - 90d; // turned right


        } else if (angle > 0 && angle < 90) {


            dataHolder.setInstruction(currentTimeStamp + ": Slide right for " + distance + " meters");
            setCurrentTimeStamp(distance);
            alterationAngle = alterationAngle - angle; // slight right angle


        } else if (angle >= (270d - ERROR_VALUE) && angle <= (270d + ERROR_VALUE)) {


            dataHolder.setInstruction(currentTimeStamp + ": Take a left turn and go straight for " + distance + " meters");
            setCurrentTimeStamp(distance);
            alterationAngle = alterationAngle + 90d;
        } else if (angle > 270 && angle < 360) {


            dataHolder.setInstruction(currentTimeStamp + ": Slide left for " + distance + " meters");
            setCurrentTimeStamp(distance);
            alterationAngle = alterationAngle + (angle-270d);


        } else if (angle >= (180d - ERROR_VALUE) && angle <= (180d + ERROR_VALUE)) {


            dataHolder.setInstruction(currentTimeStamp + ": Take a U turn and go straight for " + distance + " meters");
            setCurrentTimeStamp(distance);
            alterationAngle = alterationAngle - 180d;


        } else {

            if (angle > 180 && angle < 270) {


                dataHolder.setInstruction(currentTimeStamp + ": Slide left U for " + distance + " meters");
                setCurrentTimeStamp(distance);
                alterationAngle = alterationAngle - angle;
            } else if (angle > 90 && angle < 180) {


                dataHolder.setInstruction(currentTimeStamp + ": Slide right U for " + distance + " meters");
                setCurrentTimeStamp(distance);
                alterationAngle = alterationAngle - angle;

            }

        }


    }

    private void setCurrentTimeStamp(Double distance) {
        currentTimeStamp = (currentTimeStamp + (long) (distance / speed));
    }


}
