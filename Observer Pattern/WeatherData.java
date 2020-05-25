package WeatherData;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject{
	ArrayList<Observer> ob_arr = new ArrayList<Observer>();
	
	public void addObserver(Observer ob) {
		ob_arr.add(ob);
	}
	
	public void removeObserver(Observer ob) {
		int found=-1;
        for(int i=0;i<ob_arr.size();i++){
            if(ob.equals(ob_arr.get(i))){
                found=i;
                break;
            }
        }
        if(found!=-1){
            ob_arr.remove(found);
        }
	}
	
	public void notifyObserver() {
		for(Observer ob : ob_arr) {
			ob.update(this);
		}
	}
	
	public void measurementsChange() {
		notifyObserver();
	}
	
	public int getTemp() {
		Random rand = new Random();
		int rnd = rand.nextInt(1000);
		return rnd;
	}
	
	public int getHum() {
		Random rand = new Random();
		int rnd = rand.nextInt(100);
		return rnd;
	}
	
	public int getPressure() {
		Random rand = new Random();
		int rnd = rand.nextInt(1000);
		return rnd;
	}
}
