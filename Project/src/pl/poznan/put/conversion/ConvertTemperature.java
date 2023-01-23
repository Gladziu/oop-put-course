package src.pl.poznan.put.coversion;
//Temperature converter, finall results
public class ConvertTemperature implements ConvertAndDisplay{
    private double valueToConvert;
    private Boolean endOfLoop;
    public ConvertTemperature(double mainValue, Boolean endOfLoop){
        valueToConvert = mainValue;
        this.endOfLoop = endOfLoop;
    }

    @Override
    public void convertAndDisplay(){
        if (endOfLoop == true){
            double c = valueToConvert;
            double f = ((valueToConvert * 9) / 5) + 32;
            double k = valueToConvert + 273;
            System.out.println(c + "[C], " + f + "[F], " + k + "[K]");
        }
    }
}
