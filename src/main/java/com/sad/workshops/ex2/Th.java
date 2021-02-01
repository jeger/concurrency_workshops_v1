package com.sad.workshops.ex2;

/* Object shared between the main thread and ad-hoc created thread (using new Thread().start). */
public class Th {
  volatile boolean asleep;

  void putToSleep() {
    this.asleep = true;
  }

  void spinTillAwaken() {
    while (!asleep) {
      // count some ship
    }
  }

  public static void main(String[] args) {
    Th th = new Th();

    new Thread(
            () -> {
              try {
                Thread.sleep(1000);
              } catch (InterruptedException e) {
                e.printStackTrace();
              }
              th.putToSleep();
            })
        .start();

    th.spinTillAwaken();
  }
}
