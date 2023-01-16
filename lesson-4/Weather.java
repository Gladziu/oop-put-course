public class Weather {
    private final Forecast forecast;
    private float temperature;
    
    public Weather(float temperature, Forecast forecast){
        this.temperature=temperature;
        this.forecast=forecast;
    }
    
    public Weather todayTemperature(){
        return new Weather(this.temperature, this.forecast);
    }
    
    @Override
    public String toString(){
        return Float.toString(temperature);
    }
}
