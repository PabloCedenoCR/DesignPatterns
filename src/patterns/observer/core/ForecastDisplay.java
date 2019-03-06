package patterns.observer.core;

import java.util.Observer;
import java.util.Observable;

public class ForecastDisplay implements Observer {

  private int currentState = 0;
  private int lastState;

  public ForecastDisplay(Subject observable) {
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if (o instanceof Subject) {
      Subject subject = (Subject) o;
      lastState = currentState;
      currentState = subject.getState();
      display();
    }
  }

  public void display() {
    System.out.println("*** Current State: " + currentState + " - LastState: " + lastState);
  }
}
