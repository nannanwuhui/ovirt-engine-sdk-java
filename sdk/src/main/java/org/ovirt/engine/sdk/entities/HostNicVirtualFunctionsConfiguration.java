//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// *********************************************************************
// ********************* GENERATED CODE - DO NOT MODIFY ****************
// *********************************************************************

package org.ovirt.engine.sdk.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HostNicVirtualFunctionsConfiguration complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="HostNicVirtualFunctionsConfiguration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="max_number_of_virtual_functions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="number_of_virtual_functions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="all_networks_allowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNicVirtualFunctionsConfiguration", propOrder = {
    "maxNumberOfVirtualFunctions",
    "numberOfVirtualFunctions",
    "allNetworksAllowed"
})
public class HostNicVirtualFunctionsConfiguration {

    @XmlElement(name = "max_number_of_virtual_functions")
    protected Integer maxNumberOfVirtualFunctions;
    @XmlElement(name = "number_of_virtual_functions")
    protected Integer numberOfVirtualFunctions;
    @XmlElement(name = "all_networks_allowed")
    protected Boolean allNetworksAllowed;

    /**
     * Gets the value of the maxNumberOfVirtualFunctions property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getMaxNumberOfVirtualFunctions() {
        return maxNumberOfVirtualFunctions;
    }

    /**
     * Sets the value of the maxNumberOfVirtualFunctions property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setMaxNumberOfVirtualFunctions(Integer value) {
        this.maxNumberOfVirtualFunctions = value;
    }

    public boolean isSetMaxNumberOfVirtualFunctions() {
        return (this.maxNumberOfVirtualFunctions!= null);
    }

    /**
     * Gets the value of the numberOfVirtualFunctions property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getNumberOfVirtualFunctions() {
        return numberOfVirtualFunctions;
    }

    /**
     * Sets the value of the numberOfVirtualFunctions property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setNumberOfVirtualFunctions(Integer value) {
        this.numberOfVirtualFunctions = value;
    }

    public boolean isSetNumberOfVirtualFunctions() {
        return (this.numberOfVirtualFunctions!= null);
    }

    /**
     * Gets the value of the allNetworksAllowed property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean getAllNetworksAllowed() {
        return allNetworksAllowed;
    }

    /**
     * Sets the value of the allNetworksAllowed property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setAllNetworksAllowed(Boolean value) {
        this.allNetworksAllowed = value;
    }

    public boolean isSetAllNetworksAllowed() {
        return (this.allNetworksAllowed!= null);
    }

}