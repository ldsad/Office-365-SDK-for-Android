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
package com.microsoft.onenote.services.fetchers;

import com.microsoft.onenote.services.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import com.microsoft.services.orc.serialization.*;

import static com.microsoft.services.orc.core.Helpers.*;

/**
 * The type NotebookOperations.
 */
public class NotebookOperations extends OrcOperations {

     /**
      * Instantiates a new NotebookOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public NotebookOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public NotebookOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public NotebookOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * CopyNotebook listenable future.
     * @param siteCollectionId the siteCollectionId @param siteId the siteId 
     * @return the listenable future
     */         
    public ListenableFuture<CopyNotebookModel> copyNotebook(String siteCollectionId, String siteId) { 
        JsonSerializer serializer = getResolver().getJsonSerializer();      
        String serializedsiteCollectionId = serializer.serialize(siteCollectionId);
		String serializedsiteId = serializer.serialize(siteId);
		  
        
        ListenableFuture<String> future = copyNotebookRaw(serializedsiteCollectionId, serializedsiteId);
        return transformToEntityListenableFuture(future, CopyNotebookModel.class, getResolver());
        
    }

     /**
     * CopyNotebookRaw listenable future.
     * @param siteCollectionId the siteCollectionId @param siteId the siteId 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyNotebookRaw(String siteCollectionId, String siteId){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("siteCollectionId", siteCollectionId);
		map.put("siteId", siteId);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("Microsoft.OneNote.Api.CopyNotebook");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


}
