package designpatters.observer.subject;

import designpatters.observer.observers.Observer;

public interface Subject{
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObservers();
}