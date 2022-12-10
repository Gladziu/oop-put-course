public class CheckLogarithm{
    
    interface Number {
        double doubleValue();
    }
    
    public class Logarithm implements Number {
      private double base, argument;
      
      @Override
      public double doubleValue() throws(ArithmeticException){ 
          if (base < 0){
              throw new ArithmeticException("The base isn't a positive number")
          }
          else if (argument < 0){
              throw new ArithmeticException("The argument isn't a positive number")
          }
          else if ()
          return Math.log(this.argument) / Math.log(this.base);
          
      }
      public Logarithm(double inputBase, double inputArgument) {
        this.base = inputBase;
        this.argument = inputArgument;
      }
    }
    
    public static void main(String[] arg){
        
    }
}
