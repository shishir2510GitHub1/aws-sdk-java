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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration to orchestrate agents to create and report agent profiles of the profiling group. Agents are
 * orchestrated if they follow the agent orchestration protocol.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AgentOrchestrationConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AgentOrchestrationConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * If the agents should be enabled to create and report profiles.
     * </p>
     */
    private Boolean profilingEnabled;

    /**
     * <p>
     * If the agents should be enabled to create and report profiles.
     * </p>
     * 
     * @param profilingEnabled
     *        If the agents should be enabled to create and report profiles.
     */

    public void setProfilingEnabled(Boolean profilingEnabled) {
        this.profilingEnabled = profilingEnabled;
    }

    /**
     * <p>
     * If the agents should be enabled to create and report profiles.
     * </p>
     * 
     * @return If the agents should be enabled to create and report profiles.
     */

    public Boolean getProfilingEnabled() {
        return this.profilingEnabled;
    }

    /**
     * <p>
     * If the agents should be enabled to create and report profiles.
     * </p>
     * 
     * @param profilingEnabled
     *        If the agents should be enabled to create and report profiles.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AgentOrchestrationConfig withProfilingEnabled(Boolean profilingEnabled) {
        setProfilingEnabled(profilingEnabled);
        return this;
    }

    /**
     * <p>
     * If the agents should be enabled to create and report profiles.
     * </p>
     * 
     * @return If the agents should be enabled to create and report profiles.
     */

    public Boolean isProfilingEnabled() {
        return this.profilingEnabled;
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
        if (getProfilingEnabled() != null)
            sb.append("ProfilingEnabled: ").append(getProfilingEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AgentOrchestrationConfig == false)
            return false;
        AgentOrchestrationConfig other = (AgentOrchestrationConfig) obj;
        if (other.getProfilingEnabled() == null ^ this.getProfilingEnabled() == null)
            return false;
        if (other.getProfilingEnabled() != null && other.getProfilingEnabled().equals(this.getProfilingEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfilingEnabled() == null) ? 0 : getProfilingEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AgentOrchestrationConfig clone() {
        try {
            return (AgentOrchestrationConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.AgentOrchestrationConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
