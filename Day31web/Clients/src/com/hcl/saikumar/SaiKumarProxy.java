package com.hcl.saikumar;

public class SaiKumarProxy implements com.hcl.saikumar.SaiKumar {
  private String _endpoint = null;
  private com.hcl.saikumar.SaiKumar saiKumar = null;
  
  public SaiKumarProxy() {
    _initSaiKumarProxy();
  }
  
  public SaiKumarProxy(String endpoint) {
    _endpoint = endpoint;
    _initSaiKumarProxy();
  }
  
  private void _initSaiKumarProxy() {
    try {
      saiKumar = (new com.hcl.saikumar.SaiKumarServiceLocator()).getSaiKumar();
      if (saiKumar != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)saiKumar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)saiKumar)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (saiKumar != null)
      ((javax.xml.rpc.Stub)saiKumar)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.hcl.saikumar.SaiKumar getSaiKumar() {
    if (saiKumar == null)
      _initSaiKumarProxy();
    return saiKumar;
  }
  
  public int getInt() throws java.rmi.RemoteException{
    if (saiKumar == null)
      _initSaiKumarProxy();
    return saiKumar.getInt();
  }
  
  
}