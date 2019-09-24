/**
 * CaluculatorServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hcl.web;

public class CaluculatorServiceLocator extends org.apache.axis.client.Service implements com.hcl.web.CaluculatorService {

    public CaluculatorServiceLocator() {
    }


    public CaluculatorServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CaluculatorServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Caluculator
    private java.lang.String Caluculator_address = "http://192.168.1.107:8080/SOAPWebServiceDemo/services/Caluculator";

    public java.lang.String getCaluculatorAddress() {
        return Caluculator_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CaluculatorWSDDServiceName = "Caluculator";

    public java.lang.String getCaluculatorWSDDServiceName() {
        return CaluculatorWSDDServiceName;
    }

    public void setCaluculatorWSDDServiceName(java.lang.String name) {
        CaluculatorWSDDServiceName = name;
    }

    public com.hcl.web.Caluculator getCaluculator() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Caluculator_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCaluculator(endpoint);
    }

    public com.hcl.web.Caluculator getCaluculator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.hcl.web.CaluculatorSoapBindingStub _stub = new com.hcl.web.CaluculatorSoapBindingStub(portAddress, this);
            _stub.setPortName(getCaluculatorWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCaluculatorEndpointAddress(java.lang.String address) {
        Caluculator_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.hcl.web.Caluculator.class.isAssignableFrom(serviceEndpointInterface)) {
                com.hcl.web.CaluculatorSoapBindingStub _stub = new com.hcl.web.CaluculatorSoapBindingStub(new java.net.URL(Caluculator_address), this);
                _stub.setPortName(getCaluculatorWSDDServiceName());
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
        if ("Caluculator".equals(inputPortName)) {
            return getCaluculator();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://web.hcl.com", "CaluculatorService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://web.hcl.com", "Caluculator"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Caluculator".equals(portName)) {
            setCaluculatorEndpointAddress(address);
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
