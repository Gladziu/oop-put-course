import src.pl.poznan.put.check.CorrectUnit;
import src.pl.poznan.put.coversion.*;
import src.pl.poznan.put.initial_value.ValueAndUnit;

import java.util.Scanner;

//Unit converter for length, mass, time and temperature
public class Application{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("KONWERTER JEDNOSTEK - dlugosc, masa, czas, temperatura");
        
        //input value
        System.out.print("1. Podaj wartosc: ");
        double value = scan.nextDouble();
        scan.nextLine(); //scanning end of line
        
        //input unit
        System.out.print("2. Podaj jednostke: ");
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
