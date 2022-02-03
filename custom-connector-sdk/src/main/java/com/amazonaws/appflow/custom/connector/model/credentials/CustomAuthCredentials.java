/*
 * -
 *  * #%L
 * * Amazon Appflow Custom Connector SDK.
 * *
 * %%
 * Copyright (C) 2021 Amazon Web Services
 *  *
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 *
 */

package com.amazonaws.appflow.custom.connector.model.credentials;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

import java.util.Map;

/**
 * Credentials for Custom authentication supported by connector. This structure is embedded in the Credentials
 * structure withing the ConnectorConnect that is sent with every API call.
 */
@Value.Immutable
@JsonSerialize(as = ImmutableCustomAuthCredentials.class)
@JsonDeserialize(as = ImmutableCustomAuthCredentials.class)
public interface CustomAuthCredentials {
    /**
     * Authentication Type defined by Connector.
     */
     String customAuthenticationType();

    /**
     * [Deprecated: Added for backward compatiblity]Authentication Type defined by Connector.
     */
     String authenticationType(); 
   /**
     * Custom Credentials provided by connector user. Key will be <code>AuthParameter.key()</code> and value will be the
     * input provided by user.
     */
    Map<String, String> customCredentials();
}