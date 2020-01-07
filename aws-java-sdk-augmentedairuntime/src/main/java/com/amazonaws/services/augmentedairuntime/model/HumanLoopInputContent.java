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
package com.amazonaws.services.augmentedairuntime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing the input.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-a2i-runtime-2019-11-07/HumanLoopInputContent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HumanLoopInputContent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Serialized input from the human loop.
     * </p>
     */
    private String inputContent;

    /**
     * <p>
     * Serialized input from the human loop.
     * </p>
     * 
     * @param inputContent
     *        Serialized input from the human loop.
     */

    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    /**
     * <p>
     * Serialized input from the human loop.
     * </p>
     * 
     * @return Serialized input from the human loop.
     */

    public String getInputContent() {
        return this.inputContent;
    }

    /**
     * <p>
     * Serialized input from the human loop.
     * </p>
     * 
     * @param inputContent
     *        Serialized input from the human loop.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HumanLoopInputContent withInputContent(String inputContent) {
        setInputContent(inputContent);
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
        if (getInputContent() != null)
            sb.append("InputContent: ").append(getInputContent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HumanLoopInputContent == false)
            return false;
        HumanLoopInputContent other = (HumanLoopInputContent) obj;
        if (other.getInputContent() == null ^ this.getInputContent() == null)
            return false;
        if (other.getInputContent() != null && other.getInputContent().equals(this.getInputContent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputContent() == null) ? 0 : getInputContent().hashCode());
        return hashCode;
    }

    @Override
    public HumanLoopInputContent clone() {
        try {
            return (HumanLoopInputContent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.augmentedairuntime.model.transform.HumanLoopInputContentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
