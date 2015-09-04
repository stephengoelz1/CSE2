//Stephen Goelz
// Lab O2 Cyclometer 9/4/2015
// Program to calculate various stats about a bike ride
//Including: # of minutes, # of counts, distance in miles of 1 trip and combined distance
//
public class Cyclometer {
    public static void main (String[] args) { 
    
        int secsTrip1=480; //length in seconds of trip 1
        int secsTrip2=3320; // length in seconds of trip 2
        int countsTrip1=1561; // # of revolutions of the front wheel during trip 1
        int countsTrip2=9037; // # of revolutions of the front wheel during trip 2
        double wheelDiameter=27.0; // diamter of wheel
        float PI=3.14f; // known value of Pi
        int feetPerMile=5280; // # of feet in a mile
        int inchesPerFoot=12; // # of inches in a foot
        int secondsPerMinute=60; // # of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //variables declared so calculations can be done later on
        System.out.println ("Trip 1 took "+ (secsTrip1/secondsPerMinute) + " minutes and had " + 
        countsTrip1 + " counts."); //displays the length of trip 1 in seconds and the # of counts
        System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute) + " minutes and had " +
        countsTrip2 + " counts.");  //displays the length of trip 2 in seconds and the # of counts 
        
       
        distanceTrip2=(countsTrip2*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
        distanceTrip1=(countsTrip1*wheelDiameter*PI)/(inchesPerFoot*feetPerMile);
        // above gives distance in miles
        // (for each count, a rotation of the wheel travels
        // the diameter in inches times PI, that is divided by inches 
        //to get the # of feet, that is divided by the number of feet in a mile
         totalDistance=distanceTrip1+distanceTrip2;
        System.out.println (("Trip 1 was ")+distanceTrip1+ (" miles" ));
        System.out.println (("Trip 2 was ")+distanceTrip2+ (" miles" ));
        System.out.println (("The total distance was ") +totalDistance+ (" miles"));
        
    }
}