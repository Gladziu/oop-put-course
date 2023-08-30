import pl.poznan.put.check.CorrectUnit;
import pl.poznan.put.conversion.*;
import pl.poznan.put.initial_value.*;

import java.util.Scanner;

//Unit converter for length, mass, time and temperature
public class Application{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("UNIT CONVERTER - length, weight, time, temperature");
        //input value
        System.out.print("1. Enter value: ");
        double value = scan.nextDouble();
        scan.nextLine(); //scanning end of line
        System.out.print("Units \n" +
                "length: mm, cm, dm, m, km \n" +
                "mass: mg, g, dkg, kg, t \n" +
                "time: ns, µs, ms, s, min, h \n" +
                "temperature: C, F, K \n");
        //input unit
        System.out.print("2. Enter unit: ");
        String unit = scan.nextLine();
        
        //check if unit is correct and if input value is correct
        try {
            CorrectUnit check = new CorrectUnit(value, unit); 
            check.check();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
            main(args);
        }
        
        ValueAndUnit valueAndUnit = new ValueAndUnit(value, unit);

        //Convert to main values(m,kg,s,C)
        ConvertLenght meters = valueAndUnit.toMainValueLenght();
        ConvertWeight kilograms = valueAndUnit.toMainValueWeight();
        ConvertTime seconds = valueAndUnit.toMainValueTime();
        ConvertTemperature celcius = valueAndUnit.toMainValueTemperature();

        //convert and display finall results
        meters.convertAndDisplay();
        kilograms.convertAndDisplay();
        seconds.convertAndDisplay();
        celcius.convertAndDisplay();
    }
}
