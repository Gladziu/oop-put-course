import java.util.HashMap;
class FakeCantor {
  private final HashMap<String, Float> rates = new HashMap<>() {{
    put("USD", 1.0366f); 
    put("GBP", 0.87063f); 
    put("CHF", 0.9881f); 
    put("JPY", 145.12f);
  }};
  public float euroToRate(String currency) {return this.rates.get(currency);}
  public FakeCantor() {}
}

 interface Currency {
  Currency addedCurrency(float value, String currency);
  Currency subtractedCurrency(float value, String currency);
  String abbreviation();
  String symbol();
  String balance();
  float dollarExchangeRate();
}

class Euro implements Currency{
    
    float amountOfEuro = 1000;
    
    @Override
    public float addedCurrency(float value, String currency){
        amountOfEuro = amountOfEuro + (value * euroToRate(currency));
        return amountOfEuro;
    }
    
    @Override
    public float subtractedCurrency(float value, String currency){
        
    }
    
    @Override
    public String abbreviation(){
        return "EUR"
    }
    
    @Override
    public String symbol(){
        return "€"
    }
    
    @Override
    public String balance(){
        String ballanceString = Float.toString(amountOfEuro);
        return ballanceString;
    }
    
    @Override
    public float dollarExchangeRate(){
        
    }
}
public class Main{
    public static void main(String[] args){
        
    }
}
