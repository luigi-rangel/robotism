package fr.tp.inf112.projects.robotsim.model.notifier;

import java.util.ArrayList;
import java.util.List;

import fr.tp.inf112.projects.canvas.controller.Observer;

public class LocalModelChangeNotifier implements FactoryModelChangedNotifier {
	
	private transient List<Observer> observers;
	
	public List<Observer> getObservers() {
		if (observers == null) {
			observers = new ArrayList<>();
		}
		
		return observers;
	}

	@Override
	public boolean addObserver(Observer observer) {
		return getObservers().add(observer);
	}

	@Override
	public boolean removeObserver(Observer observer) {
		return getObservers().remove(observer);
	}
	
	public void notifyObservers() {
		for (final Observer observer : getObservers()) {
			observer.modelChanged();
		}
	}

}
