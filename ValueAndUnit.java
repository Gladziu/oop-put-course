public class ValueAndUnit{
        private double value;
        private String unit;
    
    //Constructor to initialize value and unit
    public ValueAndUnit(double value, String unit){
        this.value = value;
        this.unit = unit;
    }

    //Length unit - converting to meters
    public ConvertLenght toMainValueLenght(){
        if (unit.equals("mm")) {
            value /= 1000;
            return new ConvertLenght(value);

        } else if (unit.equals("cm")) {
            value /= 100;
            return new ConvertLenght(value);

        } else if (unit.equals("dm")) {
            value /= 10;
            return new ConvertLenght(value);

        } else if (unit.equals("m")) {
            return new ConvertLenght(value);

        } else if (unit.equals("km")) {
            value *= 1000;
            return new ConvertLenght(value);
        } 
        return new ConvertLenght(-1); 
    }

    //Weight unit - converting to kilgoram
    public ConvertWeight toMainValueWeight(){
        if (unit.equals("mg")) {
            value /= 1000000 ;
            return new ConvertWeight(value);

        } else if (unit.equals("g")) {
            value /= 1000;
            return new ConvertWeight(value);

        } else if (unit.equals("dkg")) {
            value /= 100;
            return new ConvertWeight(value);

        } else if (unit.equals("kg")) {
            return new ConvertWeight(value);

        } else if (unit.equals("t")) {
            value *= 1000;
            return new ConvertWeight(value);
        }
        return new ConvertWeight(-1);
    }

    //Time unit - converting to seconds
    public ConvertTime toMainValueTime(){
        if (unit.equals("ns")) {
            value /= 1000000000 ;
            return new ConvertTime(value);

        } else if (unit.equals("µs")) {
            value /= 1000000;
            return new ConvertTime(value);

        } else if (unit.equals("ms")) {
            value /= 1000;
            return new ConvertTime(value);

        } else if (unit.equals("s")) {
            return new ConvertTime(value);

        } else if (unit.equals("min")) {
            value *= 60;
            return new ConvertTime(value);
        } else if (unit.equals("h")) {
            value *= 3600;
            return new ConvertTime(value);
        }
        return new ConvertTime(-1);
    }

    //Temperature unit - converting to seconds
    public ConvertTemperature toMainValueTemperature(){
        if (unit.equals("C")) {
            return new ConvertTemperature(value, true);

        } else if (unit.equals("F")) {
            value = ((value - 32) * 5) / 9;
            return new ConvertTemperature(value, true);

        } else if (unit.equals("K")) {
            value = value - 273;
            return new ConvertTemperature(value, true);

        } 
        return new ConvertTemperature(value, false);
    }
}