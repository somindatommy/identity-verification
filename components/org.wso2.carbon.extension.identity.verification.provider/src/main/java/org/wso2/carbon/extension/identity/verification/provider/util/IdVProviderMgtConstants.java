/*
 * Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.extension.identity.verification.provider.util;

/**
 * This class contains the constants used in the IdentityVerificationProvider.
 */
public class IdVProviderMgtConstants {

    /**
     * This class contains the constants used in the IdentityVerificationProvider.
     */
    public static class SQLQueries {

        public static final String GET_IDVP_SQL = "SELECT UUID, NAME, DISPLAY_NAME, DESCRIPTION, IS_ENABLED, CLAIMS, " +
                "CONFIGS FROM IDVP WHERE IDV_UUID=? AND TENANT_ID=?";
        public static final String GET_IDVP_CONFIG_SQL = "SELECT PROPERTY_KEY, PROPERTY_VALUE FROM " +
                "IDVP_CONFIG WHERE IDVP_ID=? AND TENANT_ID=?";
        public static final String GET_IDVP_CLAIMS_SQL = "SELECT CLAIM, LOCAL_CLAIM FROM " +
                "IDVP_CLAIM_MAPPING WHERE IDVP_ID=? AND TENANT_ID=?";
        public static final String GET_IDVPS_SQL = "SELECT UUID, NAME, DISPLAY_NAME, " +
                "DESCRIPTION, IS_ENABLE FROM IDVP WHERE TENANT_ID=?";

        public static final String DELETE_IDV_SQL = "DELETE FROM IDVP WHERE UUID=? AND TENANT_ID=? AND TENANT_ID=?";

        public static final String ADD_IDV_SQL =
                "INSERT INTO IDVP(UUID, NAME, DISPLAY_NAME, DESCRIPTION, IS_ENABLED) VALUES (?, ?, ?, ?, ?)";

        public static final String ADD_IDVP_CONFIG_SQL = "INSERT INTO IDVP_CONFIG " +
                "(IDVP_ID, TENANT_ID, PROPERTY_KEY, PROPERTY_VALUE) VALUES (?, ?, ?, ?)";

        public static final String ADD_IDVP_CLAIM_SQL = "INSERT INTO IDVP_CLAIM_MAPPING " +
                "(IDVP_ID, TENANT_ID, CLAIM, LOCAL_CLAIM) VALUES (?, ?, ?, ?)";
        public static final String UPDATE_IDVP_SQL = "UPDATE IDVP SET NAME=?, DISPLAY_NAME=?, DESCRIPTION=?, " +
                "IS_ENABLED = ? WHERE UUID=? AND TENANT_ID=?";
        public static final String DELETE_IDVP_CONFIG_SQL = "DELETE FROM IDVP_CONFIG " +
                "WHERE UUID=? AND TENANT_ID=?";
        public static final String DELETE_IDVP_CLAIM_SQL = "DELETE FROM IDVP_CLAIM_MAPPING " +
                "WHERE UUID=? AND TENANT_ID=?";
    }

    /**
     * Error messages.
     */
    public enum ErrorMessage {

        ERROR_CODE_DATABASE_CONNECTION("IDV-65001", "Couldn't get a database connection."),
        ERROR_CODE_ADD_IDV_PROVIDER("IDV-", ""),
        ERROR_CODE_UPDATE_IDV_PROVIDER("IDV-", ""),
        ERROR_CODE_DELETING_IDV_PROVIDER("IDV-65000",
                "An error occurred while deleting Identity Verification Provider: %s."),
        ERROR_CODE_RETRIEVING_IDV_PROVIDERS("IDV-65001",
                "An error occurred while retrieving Identity Verification Providers."),
        ERROR_CODE_RETRIEVING_IDV_PROVIDER_CONFIGS("IDV-65002",
                "An error occurred while retrieving Identity Verification Provider configs."),
        ERROR_CODE_RETRIEVING_IDV_PROVIDER_CLAIMS("IDV-65003",
                "An error occurred while retrieving Identity Verification Provider claims.");
        private final String code;
        private final String message;

        ErrorMessage(String code, String message) {

            this.code = code;
            this.message = message;
        }

        public String getCode() {

            return code;
        }

        public String getMessage() {

            return message;
        }

        @Override
        public String toString() {

            return code + ":" + message;
        }
    }
}
