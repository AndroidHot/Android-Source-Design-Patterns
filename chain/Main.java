package io.github.androidhot.chain;

import io.github.androidhot.chain.java.*;

public class Main {
  public static void main(String[] args) {
    RequestHandler firstHandler = new FirstHandler();
    RequestHandler secondHandler = new SecondHandler();
    RequestHandler thirdHandler = new ThirdHandler();

    firstHandler.setNext(secondHandler);
    secondHandler.setNext(thirdHandler);
    thirdHandler.setNext(null);

    firstHandler.handleRequest(new Request(RequestType.LOW, "Low request"));
    firstHandler.handleRequest(new Request(RequestType.MEDIUM, "Medium request"));
    firstHandler.handleRequest(new Request(RequestType.HIGH, "High request"));
  }
}
