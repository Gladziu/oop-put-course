package pl.poznan.put.conversion;

//Time converter, finall results
public class ConvertTime implements ConvertAndDisplay{
    private double valueToConvert;
    public ConvertTime(double mainValue){
        valueToConvert = mainValue;
    }

    @Override
    public void convertAndDisplay(){
        if (valueToConvert >= 0){
            double ns = valueToConvert * 1000000000;
            double µs = valueToConvert * 1000000;
            double ms = valueToConvert * 1000;
            double s = valueToConvert;
            double min = (double) (valueToConvert / 60);
            double h = (double) (valueToConvert / 3600);
            System.out.println(ns + "[ns], " + µs + "[µs], " + ms + "[ms], " + s + "[s], " + min + "[min], " + h + "[h]");
        }
    }
}
