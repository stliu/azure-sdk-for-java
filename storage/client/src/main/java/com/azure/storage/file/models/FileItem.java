// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * A listed file item.
 */
@JacksonXmlRootElement(localName = "File")
public final class FileItem {
    /**
     * The name property.
     */
    @JsonProperty(value = "Name", required = true)
    private String name;

    /**
     * The properties property.
     */
    @JsonProperty(value = "Properties", required = true)
    private FileProperty properties;

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the FileItem object itself.
     */
    public FileItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public FileProperty properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the FileItem object itself.
     */
    public FileItem properties(FileProperty properties) {
        this.properties = properties;
        return this;
    }
}
