package WeatherData;

public class Main {
	public static void main(String args[]) {
		
		WeatherData wd = new WeatherData();
	    System.out.println("Java LAB - 2");
	    System.out.println();
	    
	    Observer cc = new CurrentCondition();
	    Observer st = new Stat();
	    Observer fc = new Forecast();
	    
	    wd.addObserver(cc);
	    wd.addObserver(st);
	    wd.addObserver(fc);
	    
	    wd.measurementsChange();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    wd.removeObserver(fc);
	    
	    wd.measurementsChange();
	}

}
