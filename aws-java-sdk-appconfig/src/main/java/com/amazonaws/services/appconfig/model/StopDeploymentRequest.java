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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/StopDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The environment ID.
     * </p>
     */
    private String environmentId;
    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     */
    private Integer deploymentNumber;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param environmentId
     *        The environment ID.
     */

    public void setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @return The environment ID.
     */

    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param environmentId
     *        The environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentRequest withEnvironmentId(String environmentId) {
        setEnvironmentId(environmentId);
        return this;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     */

    public void setDeploymentNumber(Integer deploymentNumber) {
        this.deploymentNumber = deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @return The sequence number of the deployment.
     */

    public Integer getDeploymentNumber() {
        return this.deploymentNumber;
    }

    /**
     * <p>
     * The sequence number of the deployment.
     * </p>
     * 
     * @param deploymentNumber
     *        The sequence number of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDeploymentRequest withDeploymentNumber(Integer deploymentNumber) {
        setDeploymentNumber(deploymentNumber);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEnvironmentId() != null)
            sb.append("EnvironmentId: ").append(getEnvironmentId()).append(",");
        if (getDeploymentNumber() != null)
            sb.append("DeploymentNumber: ").append(getDeploymentNumber());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDeploymentRequest == false)
            return false;
        StopDeploymentRequest other = (StopDeploymentRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEnvironmentId() == null ^ this.getEnvironmentId() == null)
            return false;
        if (other.getEnvironmentId() != null && other.getEnvironmentId().equals(this.getEnvironmentId()) == false)
            return false;
        if (other.getDeploymentNumber() == null ^ this.getDeploymentNumber() == null)
            return false;
        if (other.getDeploymentNumber() != null && other.getDeploymentNumber().equals(this.getDeploymentNumber()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentId() == null) ? 0 : getEnvironmentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentNumber() == null) ? 0 : getDeploymentNumber().hashCode());
        return hashCode;
    }

    @Override
    public StopDeploymentRequest clone() {
        return (StopDeploymentRequest) super.clone();
    }

}
