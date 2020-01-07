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
package com.amazonaws.services.applicationinsights.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.applicationinsights.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * UpdateLogPatternRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class UpdateLogPatternRequestMarshaller {

    private static final MarshallingInfo<String> RESOURCEGROUPNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("ResourceGroupName").build();
    private static final MarshallingInfo<String> PATTERNSETNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatternSetName").build();
    private static final MarshallingInfo<String> PATTERNNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("PatternName").build();
    private static final MarshallingInfo<String> PATTERN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Pattern").build();
    private static final MarshallingInfo<Integer> RANK_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("Rank").build();

    private static final UpdateLogPatternRequestMarshaller instance = new UpdateLogPatternRequestMarshaller();

    public static UpdateLogPatternRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(UpdateLogPatternRequest updateLogPatternRequest, ProtocolMarshaller protocolMarshaller) {

        if (updateLogPatternRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(updateLogPatternRequest.getResourceGroupName(), RESOURCEGROUPNAME_BINDING);
            protocolMarshaller.marshall(updateLogPatternRequest.getPatternSetName(), PATTERNSETNAME_BINDING);
            protocolMarshaller.marshall(updateLogPatternRequest.getPatternName(), PATTERNNAME_BINDING);
            protocolMarshaller.marshall(updateLogPatternRequest.getPattern(), PATTERN_BINDING);
            protocolMarshaller.marshall(updateLogPatternRequest.getRank(), RANK_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
