/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */
package com.amazonaws.auth;

import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.EC2ResourceFetcher;
import com.amazonaws.internal.CredentialsEndpointProvider;

/**
 * Loads the credentials from a local endpoint on a container.
 */
@SdkInternalApi
class ContainerCredentialsFetcher extends BaseCredentialsFetcher {

    /** Used to load the endpoint where the credentials are stored. */
    private final CredentialsEndpointProvider credentialsEndpointProvider;

    ContainerCredentialsFetcher(CredentialsEndpointProvider credentialsEndpointProvider) {
        this.credentialsEndpointProvider = credentialsEndpointProvider;
    }

    @Override
    protected String getCredentialsResponse() {
        return EC2ResourceFetcher.defaultResourceFetcher().readResource(
            credentialsEndpointProvider.getCredentialsEndpoint(),
            credentialsEndpointProvider.getRetryPolicy(),
            credentialsEndpointProvider.getHeaders()
        );
    }

    @Override
    public String toString() {
        return "ContainerCredentialsFetcher";
    }
}
