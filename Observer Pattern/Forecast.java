package WeatherData;

public class Forecast implements Observer{
	public void update(WeatherData sub) {
		System.out.println("==>>>   Forecast update called");
		System.out.println("Temp:  " +sub.getTemp() + " K");
		System.out.println("Hum:  " +sub.getTemp() + " %");
		System.out.println("Pressure:  " +sub.getPressure() + " Atm");
		System.out.println();
	}
}
