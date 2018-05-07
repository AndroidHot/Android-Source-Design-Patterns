package io.github.androidhot.chain.java;

public class SecondHandler extends RequestHandler {
  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType().equals(RequestType.MEDIUM)) {
      printHandling(request);
    } else {
      passToNext(request);
    }
  }
}
