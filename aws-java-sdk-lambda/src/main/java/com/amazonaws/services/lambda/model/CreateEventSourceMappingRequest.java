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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lambda-2015-03-31/CreateEventSourceMapping" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEventSourceMappingRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     */
    private String eventSourceArn;
    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     */
    private String functionName;
    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     */
    private Integer batchSize;
    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     */
    private Integer parallelizationFactor;
    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     */
    private java.util.Date startingPositionTimestamp;
    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     */
    private DestinationConfig destinationConfig;
    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     */
    private Integer maximumRecordAgeInSeconds;
    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     */
    private Boolean bisectBatchOnFunctionError;
    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     */
    private Integer maximumRetryAttempts;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *        </p>
     *        </li>
     */

    public void setEventSourceArn(String eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The Amazon Resource Name (ARN) of the event source.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *         </p>
     *         </li>
     */

    public String getEventSourceArn() {
        return this.eventSourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the event source.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventSourceArn
     *        The Amazon Resource Name (ARN) of the event source.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - The ARN of the data stream or a stream consumer.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - The ARN of the stream.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - The ARN of the queue.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEventSourceArn(String eventSourceArn) {
        setEventSourceArn(eventSourceArn);
        return this;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it's limited to
     *        64 characters in length.
     */

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @return The name of the Lambda function.</p>
     *         <p class="title">
     *         <b>Name formats</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Function name</b> - <code>MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         The length constraint applies only to the full ARN. If you specify only the function name, it's limited
     *         to 64 characters in length.
     */

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * <p>
     * The name of the Lambda function.
     * </p>
     * <p class="title">
     * <b>Name formats</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Function name</b> - <code>MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The length constraint applies only to the full ARN. If you specify only the function name, it's limited to 64
     * characters in length.
     * </p>
     * 
     * @param functionName
     *        The name of the Lambda function.</p>
     *        <p class="title">
     *        <b>Name formats</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Function name</b> - <code>MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Function ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Version or Alias ARN</b> - <code>arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Partial ARN</b> - <code>123456789012:function:MyFunction</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        The length constraint applies only to the full ARN. If you specify only the function name, it's limited to
     *        64 characters in length.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withFunctionName(String functionName) {
        setFunctionName(functionName);
        return this;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @param enabled
     *        Disables the event source mapping to pause polling and invocation.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @return Disables the event source mapping to pause polling and invocation.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @param enabled
     *        Disables the event source mapping to pause polling and invocation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Disables the event source mapping to pause polling and invocation.
     * </p>
     * 
     * @return Disables the event source mapping to pause polling and invocation.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *        </p>
     *        </li>
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The maximum number of items to retrieve in a single batch.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *         </p>
     *         </li>
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of items to retrieve in a single batch.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchSize
     *        The maximum number of items to retrieve in a single batch.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>Amazon Kinesis</b> - Default 100. Max 10,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon DynamoDB Streams</b> - Default 100. Max 1,000.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon Simple Queue Service</b> - Default 10. Max 10.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum amount of time to gather records before invoking the function, in seconds.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @return The maximum amount of time to gather records before invoking the function, in seconds.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum amount of time to gather records before invoking the function, in seconds.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum amount of time to gather records before invoking the function, in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams) The number of batches to process from each shard concurrently.
     */

    public void setParallelizationFactor(Integer parallelizationFactor) {
        this.parallelizationFactor = parallelizationFactor;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @return (Streams) The number of batches to process from each shard concurrently.
     */

    public Integer getParallelizationFactor() {
        return this.parallelizationFactor;
    }

    /**
     * <p>
     * (Streams) The number of batches to process from each shard concurrently.
     * </p>
     * 
     * @param parallelizationFactor
     *        (Streams) The number of batches to process from each shard concurrently.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withParallelizationFactor(Integer parallelizationFactor) {
        setParallelizationFactor(parallelizationFactor);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @return The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *         Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @see EventSourcePosition
     */

    public void setStartingPosition(EventSourcePosition startingPosition) {
        withStartingPosition(startingPosition);
    }

    /**
     * <p>
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB Streams
     * sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * </p>
     * 
     * @param startingPosition
     *        The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon DynamoDB
     *        Streams sources. <code>AT_TIMESTAMP</code> is only supported for Amazon Kinesis streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourcePosition
     */

    public CreateEventSourceMappingRequest withStartingPosition(EventSourcePosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     */

    public void setStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        this.startingPositionTimestamp = startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @return With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start
     *         reading.
     */

    public java.util.Date getStartingPositionTimestamp() {
        return this.startingPositionTimestamp;
    }

    /**
     * <p>
     * With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * </p>
     * 
     * @param startingPositionTimestamp
     *        With <code>StartingPosition</code> set to <code>AT_TIMESTAMP</code>, the time from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withStartingPositionTimestamp(java.util.Date startingPositionTimestamp) {
        setStartingPositionTimestamp(startingPositionTimestamp);
        return this;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public void setDestinationConfig(DestinationConfig destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @return (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     */

    public DestinationConfig getDestinationConfig() {
        return this.destinationConfig;
    }

    /**
     * <p>
     * (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * </p>
     * 
     * @param destinationConfig
     *        (Streams) An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withDestinationConfig(DestinationConfig destinationConfig) {
        setDestinationConfig(destinationConfig);
        return this;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams) The maximum age of a record that Lambda sends to a function for processing.
     */

    public void setMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        this.maximumRecordAgeInSeconds = maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @return (Streams) The maximum age of a record that Lambda sends to a function for processing.
     */

    public Integer getMaximumRecordAgeInSeconds() {
        return this.maximumRecordAgeInSeconds;
    }

    /**
     * <p>
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * </p>
     * 
     * @param maximumRecordAgeInSeconds
     *        (Streams) The maximum age of a record that Lambda sends to a function for processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withMaximumRecordAgeInSeconds(Integer maximumRecordAgeInSeconds) {
        setMaximumRecordAgeInSeconds(maximumRecordAgeInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams) If the function returns an error, split the batch in two and retry.
     */

    public void setBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        this.bisectBatchOnFunctionError = bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     */

    public Boolean getBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @param bisectBatchOnFunctionError
     *        (Streams) If the function returns an error, split the batch in two and retry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withBisectBatchOnFunctionError(Boolean bisectBatchOnFunctionError) {
        setBisectBatchOnFunctionError(bisectBatchOnFunctionError);
        return this;
    }

    /**
     * <p>
     * (Streams) If the function returns an error, split the batch in two and retry.
     * </p>
     * 
     * @return (Streams) If the function returns an error, split the batch in two and retry.
     */

    public Boolean isBisectBatchOnFunctionError() {
        return this.bisectBatchOnFunctionError;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams) The maximum number of times to retry when the function returns an error.
     */

    public void setMaximumRetryAttempts(Integer maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @return (Streams) The maximum number of times to retry when the function returns an error.
     */

    public Integer getMaximumRetryAttempts() {
        return this.maximumRetryAttempts;
    }

    /**
     * <p>
     * (Streams) The maximum number of times to retry when the function returns an error.
     * </p>
     * 
     * @param maximumRetryAttempts
     *        (Streams) The maximum number of times to retry when the function returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEventSourceMappingRequest withMaximumRetryAttempts(Integer maximumRetryAttempts) {
        setMaximumRetryAttempts(maximumRetryAttempts);
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
        if (getEventSourceArn() != null)
            sb.append("EventSourceArn: ").append(getEventSourceArn()).append(",");
        if (getFunctionName() != null)
            sb.append("FunctionName: ").append(getFunctionName()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getParallelizationFactor() != null)
            sb.append("ParallelizationFactor: ").append(getParallelizationFactor()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getStartingPositionTimestamp() != null)
            sb.append("StartingPositionTimestamp: ").append(getStartingPositionTimestamp()).append(",");
        if (getDestinationConfig() != null)
            sb.append("DestinationConfig: ").append(getDestinationConfig()).append(",");
        if (getMaximumRecordAgeInSeconds() != null)
            sb.append("MaximumRecordAgeInSeconds: ").append(getMaximumRecordAgeInSeconds()).append(",");
        if (getBisectBatchOnFunctionError() != null)
            sb.append("BisectBatchOnFunctionError: ").append(getBisectBatchOnFunctionError()).append(",");
        if (getMaximumRetryAttempts() != null)
            sb.append("MaximumRetryAttempts: ").append(getMaximumRetryAttempts());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEventSourceMappingRequest == false)
            return false;
        CreateEventSourceMappingRequest other = (CreateEventSourceMappingRequest) obj;
        if (other.getEventSourceArn() == null ^ this.getEventSourceArn() == null)
            return false;
        if (other.getEventSourceArn() != null && other.getEventSourceArn().equals(this.getEventSourceArn()) == false)
            return false;
        if (other.getFunctionName() == null ^ this.getFunctionName() == null)
            return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getParallelizationFactor() == null ^ this.getParallelizationFactor() == null)
            return false;
        if (other.getParallelizationFactor() != null && other.getParallelizationFactor().equals(this.getParallelizationFactor()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getStartingPositionTimestamp() == null ^ this.getStartingPositionTimestamp() == null)
            return false;
        if (other.getStartingPositionTimestamp() != null && other.getStartingPositionTimestamp().equals(this.getStartingPositionTimestamp()) == false)
            return false;
        if (other.getDestinationConfig() == null ^ this.getDestinationConfig() == null)
            return false;
        if (other.getDestinationConfig() != null && other.getDestinationConfig().equals(this.getDestinationConfig()) == false)
            return false;
        if (other.getMaximumRecordAgeInSeconds() == null ^ this.getMaximumRecordAgeInSeconds() == null)
            return false;
        if (other.getMaximumRecordAgeInSeconds() != null && other.getMaximumRecordAgeInSeconds().equals(this.getMaximumRecordAgeInSeconds()) == false)
            return false;
        if (other.getBisectBatchOnFunctionError() == null ^ this.getBisectBatchOnFunctionError() == null)
            return false;
        if (other.getBisectBatchOnFunctionError() != null && other.getBisectBatchOnFunctionError().equals(this.getBisectBatchOnFunctionError()) == false)
            return false;
        if (other.getMaximumRetryAttempts() == null ^ this.getMaximumRetryAttempts() == null)
            return false;
        if (other.getMaximumRetryAttempts() != null && other.getMaximumRetryAttempts().equals(this.getMaximumRetryAttempts()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceArn() == null) ? 0 : getEventSourceArn().hashCode());
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getParallelizationFactor() == null) ? 0 : getParallelizationFactor().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getStartingPositionTimestamp() == null) ? 0 : getStartingPositionTimestamp().hashCode());
        hashCode = prime * hashCode + ((getDestinationConfig() == null) ? 0 : getDestinationConfig().hashCode());
        hashCode = prime * hashCode + ((getMaximumRecordAgeInSeconds() == null) ? 0 : getMaximumRecordAgeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getBisectBatchOnFunctionError() == null) ? 0 : getBisectBatchOnFunctionError().hashCode());
        hashCode = prime * hashCode + ((getMaximumRetryAttempts() == null) ? 0 : getMaximumRetryAttempts().hashCode());
        return hashCode;
    }

    @Override
    public CreateEventSourceMappingRequest clone() {
        return (CreateEventSourceMappingRequest) super.clone();
    }

}
