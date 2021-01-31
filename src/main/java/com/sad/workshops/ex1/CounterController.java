package com.sad.workshops.ex1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
  private final Counter counter = new Counter();

  @RequestMapping("/counter")
  public String getCount() throws InterruptedException {
    return String.valueOf(counter.incrementAndGet());
  }
}
