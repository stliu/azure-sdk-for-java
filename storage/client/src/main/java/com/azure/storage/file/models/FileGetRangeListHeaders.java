// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for GetRangeList operation.
 */
@JacksonXmlRootElement(localName = "File-GetRangeList-Headers")
public final class FileGetRangeListHeaders {
    /**
     * The date/time that the file was last modified. Any operation that
     * modifies the file, including an update of the file's metadata or
     * properties, changes the file's last modified time.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * The ETag contains a value which represents the version of the file, in
     * quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * The size of the file in bytes.
     */
    @JsonProperty(value = "x-ms-content-length")
    private Long fileContentLength;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the File service used to execute the request.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * A UTC date/time value generated by the service that indicates the time
     * at which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the lastModified property: The date/time that the file was last
     * modified. Any operation that modifies the file, including an update of
     * the file's metadata or properties, changes the file's last modified
     * time.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified property: The date/time that the file was last
     * modified. Any operation that modifies the file, including an update of
     * the file's metadata or properties, changes the file's last modified
     * time.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders lastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value which represents the
     * version of the file, in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders eTag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the fileContentLength property: The size of the file in bytes.
     *
     * @return the fileContentLength value.
     */
    public Long fileContentLength() {
        return this.fileContentLength;
    }

    /**
     * Set the fileContentLength property: The size of the file in bytes.
     *
     * @param fileContentLength the fileContentLength value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders fileContentLength(Long fileContentLength) {
        this.fileContentLength = fileContentLength;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the File service used
     * to execute the request.
     *
     * @param version the version value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty property: A UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders dateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the FileGetRangeListHeaders object itself.
     */
    public FileGetRangeListHeaders errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
