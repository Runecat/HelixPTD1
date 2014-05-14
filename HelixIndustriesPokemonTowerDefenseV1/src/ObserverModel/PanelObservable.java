package ObserverModel;

import java.util.HashSet;
import java.util.Set;

/*
 * Helix Industries:{
 * Daniel S. Luces
 * Will Clement
 * Brandon Brown
 * Gabriel Basadre
 * 
 */

public class PanelObservable {
	protected Set<PanelObserver> observers = new HashSet<PanelObserver>();
	
	public void addObserver(PanelObserver observer) {
		observers.add(observer);
	}
	
	public void notifyObservers() {
		for (PanelObserver observer : observers)
			observer.update();
	}
}
