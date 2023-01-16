public class Main
{
    public static void main(String[] args) {
        Forecast forecast = new Forecast.Fake();
        Weather today = new Weather(4.0f, forecast);
        System.out.println(forecast.todayTemperature());
        assert "4.0".equals(today.toString());
    }
}
