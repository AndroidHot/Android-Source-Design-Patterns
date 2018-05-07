package io.github.androidhot.chain.java;

public class ThirdHandler extends RequestHandler {
  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType().equals(RequestType.HIGH)) {
      printHandling(request);
    } else {
      passToNext(request);
    }
  }
}
