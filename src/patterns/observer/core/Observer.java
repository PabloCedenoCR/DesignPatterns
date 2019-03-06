package patterns.observer.core;

import java.util.Observable;

public class Observer implements java.util.Observer {

  @Override
  public void update(Observable subject, Object arg) {
    System.out.println("**** " + this.hashCode() + " - Subject: " + subject + " - Value: " + arg);
  }
}
