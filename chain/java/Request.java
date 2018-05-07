package io.github.androidhot.chain.java;

public class Request {
  private RequestType requestType;
  private String requestName;

  public Request(RequestType requestType, String requestName) {
    this.requestType = requestType;
    this.requestName = requestName;
  }

  public RequestType getRequestType() {
    return requestType;
  }

  public String getRequestName() {
    return requestName;
  }
}
