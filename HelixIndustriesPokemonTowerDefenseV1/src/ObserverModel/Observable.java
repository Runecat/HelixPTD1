package ObserverModel;

import java.util.HashSet;
import java.util.Set;


public class Observable {
	protected Set<Observer> observers = new HashSet<Observer>();
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update();
	}
}
