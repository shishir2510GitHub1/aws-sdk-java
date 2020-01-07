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
package com.amazonaws.services.worklink.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.worklink.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateFleetMetadataRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateFleetMetadataRequestMarshaller {

    private static final MarshallingInfo<String> FLEETARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("FleetArn").build();
    private static final MarshallingInfo<String> DISPLAYNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("DisplayName").build();
    private static final MarshallingInfo<Boolean> OPTIMIZEFORENDUSERLOCATION_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("OptimizeForEndUserLocation").build();

    private static final UpdateFleetMetadataRequestMarshaller instance = new UpdateFleetMetadataRequestMarshaller();

    public static UpdateFleetMetadataRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateFleetMetadataRequest updateFleetMetadataRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateFleetMetadataRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateFleetMetadataRequest.getFleetArn(), FLEETARN_BINDING);
            protocolMarshaller.marshall(updateFleetMetadataRequest.getDisplayName(), DISPLAYNAME_BINDING);
            protocolMarshaller.marshall(updateFleetMetadataRequest.getOptimizeForEndUserLocation(), OPTIMIZEFORENDUSERLOCATION_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
