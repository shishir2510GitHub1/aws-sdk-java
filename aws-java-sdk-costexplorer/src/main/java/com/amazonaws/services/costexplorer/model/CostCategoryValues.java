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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <important>
 * <p>
 * <i> <b>Cost Category is in preview release for AWS Billing and Cost Management and is subject to change. Your use of
 * Cost Categories is subject to the Beta Service Participation terms of the <a
 * href="https://aws.amazon.com/service-terms/">AWS Service Terms</a> (Section 1.10).</b> </i>
 * </p>
 * </important>
 * <p>
 * The values that are available for Cost Categories.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/CostCategoryValues" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CostCategoryValues implements Serializable, Cloneable, StructuredPojo {

    private String key;
    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     */
    private java.util.List<String> values;

    /**
     * @param key
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return
     */

    public String getKey() {
        return this.key;
    }

    /**
     * @param key
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryValues withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * 
     * @return The specific value of the Cost Category.
     */

    public java.util.List<String> getValues() {
        return values;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * 
     * @param values
     *        The specific value of the Cost Category.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new java.util.ArrayList<String>(values);
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValues(java.util.Collection)} or {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The specific value of the Cost Category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryValues withValues(String... values) {
        if (this.values == null) {
            setValues(new java.util.ArrayList<String>(values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The specific value of the Cost Category.
     * </p>
     * 
     * @param values
     *        The specific value of the Cost Category.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CostCategoryValues withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getKey() != null)
            sb.append("Key: ").append(getKey()).append(",");
        if (getValues() != null)
            sb.append("Values: ").append(getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CostCategoryValues == false)
            return false;
        CostCategoryValues other = (CostCategoryValues) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public CostCategoryValues clone() {
        try {
            return (CostCategoryValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.CostCategoryValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
