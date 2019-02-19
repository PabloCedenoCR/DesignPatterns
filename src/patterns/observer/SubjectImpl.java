package patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class SubjectImpl implements Subject {

  private int state;
  private List<Observer> observers;

  public SubjectImpl() {
    observers = new ArrayList<>();
    state = 0;
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        System.out.println("Timer working...");
        state++;
        notifyObservers();
      }
    }, 10000, 10000);
  }

  @Override
  public void registerObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    observers.forEach(observer -> observer.update(state));
  }
}
