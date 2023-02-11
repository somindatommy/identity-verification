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

package org.wso2.carbon.extension.identity.v1.provider.mgt.api.rest.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

import java.util.Objects;
import javax.validation.Valid;

public class InitVerificationResponse  {
  
    private String username;
    private String identityVerificationProvider;

    /**
    **/
    public InitVerificationResponse username(String username) {

        this.username = username;
        return this;
    }
    
    @ApiModelProperty(example = "username", value = "")
    @JsonProperty("username")
    @Valid
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    /**
    **/
    public InitVerificationResponse identityVerificationProvider(String identityVerificationProvider) {

        this.identityVerificationProvider = identityVerificationProvider;
        return this;
    }
    
    @ApiModelProperty(example = "evidentID", required = true, value = "")
    @JsonProperty("identityVerificationProvider")
    @Valid
    @NotNull(message = "Property identityVerificationProvider cannot be null.")

    public String getIdentityVerificationProvider() {
        return identityVerificationProvider;
    }
    public void setIdentityVerificationProvider(String identityVerificationProvider) {
        this.identityVerificationProvider = identityVerificationProvider;
    }



    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InitVerificationResponse initVerificationResponse = (InitVerificationResponse) o;
        return Objects.equals(this.username, initVerificationResponse.username) &&
            Objects.equals(this.identityVerificationProvider, initVerificationResponse.identityVerificationProvider);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, identityVerificationProvider);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class InitVerificationResponse {\n");
        
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    identityVerificationProvider: ").append(toIndentedString(identityVerificationProvider)).append("\n");
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

