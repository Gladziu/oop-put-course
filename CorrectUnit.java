import java.util.ArrayList;

public class CorrectUnit {
    private double value;
    private String unit;

    public CorrectUnit(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    //Array of all correct units
    public static ArrayList<String> correctUnitsArray(){
       ArrayList <String> listOfUnits = new ArrayList<String>();
       
        // Lenght 
        listOfUnits.add("mm"); //0.001
        listOfUnits.add("cm"); //0.01
        listOfUnits.add("dm"); //0.1
        listOfUnits.add("m");  //1 
        listOfUnits.add("km"); //1000

        // Weight
        listOfUnits.add("mg");  //1 000 000
        listOfUnits.add("g");   //1000
        listOfUnits.add("dkg"); //100
        listOfUnits.add("kg");  //1
        listOfUnits.add("t");   //0.001

        // Time
        listOfUnits.add("ns");  //1 000 000 000
        listOfUnits.add("µs");  //1 000 000
        listOfUnits.add("ms");  //1000
        listOfUnits.add("s");   //1
        listOfUnits.add("min"); // /60
        listOfUnits.add("h");   // /3600

        // Temperature
        listOfUnits.add("C"); //100
        listOfUnits.add("F"); 
        listOfUnits.add("K"); // +273

        return listOfUnits;
        }
        
    
    public void check() throws IllegalArgumentException{
         //check if input value is bigger than 0
         if (value <= 0){
            //but the temperature can be less than 0
            if (unit.equals("C") || unit.equals("K") || unit.equals("F")){
                return;
            }
            throw new IllegalArgumentException("Incorrect value. Value need to be bigger than 0.");
         }
        //check if unit is on list of correct units
        for (String element : CorrectUnit.correctUnitsArray()){
             if(element.contains(unit)){
                return;
            }      
        }
        throw new IllegalArgumentException(" Incorrect unit format. Correct units: "+ correctUnitsArray() +" ");
    }
}
