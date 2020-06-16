// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.fluent.inner.SecurityRuleInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The SecurityRuleAssociations model. */
@Fluent
public final class SecurityRuleAssociations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityRuleAssociations.class);

    /*
     * Network interface and it's custom security rules.
     */
    @JsonProperty(value = "networkInterfaceAssociation")
    private NetworkInterfaceAssociation networkInterfaceAssociation;

    /*
     * Subnet and it's custom security rules.
     */
    @JsonProperty(value = "subnetAssociation")
    private SubnetAssociation subnetAssociation;

    /*
     * Collection of default security rules of the network security group.
     */
    @JsonProperty(value = "defaultSecurityRules")
    private List<SecurityRuleInner> defaultSecurityRules;

    /*
     * Collection of effective security rules.
     */
    @JsonProperty(value = "effectiveSecurityRules")
    private List<EffectiveNetworkSecurityRule> effectiveSecurityRules;

    /**
     * Get the networkInterfaceAssociation property: Network interface and it's custom security rules.
     *
     * @return the networkInterfaceAssociation value.
     */
    public NetworkInterfaceAssociation networkInterfaceAssociation() {
        return this.networkInterfaceAssociation;
    }

    /**
     * Set the networkInterfaceAssociation property: Network interface and it's custom security rules.
     *
     * @param networkInterfaceAssociation the networkInterfaceAssociation value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withNetworkInterfaceAssociation(
        NetworkInterfaceAssociation networkInterfaceAssociation) {
        this.networkInterfaceAssociation = networkInterfaceAssociation;
        return this;
    }

    /**
     * Get the subnetAssociation property: Subnet and it's custom security rules.
     *
     * @return the subnetAssociation value.
     */
    public SubnetAssociation subnetAssociation() {
        return this.subnetAssociation;
    }

    /**
     * Set the subnetAssociation property: Subnet and it's custom security rules.
     *
     * @param subnetAssociation the subnetAssociation value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withSubnetAssociation(SubnetAssociation subnetAssociation) {
        this.subnetAssociation = subnetAssociation;
        return this;
    }

    /**
     * Get the defaultSecurityRules property: Collection of default security rules of the network security group.
     *
     * @return the defaultSecurityRules value.
     */
    public List<SecurityRuleInner> defaultSecurityRules() {
        return this.defaultSecurityRules;
    }

    /**
     * Set the defaultSecurityRules property: Collection of default security rules of the network security group.
     *
     * @param defaultSecurityRules the defaultSecurityRules value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withDefaultSecurityRules(List<SecurityRuleInner> defaultSecurityRules) {
        this.defaultSecurityRules = defaultSecurityRules;
        return this;
    }

    /**
     * Get the effectiveSecurityRules property: Collection of effective security rules.
     *
     * @return the effectiveSecurityRules value.
     */
    public List<EffectiveNetworkSecurityRule> effectiveSecurityRules() {
        return this.effectiveSecurityRules;
    }

    /**
     * Set the effectiveSecurityRules property: Collection of effective security rules.
     *
     * @param effectiveSecurityRules the effectiveSecurityRules value to set.
     * @return the SecurityRuleAssociations object itself.
     */
    public SecurityRuleAssociations withEffectiveSecurityRules(
        List<EffectiveNetworkSecurityRule> effectiveSecurityRules) {
        this.effectiveSecurityRules = effectiveSecurityRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (networkInterfaceAssociation() != null) {
            networkInterfaceAssociation().validate();
        }
        if (subnetAssociation() != null) {
            subnetAssociation().validate();
        }
        if (defaultSecurityRules() != null) {
            defaultSecurityRules().forEach(e -> e.validate());
        }
        if (effectiveSecurityRules() != null) {
            effectiveSecurityRules().forEach(e -> e.validate());
        }
    }
}