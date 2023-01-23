package src.pl.poznan.put.coversion;

//Weight converter, finall results
public class ConvertWeight implements ConvertAndDisplay{
    private double valueToConvert;
    public ConvertWeight(double mainValue){
        valueToConvert = mainValue;
    }
    
    @Override
    public void convertAndDisplay(){
        if (valueToConvert >= 0){
            double mg = valueToConvert * 1000000;
            double g = valueToConvert * 1000;
            double dkg = valueToConvert * 100;
            double kg = valueToConvert;
            double t = valueToConvert / 1000;
            System.out.println(mg + "[mg], " + g + "[g], " + dkg + "[dkg], " + kg + "[kg], " + t + "[t]");
        }
    }
}
