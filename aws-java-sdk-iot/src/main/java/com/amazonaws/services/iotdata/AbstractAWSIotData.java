/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.iotdata;

import javax.annotation.Generated;

import com.amazonaws.services.iotdata.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSIotData}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSIotData implements AWSIotData {

    protected AbstractAWSIotData() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteThingShadowResult deleteThingShadow(DeleteThingShadowRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetThingShadowResult getThingShadow(GetThingShadowRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PublishResult publish(PublishRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateThingShadowResult updateThingShadow(UpdateThingShadowRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

}
