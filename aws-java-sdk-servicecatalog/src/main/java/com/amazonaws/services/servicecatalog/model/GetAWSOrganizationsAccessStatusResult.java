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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/GetAWSOrganizationsAccessStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAWSOrganizationsAccessStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     */
    private String accessStatus;

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * 
     * @param accessStatus
     *        The status of the portfolio share feature.
     * @see AccessStatus
     */

    public void setAccessStatus(String accessStatus) {
        this.accessStatus = accessStatus;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * 
     * @return The status of the portfolio share feature.
     * @see AccessStatus
     */

    public String getAccessStatus() {
        return this.accessStatus;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * 
     * @param accessStatus
     *        The status of the portfolio share feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessStatus
     */

    public GetAWSOrganizationsAccessStatusResult withAccessStatus(String accessStatus) {
        setAccessStatus(accessStatus);
        return this;
    }

    /**
     * <p>
     * The status of the portfolio share feature.
     * </p>
     * 
     * @param accessStatus
     *        The status of the portfolio share feature.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccessStatus
     */

    public GetAWSOrganizationsAccessStatusResult withAccessStatus(AccessStatus accessStatus) {
        this.accessStatus = accessStatus.toString();
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
        if (getAccessStatus() != null)
            sb.append("AccessStatus: ").append(getAccessStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAWSOrganizationsAccessStatusResult == false)
            return false;
        GetAWSOrganizationsAccessStatusResult other = (GetAWSOrganizationsAccessStatusResult) obj;
        if (other.getAccessStatus() == null ^ this.getAccessStatus() == null)
            return false;
        if (other.getAccessStatus() != null && other.getAccessStatus().equals(this.getAccessStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessStatus() == null) ? 0 : getAccessStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetAWSOrganizationsAccessStatusResult clone() {
        try {
            return (GetAWSOrganizationsAccessStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
