/**
 * UttamService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.u;

public interface UttamService extends javax.xml.rpc.Service {
    public java.lang.String getUttamAddress();

    public com.u.Uttam getUttam() throws javax.xml.rpc.ServiceException;

    public com.u.Uttam getUttam(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
