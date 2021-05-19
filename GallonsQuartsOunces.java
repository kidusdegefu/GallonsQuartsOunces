// Kidus Degefu
// kwdegefu18@ole.augie.edu
// GallonsQuartsOunces.java

public class GallonsQuartsOunces {
    //Output: Converts total ounces to gallons, quarts, and ounces
    public static void main(String[] args) {

        int totalOunces = 200 ;

        int gallon = (int)(totalOunces * 0.00782) ;
        Double actualGallon = totalOunces * 0.00782 ;
        Double leftGallon = actualGallon - gallon ;

        int quart = (int)(4 * leftGallon) ;
        Double actualQuart = 4 * leftGallon ;
        Double leftQuart = actualQuart - quart ;

        int ounce = (int)(32 * leftQuart) ;


        System.out.println(totalOunces + " ounces = " + gallon + " gallons "
                            + quart + " quarts " + ounce + " ounces ") ;

    }
}
