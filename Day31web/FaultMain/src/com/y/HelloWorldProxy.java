package com.y;

public class HelloWorldProxy implements com.y.HelloWorld {
  private String _endpoint = null;
  private com.y.HelloWorld helloWorld = null;
  
  public HelloWorldProxy() {
    _initHelloWorldProxy();
  }
  
  public HelloWorldProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldProxy();
  }
  
  private void _initHelloWorldProxy() {
    try {
      helloWorld = (new com.y.HelloWorldServiceLocator()).getHelloWorldPort();
      if (helloWorld != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorld)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorld != null)
      ((javax.xml.rpc.Stub)helloWorld)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.y.HelloWorld getHelloWorld() {
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld;
  }
  
  public java.lang.String sayHelloWorld(java.lang.String arg0) throws java.rmi.RemoteException, com.y.MissingName{
    if (helloWorld == null)
      _initHelloWorldProxy();
    return helloWorld.sayHelloWorld(arg0);
  }
  
  
}