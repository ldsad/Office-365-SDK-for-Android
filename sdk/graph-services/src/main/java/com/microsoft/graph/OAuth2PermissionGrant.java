/*******************************************************************************
 Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
 Licensed under the MIT or Apache License; see LICENSE in the source repository
 root for authoritative license information.﻿

 **NOTE** This code was generated by a tool and will occasionally be
 overwritten. We welcome comments and issues regarding this code; they will be
 addressed in the generation tool. If you wish to submit pull requests, please
 do so for the templates in that tool.

 This code was generated by Vipr (https://github.com/microsoft/vipr) using
 the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).
 ******************************************************************************/
package com.microsoft.graph;

import com.microsoft.services.orc.ODataBaseEntity;


/**
 * The type OAuth2Permission Grant.
*/
public class OAuth2PermissionGrant extends ODataBaseEntity {

    public OAuth2PermissionGrant(){
        setODataType("#Microsoft.Graph.OAuth2PermissionGrant");
    }
            
    private String clientId;
     
    /**
    * Gets the client Id.
    *
    * @return the String
    */
    public String getclientId() {
        return this.clientId; 
    }

    /**
    * Sets the client Id.
    *
    * @param value the String
    */
    public void setclientId(String value) { 
        this.clientId = value; 
        valueChanged("clientId", value);

    }
            
    private String consentType;
     
    /**
    * Gets the consent Type.
    *
    * @return the String
    */
    public String getconsentType() {
        return this.consentType; 
    }

    /**
    * Sets the consent Type.
    *
    * @param value the String
    */
    public void setconsentType(String value) { 
        this.consentType = value; 
        valueChanged("consentType", value);

    }
            
    private java.util.Calendar expiryTime;
     
    /**
    * Gets the expiry Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getexpiryTime() {
        return this.expiryTime; 
    }

    /**
    * Sets the expiry Time.
    *
    * @param value the java.util.Calendar
    */
    public void setexpiryTime(java.util.Calendar value) { 
        this.expiryTime = value; 
        valueChanged("expiryTime", value);

    }
            
    private String objectId;
     
    /**
    * Gets the object Id.
    *
    * @return the String
    */
    public String getobjectId() {
        return this.objectId; 
    }

    /**
    * Sets the object Id.
    *
    * @param value the String
    */
    public void setobjectId(String value) { 
        this.objectId = value; 
        valueChanged("objectId", value);

    }
            
    private String principalId;
     
    /**
    * Gets the principal Id.
    *
    * @return the String
    */
    public String getprincipalId() {
        return this.principalId; 
    }

    /**
    * Sets the principal Id.
    *
    * @param value the String
    */
    public void setprincipalId(String value) { 
        this.principalId = value; 
        valueChanged("principalId", value);

    }
            
    private String resourceId;
     
    /**
    * Gets the resource Id.
    *
    * @return the String
    */
    public String getresourceId() {
        return this.resourceId; 
    }

    /**
    * Sets the resource Id.
    *
    * @param value the String
    */
    public void setresourceId(String value) { 
        this.resourceId = value; 
        valueChanged("resourceId", value);

    }
            
    private String scope;
     
    /**
    * Gets the scope.
    *
    * @return the String
    */
    public String getscope() {
        return this.scope; 
    }

    /**
    * Sets the scope.
    *
    * @param value the String
    */
    public void setscope(String value) { 
        this.scope = value; 
        valueChanged("scope", value);

    }
            
    private java.util.Calendar startTime;
     
    /**
    * Gets the start Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getstartTime() {
        return this.startTime; 
    }

    /**
    * Sets the start Time.
    *
    * @param value the java.util.Calendar
    */
    public void setstartTime(java.util.Calendar value) { 
        this.startTime = value; 
        valueChanged("startTime", value);

    }
}

