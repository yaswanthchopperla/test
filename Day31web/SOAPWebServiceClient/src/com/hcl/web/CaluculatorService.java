/**
 * CaluculatorService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.hcl.web;

public interface CaluculatorService extends javax.xml.rpc.Service {
    public java.lang.String getCaluculatorAddress();

    public com.hcl.web.Caluculator getCaluculator() throws javax.xml.rpc.ServiceException;

    public com.hcl.web.Caluculator getCaluculator(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
