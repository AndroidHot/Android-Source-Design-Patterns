package io.github.androidhot.chain.java;

public abstract class RequestHandler {
  protected RequestHandler next;

  public void setNext(RequestHandler next) {
    this.next = next;
  }

  public abstract void handleRequest(Request request);

  protected void passToNext(Request request) {
    if (next != null) {
      next.handleRequest(request);
    }
  }

  protected void printHandling(Request request) {
    System.out.println(this + " handing request: " + request.getRequestName());
  }
}
