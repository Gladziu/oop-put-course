public interface Forecast {
    public float todayTemperature();
    final class Fake implements Forecast {
      
        @Override
        public float todayTemperature(){
            return 10.2f;
        }
    }
}
