/**
 * SaiKumarServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hcl.saikumar;

public class SaiKumarServiceLocator extends org.apache.axis.client.Service implements com.hcl.saikumar.SaiKumarService {

    public SaiKumarServiceLocator() {
    }


    public SaiKumarServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaiKumarServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaiKumar
    private java.lang.String SaiKumar_address = "http://192.168.1.102:8585/SOAPWebServiceDetails/services/SaiKumar";

    public java.lang.String getSaiKumarAddress() {
        return SaiKumar_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaiKumarWSDDServiceName = "SaiKumar";

    public java.lang.String getSaiKumarWSDDServiceName() {
        return SaiKumarWSDDServiceName;
    }

    public void setSaiKumarWSDDServiceName(java.lang.String name) {
        SaiKumarWSDDServiceName = name;
    }

    public com.hcl.saikumar.SaiKumar getSaiKumar() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaiKumar_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaiKumar(endpoint);
    }

    public com.hcl.saikumar.SaiKumar getSaiKumar(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hcl.saikumar.SaiKumarSoapBindingStub _stub = new com.hcl.saikumar.SaiKumarSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaiKumarWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaiKumarEndpointAddress(java.lang.String address) {
        SaiKumar_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hcl.saikumar.SaiKumar.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hcl.saikumar.SaiKumarSoapBindingStub _stub = new com.hcl.saikumar.SaiKumarSoapBindingStub(new java.net.URL(SaiKumar_address), this);
                _stub.setPortName(getSaiKumarWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SaiKumar".equals(inputPortName)) {
            return getSaiKumar();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://saikumar.hcl.com", "SaiKumarService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://saikumar.hcl.com", "SaiKumar"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaiKumar".equals(portName)) {
            setSaiKumarEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
