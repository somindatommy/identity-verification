/*
* Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.extension.identity.verification.api.rest.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.extension.identity.verification.api.rest.v1.model.ConfigProperty;
import org.wso2.carbon.extension.identity.verification.api.rest.v1.model.Verificationclaim;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class IdVProviderRequest  {
  
    private String name;
    private String displayName;
    private String description;
    private Boolean isEnable;
    private List<Verificationclaim> claims = null;

    private List<ConfigProperty> configProperties = null;


    /**
    **/
    public IdVProviderRequest name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "EvidentID", value = "")
    @JsonProperty("Name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public IdVProviderRequest displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }
    
    @ApiModelProperty(example = "EvidentID", value = "")
    @JsonProperty("displayName")
    @Valid
    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
    **/
    public IdVProviderRequest description(String description) {

        this.description = description;
        return this;
    }
    
    @ApiModelProperty(example = "identity verification provider", value = "")
    @JsonProperty("description")
    @Valid
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    /**
    **/
    public IdVProviderRequest isEnable(Boolean isEnable) {

        this.isEnable = isEnable;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "")
    @JsonProperty("isEnable")
    @Valid
    public Boolean getIsEnable() {
        return isEnable;
    }
    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    /**
    **/
    public IdVProviderRequest claims(List<Verificationclaim> claims) {

        this.claims = claims;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("claims")
    @Valid
    public List<Verificationclaim> getClaims() {
        return claims;
    }
    public void setClaims(List<Verificationclaim> claims) {
        this.claims = claims;
    }

    public IdVProviderRequest addClaimsItem(Verificationclaim claimsItem) {
        if (this.claims == null) {
            this.claims = new ArrayList<>();
        }
        this.claims.add(claimsItem);
        return this;
    }

        /**
    **/
    public IdVProviderRequest configProperties(List<ConfigProperty> configProperties) {

        this.configProperties = configProperties;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("configProperties")
    @Valid
    public List<ConfigProperty> getConfigProperties() {
        return configProperties;
    }
    public void setConfigProperties(List<ConfigProperty> configProperties) {
        this.configProperties = configProperties;
    }

    public IdVProviderRequest addConfigPropertiesItem(ConfigProperty configPropertiesItem) {
        if (this.configProperties == null) {
            this.configProperties = new ArrayList<>();
        }
        this.configProperties.add(configPropertiesItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdVProviderRequest idVProviderRequest = (IdVProviderRequest) o;
        return Objects.equals(this.name, idVProviderRequest.name) &&
            Objects.equals(this.displayName, idVProviderRequest.displayName) &&
            Objects.equals(this.description, idVProviderRequest.description) &&
            Objects.equals(this.isEnable, idVProviderRequest.isEnable) &&
            Objects.equals(this.claims, idVProviderRequest.claims) &&
            Objects.equals(this.configProperties, idVProviderRequest.configProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, description, isEnable, claims, configProperties);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class IdVProviderRequest {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isEnable: ").append(toIndentedString(isEnable)).append("\n");
        sb.append("    claims: ").append(toIndentedString(claims)).append("\n");
        sb.append("    configProperties: ").append(toIndentedString(configProperties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}

