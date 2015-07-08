/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.discovery;

import com.microsoft.services.orc.core.ODataBaseEntity;


/**
 * The type Service Info.
*/
public class ServiceInfo extends ODataBaseEntity {

    public ServiceInfo(){
        setODataType("#Microsoft.DiscoveryServices.ServiceInfo");
    }
            
    private String capability;
     
    /**
    * Gets the capability.
    *
    * @return the String
    */
    public String getCapability() {
        return this.capability; 
    }

    /**
    * Sets the capability.
    *
    * @param value the String
    */
    public void setCapability(String value) { 
        this.capability = value; 
        valueChanged("capability", value);

    }
            
    private String entityKey;
     
    /**
    * Gets the entity Key.
    *
    * @return the String
    */
    public String getEntityKey() {
        return this.entityKey; 
    }

    /**
    * Sets the entity Key.
    *
    * @param value the String
    */
    public void setEntityKey(String value) { 
        this.entityKey = value; 
        valueChanged("entityKey", value);

    }
            
    private String providerId;
     
    /**
    * Gets the provider Id.
    *
    * @return the String
    */
    public String getProviderId() {
        return this.providerId; 
    }

    /**
    * Sets the provider Id.
    *
    * @param value the String
    */
    public void setProviderId(String value) { 
        this.providerId = value; 
        valueChanged("providerId", value);

    }
            
    private String providerName;
     
    /**
    * Gets the provider Name.
    *
    * @return the String
    */
    public String getProviderName() {
        return this.providerName; 
    }

    /**
    * Sets the provider Name.
    *
    * @param value the String
    */
    public void setProviderName(String value) { 
        this.providerName = value; 
        valueChanged("providerName", value);

    }
            
    private Integer serviceAccountType;
     
    /**
    * Gets the service Account Type.
    *
    * @return the Integer
    */
    public Integer getServiceAccountType() {
        return this.serviceAccountType; 
    }

    /**
    * Sets the service Account Type.
    *
    * @param value the Integer
    */
    public void setServiceAccountType(Integer value) { 
        this.serviceAccountType = value; 
        valueChanged("serviceAccountType", value);

    }
            
    private String serviceApiVersion;
     
    /**
    * Gets the service Api Version.
    *
    * @return the String
    */
    public String getServiceApiVersion() {
        return this.serviceApiVersion; 
    }

    /**
    * Sets the service Api Version.
    *
    * @param value the String
    */
    public void setServiceApiVersion(String value) { 
        this.serviceApiVersion = value; 
        valueChanged("serviceApiVersion", value);

    }
            
    private String serviceEndpointUri;
     
    /**
    * Gets the service Endpoint Uri.
    *
    * @return the String
    */
    public String getServiceEndpointUri() {
        return this.serviceEndpointUri; 
    }

    /**
    * Sets the service Endpoint Uri.
    *
    * @param value the String
    */
    public void setServiceEndpointUri(String value) { 
        this.serviceEndpointUri = value; 
        valueChanged("serviceEndpointUri", value);

    }
            
    private String serviceId;
     
    /**
    * Gets the service Id.
    *
    * @return the String
    */
    public String getServiceId() {
        return this.serviceId; 
    }

    /**
    * Sets the service Id.
    *
    * @param value the String
    */
    public void setServiceId(String value) { 
        this.serviceId = value; 
        valueChanged("serviceId", value);

    }
            
    private String serviceName;
     
    /**
    * Gets the service Name.
    *
    * @return the String
    */
    public String getServiceName() {
        return this.serviceName; 
    }

    /**
    * Sets the service Name.
    *
    * @param value the String
    */
    public void setServiceName(String value) { 
        this.serviceName = value; 
        valueChanged("serviceName", value);

    }
            
    private String serviceResourceId;
     
    /**
    * Gets the service Resource Id.
    *
    * @return the String
    */
    public String getServiceResourceId() {
        return this.serviceResourceId; 
    }

    /**
    * Sets the service Resource Id.
    *
    * @param value the String
    */
    public void setServiceResourceId(String value) { 
        this.serviceResourceId = value; 
        valueChanged("serviceResourceId", value);

    }
}

