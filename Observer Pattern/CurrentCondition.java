package WeatherData;

public class CurrentCondition implements Observer{
	public void update(WeatherData sub) {
		System.out.println("==>>>   CurrentCondition update called");
		System.out.println("Temp:  " +sub.getTemp() + " K");
		System.out.println("Hum:  " +sub.getHum() + " %");
		System.out.println("Pressure:  " +sub.getPressure() + " Atm");
		System.out.println();
	}
}
