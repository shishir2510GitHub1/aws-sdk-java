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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon Chime SDK attendee fields to create, used with the BatchCreateAttendee action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/CreateAttendeeRequestItem" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAttendeeRequestItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     */
    private String externalUserId;

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     */

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @return The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder
     *         application.
     */

    public String getExternalUserId() {
        return this.externalUserId;
    }

    /**
     * <p>
     * The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * </p>
     * 
     * @param externalUserId
     *        The Amazon Chime SDK external user ID. Links the attendee to an identity managed by a builder application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAttendeeRequestItem withExternalUserId(String externalUserId) {
        setExternalUserId(externalUserId);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getExternalUserId() != null)
            sb.append("ExternalUserId: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAttendeeRequestItem == false)
            return false;
        CreateAttendeeRequestItem other = (CreateAttendeeRequestItem) obj;
        if (other.getExternalUserId() == null ^ this.getExternalUserId() == null)
            return false;
        if (other.getExternalUserId() != null && other.getExternalUserId().equals(this.getExternalUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExternalUserId() == null) ? 0 : getExternalUserId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAttendeeRequestItem clone() {
        try {
            return (CreateAttendeeRequestItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.CreateAttendeeRequestItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
