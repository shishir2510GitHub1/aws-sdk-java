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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolutionVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolutionVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the new solution version.
     * </p>
     */
    private String solutionVersionArn;

    /**
     * <p>
     * The ARN of the new solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The ARN of the new solution version.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the new solution version.
     * </p>
     * 
     * @return The ARN of the new solution version.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the new solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The ARN of the new solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionVersionResult withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
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
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSolutionVersionResult == false)
            return false;
        CreateSolutionVersionResult other = (CreateSolutionVersionResult) obj;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolutionVersionResult clone() {
        try {
            return (CreateSolutionVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
