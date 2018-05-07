package io.github.androidhot.chain.java;

public class FirstHandler extends RequestHandler {
  @Override
  public void handleRequest(Request request) {
    if (request.getRequestType().equals(RequestType.LOW)) {
      printHandling(request);
    } else {
      passToNext(request);
    }
  }
}
