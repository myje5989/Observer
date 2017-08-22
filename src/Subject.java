import java.util.List;
import java.util.ArrayList;
public class Subject {
	private List<Observer> obs = new ArrayList<>();
	private int state;
	
	public int getState(){
		return state;
	}
	public void setState(int state){
		this.state = state;
		notifyAllObserver();
	}
	public void attach(Observer observer){
		obs.add(observer);
	}
	public void notifyAllObserver(){
		for(Observer observer:obs){
			observer.update();
		}
	}
	

}
