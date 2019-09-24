package com.u;

public class UttamProxy implements com.u.Uttam {
  private String _endpoint = null;
  private com.u.Uttam uttam = null;
  
  public UttamProxy() {
    _initUttamProxy();
  }
  
  public UttamProxy(String endpoint) {
    _endpoint = endpoint;
    _initUttamProxy();
  }
  
  private void _initUttamProxy() {
    try {
      uttam = (new com.u.UttamServiceLocator()).getUttam();
      if (uttam != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uttam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uttam)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uttam != null)
      ((javax.xml.rpc.Stub)uttam)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.u.Uttam getUttam() {
    if (uttam == null)
      _initUttamProxy();
    return uttam;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (uttam == null)
      _initUttamProxy();
    return uttam.getInt();
  }
  
  
}