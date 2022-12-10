public class Calculation{
        int max(int a, int b){
            if (a > b){
                return a;
            }
            return b;
        }
        
        int min(int a, int b){
            if (a < b){
                return a;
            }
            return b;
        }
        
        float avg(int a, int b){
            return (float)(a+b)/2;
        }
        
        public static void main(String[] args){
     Calculation calculate = new Calculation();
     System.out.println("Max: " + calculate.max(20,30));
     System.out.println("Min: " + calculate.min(20,30));
     System.out.println("Avg: " + calculate.avg(2,9));
  }
}
