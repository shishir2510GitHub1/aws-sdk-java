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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/PutAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAttributesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The attributes applied to your resource.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> attributes;

    /**
     * <p>
     * The attributes applied to your resource.
     * </p>
     * 
     * @return The attributes applied to your resource.
     */

    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The attributes applied to your resource.
     * </p>
     * 
     * @param attributes
     *        The attributes applied to your resource.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes applied to your resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes applied to your resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesResult withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes applied to your resource.
     * </p>
     * 
     * @param attributes
     *        The attributes applied to your resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAttributesResult withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getAttributes() != null)
            sb.append("Attributes: ").append(getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAttributesResult == false)
            return false;
        PutAttributesResult other = (PutAttributesResult) obj;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public PutAttributesResult clone() {
        try {
            return (PutAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
