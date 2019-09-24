package com.hcl.web;

public class CaluculatorProxy implements com.hcl.web.Caluculator {
  private String _endpoint = null;
  private com.hcl.web.Caluculator caluculator = null;
  
  public CaluculatorProxy() {
    _initCaluculatorProxy();
  }
  
  public CaluculatorProxy(String endpoint) {
    _endpoint = endpoint;
    _initCaluculatorProxy();
  }
  
  private void _initCaluculatorProxy() {
    try {
      caluculator = (new com.hcl.web.CaluculatorServiceLocator()).getCaluculator();
      if (caluculator != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)caluculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)caluculator)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (caluculator != null)
      ((javax.xml.rpc.Stub)caluculator)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hcl.web.Caluculator getCaluculator() {
    if (caluculator == null)
      _initCaluculatorProxy();
    return caluculator;
  }
  
  public int add(int num1, int num2) throws java.rmi.RemoteException{
    if (caluculator == null)
      _initCaluculatorProxy();
    return caluculator.add(num1, num2);
  }
  
  public int mul(int num1, int num2) throws java.rmi.RemoteException{
    if (caluculator == null)
      _initCaluculatorProxy();
    return caluculator.mul(num1, num2);
  }
  
  
}