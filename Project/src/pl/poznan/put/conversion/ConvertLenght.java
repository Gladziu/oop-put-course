package pl.poznan.put.conversion;

//Lenght converter, finall results
public class ConvertLenght implements ConvertAndDisplay{
    private double valueToConvert;
    public ConvertLenght(double mainValue){
        valueToConvert = mainValue;
    }
    
    @Override
    public void convertAndDisplay(){
        if (valueToConvert >= 0){
            double mm = valueToConvert * 1000;
            double cm = valueToConvert * 100;
            double dm = valueToConvert * 10;
            double m = valueToConvert;
            double km = valueToConvert / 1000;
            System.out.println(mm + "[mm], " + cm + "[cm], " + dm + "[dm], " + m + "[m], " + km + "[km]");
        }
       
    }
}
