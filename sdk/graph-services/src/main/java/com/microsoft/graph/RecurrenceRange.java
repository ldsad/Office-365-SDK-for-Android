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
 * The type Recurrence Range.
*/
public class RecurrenceRange extends ODataBaseEntity {

    public RecurrenceRange(){
        setODataType("#Microsoft.Graph.RecurrenceRange");
    }

    private RecurrenceRangeType Type;

    /**
    * Gets the Type.
    *
    * @return the RecurrenceRangeType
    */
    public RecurrenceRangeType getType() {
        return this.Type; 
    }

    /**
    * Sets the Type.
    *
    * @param value the RecurrenceRangeType
    */
    public void setType(RecurrenceRangeType value) { 
        this.Type = value;
        valueChanged("Type", value);

    }

    private java.util.Calendar StartDate;

    /**
    * Gets the Start Date.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getStartDate() {
        return this.StartDate; 
    }

    /**
    * Sets the Start Date.
    *
    * @param value the java.util.Calendar
    */
    public void setStartDate(java.util.Calendar value) { 
        this.StartDate = value;
        valueChanged("StartDate", value);

    }

    private java.util.Calendar EndDate;

    /**
    * Gets the End Date.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getEndDate() {
        return this.EndDate; 
    }

    /**
    * Sets the End Date.
    *
    * @param value the java.util.Calendar
    */
    public void setEndDate(java.util.Calendar value) { 
        this.EndDate = value;
        valueChanged("EndDate", value);

    }

    private Integer NumberOfOccurrences;

    /**
    * Gets the Number Of Occurrences.
    *
    * @return the Integer
    */
    public Integer getNumberOfOccurrences() {
        return this.NumberOfOccurrences; 
    }

    /**
    * Sets the Number Of Occurrences.
    *
    * @param value the Integer
    */
    public void setNumberOfOccurrences(Integer value) { 
        this.NumberOfOccurrences = value;
        valueChanged("NumberOfOccurrences", value);

    }
}
