interface Number {
    double doubleValue();
}
    
class Logarithm implements Number {
    private double base, argument;
    
    public Logarithm(double inputBase, double inputArgument) {
        this.base = inputBase;
        this.argument = inputArgument;
    }
      
      @Override
    public double doubleValue() throws ArithmeticException{ 
        if (base <= 0){
            throw new ArithmeticException("The base isn't a positive number");
        }
        else if (argument <= 0){
            throw new ArithmeticException("The argument isn't a positive number");
        }
        else if (base == 1){
            throw new ArithmeticException("The base can't be equal to 1");
        }
         return Math.log(this.argument) / Math.log(this.base);
    }
}

public class main{
    public static void main(String[] args) {
        Logarithm log = new Logarithm(145, 0);
        try {
            System.out.println("Result of logarithm: " + log.doubleValue());
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}
