/**
 * UttamServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.u;

public class UttamServiceLocator extends org.apache.axis.client.Service implements com.u.UttamService {

    public UttamServiceLocator() {
    }


    public UttamServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UttamServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Uttam
    private java.lang.String Uttam_address = "http://192.168.1.12:8986/Uttam/services/Uttam";

    public java.lang.String getUttamAddress() {
        return Uttam_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UttamWSDDServiceName = "Uttam";

    public java.lang.String getUttamWSDDServiceName() {
        return UttamWSDDServiceName;
    }

    public void setUttamWSDDServiceName(java.lang.String name) {
        UttamWSDDServiceName = name;
    }

    public com.u.Uttam getUttam() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Uttam_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUttam(endpoint);
    }

    public com.u.Uttam getUttam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.u.UttamSoapBindingStub _stub = new com.u.UttamSoapBindingStub(portAddress, this);
            _stub.setPortName(getUttamWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUttamEndpointAddress(java.lang.String address) {
        Uttam_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.u.Uttam.class.isAssignableFrom(serviceEndpointInterface)) {
                com.u.UttamSoapBindingStub _stub = new com.u.UttamSoapBindingStub(new java.net.URL(Uttam_address), this);
                _stub.setPortName(getUttamWSDDServiceName());
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
        if ("Uttam".equals(inputPortName)) {
            return getUttam();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://u.com", "UttamService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://u.com", "Uttam"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Uttam".equals(portName)) {
            setUttamEndpointAddress(address);
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
