/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The core properties of ARM resources.
 */
public class ARMResourceProperties extends Resource {
    /**
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private ManagedServiceIdentity identity;

    /**
     * Get the identity value.
     *
     * @return the identity value
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity value.
     *
     * @param identity the identity value to set
     * @return the ARMResourceProperties object itself.
     */
    public ARMResourceProperties withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

}