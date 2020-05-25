package WeatherData;

public class Stat implements Observer{
	public void update(WeatherData sub) {
		System.out.println("==>>>   Stat update called");
		System.out.println("Temp:  " +sub.getTemp() + " K");
		System.out.println("Hum:  " +sub.getHum() + " %");
		System.out.println("Pressure:  " +sub.getPressure() + " Atm");
		System.out.println();
	}
}
