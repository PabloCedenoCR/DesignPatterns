package patterns.observer.core;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Timer;
import java.util.TimerTask;

public class Subject extends Observable {

  private int state;

  public Subject() {
    state = 0;
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        state++;
        setChanged();
        notifyObservers();
      }
    }, 10000, 10000);
  }

  public int getState() {
    return state;
  }
}
